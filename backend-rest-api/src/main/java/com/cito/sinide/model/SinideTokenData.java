package com.cito.sinide.model;

import java.util.Date;

/**
 * Clase con la información que se persiste para la verificación del token.
 * @author cito
 *
 */
public class SinideTokenData {
	private String token;
	private String refreshToken;
	private String username;
	private String device;
	private Date tokenExpirationDate;
	private Date refreshTokenExpirationDate;

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getRefreshToken() {
		return refreshToken;
	}
	public void setRefreshToken(String refreshToken) {
		this.refreshToken = refreshToken;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
	public Date getTokenExpirationDate() {
		return tokenExpirationDate;
	}
	public void setTokenExpirationDate(Date tokenExpirationDate) {
		this.tokenExpirationDate = tokenExpirationDate;
	}
	public Date getRefreshTokenExpirationDate() {
		return refreshTokenExpirationDate;
	}
	public void setRefreshTokenExpirationDate(Date refreshTokenExpirationDate) {
		this.refreshTokenExpirationDate = refreshTokenExpirationDate;
	}
}
