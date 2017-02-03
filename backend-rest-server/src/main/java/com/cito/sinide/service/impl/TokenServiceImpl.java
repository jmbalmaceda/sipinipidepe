package com.cito.sinide.service.impl;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cito.sinide.domain.entity.Token;
import com.cito.sinide.mapper.TokenMapper;
import com.cito.sinide.model.SinideTokenData;
import com.cito.sinide.repository.TokenRepository;
import com.cito.sinide.service.TokenService;
@Component
public class TokenServiceImpl implements TokenService {
	@Autowired
	TokenRepository tokenRepository;
	
	@Override
	public boolean deleteToken(String token) {
		tokenRepository.delete(token);
		return true;
	}

	@Override
	public boolean saveToken(SinideTokenData tokenData) {
		Token token = TokenMapper.INSTANCE.toToken(tokenData);
		token = tokenRepository.save(token);
		return true;
	}

	@Override
	public boolean verifyRefreshToken(String refreshToken) {
		// TODO Auto-generated method stub
		return false;
	}

	@Override
	public boolean verifyToken(String token) {
		return tokenRepository.exists(token);
	}

}
