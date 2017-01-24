package com.cito.sinide.domain.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class DomainBase implements Serializable {
	private static final long serialVersionUID = -6774701948011263704L;

	@Override
	public String toString() {
		return ReflectionToStringBuilder.toString(this);
	}

}
