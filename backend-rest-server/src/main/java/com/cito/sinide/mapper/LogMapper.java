package com.cito.sinide.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.factory.Mappers;

import com.cito.sinide.domain.entity.Log;
import com.cito.sinide.model.SinideLog;

@Mapper
public interface LogMapper {
	LogMapper INSTANCE = Mappers.getMapper(LogMapper.class);
	
	SinideLog toSinideLog(Log log);
	Log toLog(SinideLog sinideLog);
}
