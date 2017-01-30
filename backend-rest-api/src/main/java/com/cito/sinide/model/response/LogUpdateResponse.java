package com.cito.sinide.model.response;

import com.cito.sinide.model.ResponseModelBase;
import com.cito.sinide.model.SinideLog;

public class LogUpdateResponse extends ResponseModelBase {

	private static final long serialVersionUID = 2451142123622037304L;
	private SinideLog log;
	public SinideLog getLog() {
		return log;
	}
	public void setLog(SinideLog log) {
		this.log = log;
	}
	
	
}
