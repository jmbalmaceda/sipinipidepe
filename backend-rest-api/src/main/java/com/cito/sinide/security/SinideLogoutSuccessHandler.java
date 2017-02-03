package com.cito.sinide.security;

import java.io.IOException;

import javax.servlet.ServletException;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.security.core.Authentication;
import org.springframework.security.web.authentication.logout.LogoutSuccessHandler;
import org.springframework.stereotype.Component;

import com.cito.sinide.service.TokenService;

@Component
public class SinideLogoutSuccessHandler implements LogoutSuccessHandler {
	@Value("${sinide.token.header}")
	private String tokenHeader;
	
	@Autowired
	TokenService tokenService;
	
	@Override
	public void onLogoutSuccess(HttpServletRequest paramHttpServletRequest,
			HttpServletResponse paramHttpServletResponse,
			Authentication paramAuthentication) throws IOException,
			ServletException {
		String authToken = paramHttpServletRequest.getHeader(this.tokenHeader);
		tokenService.deleteToken(authToken);
		
	}

}
