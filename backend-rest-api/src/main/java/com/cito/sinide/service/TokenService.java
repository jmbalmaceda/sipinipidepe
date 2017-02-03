package com.cito.sinide.service;

import com.cito.sinide.model.SinideTokenData;

public interface TokenService {
	boolean saveToken(SinideTokenData tokenData);
	boolean verifyToken(String token);
	boolean deleteToken(String token);
	boolean verifyRefreshToken(String refreshToken);
}
