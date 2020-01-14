package com.example.demo.vo;

import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;

public class Account {
	private String USERNAME; 
	private String PASSWORD;
	private boolean ENABLED;
	//Security 추가
	private Collection<? extends GrantedAuthority> authorities;

	public String getUSERNAME() {
		return USERNAME;
	}

	public void setUSERNAME(String uSERNAME) {
		USERNAME = uSERNAME;
	}

	public String getPASSWORD() {
		return PASSWORD;
	}

	public void setPASSWORD(String pASSWORD) {
		PASSWORD = pASSWORD;
	}

	public boolean isENABLED() {
		return ENABLED;
	}

	public void setENABLED(boolean eNABLED) {
		ENABLED = eNABLED;
	}

	public Collection<? extends GrantedAuthority> getAuthorities() {
		return authorities;
	}

	public void setAuthorities(Collection<? extends GrantedAuthority> authorities) {
		this.authorities = authorities;
	}

	@Override
	public String toString() {
		return "Account [USERNAME=" + USERNAME + ", PASSWORD=" + PASSWORD + ", ENABLED=" + ENABLED + ", authorities="
				+ authorities + "]";
	}
	
}