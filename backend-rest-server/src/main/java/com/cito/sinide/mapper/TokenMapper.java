package com.cito.sinide.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cito.sinide.domain.entity.Token;
import com.cito.sinide.model.SinideTokenData;

@Mapper
public interface TokenMapper {
	TokenMapper INSTANCE = Mappers.getMapper(TokenMapper.class);
	
	Token toToken(SinideTokenData tokenData);
	SinideTokenData toSinideTokenData(Token token);
}
