package com.cito.sinide.model.response;

import com.cito.sinide.model.ResponseModelBase;
import com.cito.sinide.model.SinideLog;

public class LogSaveResponse extends ResponseModelBase {
	private static final long serialVersionUID = -9093923822366037996L;
	private SinideLog log;

	public SinideLog getLog() {
		return log;
	}

	public void setLog(SinideLog log) {
		this.log = log;
	}
}
