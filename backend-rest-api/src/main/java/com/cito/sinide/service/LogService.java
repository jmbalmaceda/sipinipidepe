package com.cito.sinide.service;

import com.cito.sinide.model.SinideLog;
import com.cito.sinide.model.request.LogFindRequest;
import com.cito.sinide.model.response.LogSaveResponse;
import com.cito.sinide.model.response.LogFindResponse;
import com.cito.sinide.model.response.LogUpdateResponse;

public interface LogService {
	LogFindResponse getAll();
	LogFindResponse find(LogFindRequest request);
	LogSaveResponse save(SinideLog log);
	LogUpdateResponse update(SinideLog log);
}
