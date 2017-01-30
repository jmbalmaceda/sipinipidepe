package com.cito.sinide.controller.rest;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import com.cito.sinide.model.SinideLog;
import com.cito.sinide.model.response.LogFindResponse;
import com.cito.sinide.model.response.LogSaveResponse;
import com.cito.sinide.model.response.LogUpdateResponse;
import com.cito.sinide.service.LogService;

@RestController
@RequestMapping("log")
public class LogController {
	@Autowired
	LogService logService;
	
	@RequestMapping(method=RequestMethod.GET)
	ResponseEntity<LogFindResponse> listAll(){
		LogFindResponse salida = logService.getAll();
		return ResponseEntity.ok(salida);
	}
	
	@RequestMapping(method=RequestMethod.POST)
	ResponseEntity<LogSaveResponse> add(@RequestBody SinideLog log){
		LogSaveResponse salida = logService.save(log);
		return ResponseEntity.ok(salida);
	}
	
	@RequestMapping(method=RequestMethod.PUT)
	ResponseEntity<LogUpdateResponse> update(@RequestBody SinideLog log){
		LogUpdateResponse salida = logService.update(log);
		return ResponseEntity.ok(salida);
	}
}
