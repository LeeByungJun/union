package com.example.demo.config;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Configuration;
import org.springframework.security.config.annotation.authentication.builders.AuthenticationManagerBuilder;
import org.springframework.security.config.annotation.web.builders.HttpSecurity;
import org.springframework.security.config.annotation.web.builders.WebSecurity;
import org.springframework.security.config.annotation.web.configuration.EnableWebSecurity;
import org.springframework.security.config.annotation.web.configuration.WebSecurityConfigurerAdapter;

@Configuration
@EnableWebSecurity
public class WebSecurityConfig extends WebSecurityConfigurerAdapter{
	
	@Autowired
	private UserAuthenticationProvider authenticationProvider;
	
	/*
	 * 스프링 시큐리티 룰을 무시하게 하는 Url 규칙
	 */
	@Override
	public void configure(WebSecurity web) throws Exception {
		web.ignoring().antMatchers("/css/**","/script/**","image/**","/fonts/**","lib/**");
	}
	/*
	 * 스프링 시큐리티 룰
	 */
	@Override
    protected void configure(HttpSecurity http) throws Exception {
		//1. 인증이 필요한 경로와 필요하지 않은 경로 설정
//        http.authorizeRequests()
//                .antMatchers("/css/**", "/js/**", "/img/**").permitAll() //정적자원에 대해서는 인증없이 접근가능하도록 완전 허용
//                .antMatchers("/auth/admin/**").hasRole("ADMIN") // 내부적으로 접두어 "ROLE_"가 붙는다. 해당 경로 접근 시, ROLE_ADMIN권한필요
//                .antMatchers("/auth/**").hasAnyRole("ADMIN", "USER") // 내부적으로 접두어 "ROLE_"가 붙는다. ROLE_ADMIN, ROLE_USER 권한 중 하나
//                .anyRequest().authenticated(); //나머지 요청은 인증된 사용자만 접근
		http.authorizeRequests()
				  .antMatchers("/admin.**").hasRole("ADMIN")
				  .antMatchers("/**").permitAll();
        //2. 로그인폼에 관련된 속성
        http.formLogin()
                .loginPage("/login") // default
                .loginProcessingUrl("/authenticate") //로그인 페이지의 form 태그의 action 속성에 지정할 URL(Security 인증루틴 실행)
                .failureUrl("/login?error") // default (인증실패 시 돌아갈 경로 설정)
                .defaultSuccessUrl("/home")
                .usernameParameter("USERNAME") //로그인 페이지의 username 파라미터
                .passwordParameter("PASSWORD") //로그인 페이지의 password 파라미터
                .permitAll(); //로그인 페이지의 접근 완전 허용
        //3. 로그아웃 관련 속성
        http.logout()
                .logoutUrl("/logout") // default
                .logoutSuccessUrl("/login")
                .permitAll();
    }
	/*
	 * 스프링 시큐리티가 사용자를 인증하는 방법이 담긴 객체
	 */
    @Override
    protected void configure(AuthenticationManagerBuilder auth) {
        auth.authenticationProvider(authenticationProvider);
    }
}