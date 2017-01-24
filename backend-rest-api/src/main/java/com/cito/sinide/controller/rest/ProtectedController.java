package com.cito.sinide.controller.rest;

import javax.servlet.http.HttpServletRequest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.security.access.prepost.PreAuthorize;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cito.sinide.security.TokenUtils;

@RestController
public class ProtectedController {
	@Autowired
	private TokenUtils tokenUtils;
	@Value("${cerberus.token.header}")
	private String tokenHeader;

	/**
  This is an example of some different kinds of granular restriction for endpoints. You can use the built-in SPEL expressions
  in @PreAuthorize such as 'hasRole()' to determine if a user has access. However, if you require logic beyond the methods
  Spring provides then you can encapsulate it in a service and register it as a bean to use it within the annotation as
  demonstrated below with 'securityService'.
	 **/
	@RequestMapping(method = RequestMethod.GET, value="${cerberus.route.protected}")
	//@PreAuthorize("hasRole('ADMIN')")
	@PreAuthorize("@securityService.hasProtectedAccess()")
	public ResponseEntity<?> getDaHoney() {
		return ResponseEntity.ok(":O");
	}

	@RequestMapping(method = RequestMethod.GET, value="me")
	@PreAuthorize("hasRole('USER')")
	public ResponseEntity<?> anotherMe(HttpServletRequest request){
		System.out.println("Atroden");
		String token = request.getHeader(this.tokenHeader);
		String username = this.tokenUtils.getUsernameFromToken(token);
		return ResponseEntity.ok("Hello "+username);  
	}
}
