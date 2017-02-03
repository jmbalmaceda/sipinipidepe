package com.cito.sinide.service.impl;

import java.util.ArrayList;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import com.cito.sinide.domain.entity.Log;
import com.cito.sinide.mapper.LogMapper;
import com.cito.sinide.model.SinideLog;
import com.cito.sinide.model.request.LogFindRequest;
import com.cito.sinide.model.response.LogFindResponse;
import com.cito.sinide.model.response.LogSaveResponse;
import com.cito.sinide.model.response.LogUpdateResponse;
import com.cito.sinide.repository.LogRepository;
import com.cito.sinide.service.LogService;

@Component
public class LogServiceImpl implements LogService{
	@Autowired
	LogRepository logRepository;

	@Override
	public LogFindResponse getAll() {
		LogFindResponse salida = new LogFindResponse();
		List<Log> all = logRepository.findAll();
		List<SinideLog> logs = new ArrayList<>();
		for (Log log : all) {
			logs.add(LogMapper.INSTANCE.toSinideLog(log));
		}
		salida.setLogs(logs);
		salida.setResponse(true);
		return salida ;
	}

	@Override
	public LogFindResponse find(LogFindRequest request) {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public LogSaveResponse save(SinideLog sinideLog) {
		LogSaveResponse salida = new LogSaveResponse();
		Log log = LogMapper.INSTANCE.toLog(sinideLog);
		log = logRepository.save(log);
		salida.setLog(LogMapper.INSTANCE.toSinideLog(log));
		salida.setResponse(true);
		return salida ;
	}

	@Override
	public LogUpdateResponse update(SinideLog log) {
		LogUpdateResponse salida = new LogUpdateResponse();
		Log aux = logRepository.findByCreationCode(log.getCreationCode());
		aux.setMessage(log.getMessage());
		logRepository.save(aux);
		SinideLog updatedLog = LogMapper.INSTANCE.toSinideLog(aux);
		salida.setLog(updatedLog);
		salida.setResponse(true);
		return salida ;
	}

}
