package com.cito.sinide.model.response;

import java.util.ArrayList;
import java.util.List;

import com.cito.sinide.model.ResponseModelBase;
import com.cito.sinide.model.SinideLog;

public class LogFindResponse extends ResponseModelBase {
	private static final long serialVersionUID = -438569267186797129L;
	private List<SinideLog> logs = new ArrayList<>();

	public List<SinideLog> getLogs() {
		return logs;
	}

	public void setLogs(List<SinideLog> logs) {
		this.logs = logs;
	}

}
