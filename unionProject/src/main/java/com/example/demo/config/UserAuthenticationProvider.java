package com.example.demo.config;

import java.util.ArrayList;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.authentication.AuthenticationProvider;
import org.springframework.security.authentication.BadCredentialsException;
import org.springframework.security.authentication.UsernamePasswordAuthenticationToken;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.AuthenticationException;
import org.springframework.security.core.authority.SimpleGrantedAuthority;
import org.springframework.stereotype.Component;

import com.example.demo.service.AccountService;
import com.example.demo.vo.Account;

@Component
public class UserAuthenticationProvider implements AuthenticationProvider{
	
	@Autowired
	AccountService accountService;
	/*
	 * 커스텀 인증을 구현하는 클래스
	 */
	@Override
	public Authentication authenticate(Authentication authentication) throws AuthenticationException{
		String username = authentication.getName();
        String password = (String) authentication.getCredentials();
        
//        UserVO userVO = userService.authenticate(email, password);
        Account account = null;
        try {
        	account = accountService.getUserInfo(username);
        }catch(Exception e) {
        	e.printStackTrace();
        }
        if (account == null)
            throw new BadCredentialsException("Login Error !!");
        account.setPASSWORD(null);
 
        ArrayList<SimpleGrantedAuthority> authorities = new ArrayList<>();
        authorities.add(new SimpleGrantedAuthority("ROLE_USER"));
        return new UsernamePasswordAuthenticationToken(account, null, authorities);
	}

	@Override
	public boolean supports(Class<?> authentication) {
		return authentication.equals(UsernamePasswordAuthenticationToken.class);
	}
	
}
