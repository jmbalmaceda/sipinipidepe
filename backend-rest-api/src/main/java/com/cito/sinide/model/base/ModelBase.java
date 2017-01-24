package com.cito.sinide.model.base;

import org.apache.commons.lang3.builder.ReflectionToStringBuilder;

import java.io.Serializable;

public class ModelBase implements Serializable {

	private static final long serialVersionUID = 8969711645519539903L;

@Override
  public String toString() {
    return ReflectionToStringBuilder.toString(this);
  }

}
