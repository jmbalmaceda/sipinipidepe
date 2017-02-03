package com.cito.sinide.domain.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cito.sinide.domain.base.DomainBase;

@Entity
@Table(name = "tokens")
public class Token extends DomainBase {

	private static final long serialVersionUID = -6749432652114540812L;
	@Id
	private String token;
	@Column(name="username")
	private String username;
	@Column(name="device")
	private String device;

	public String getToken() {
		return token;
	}
	public void setToken(String token) {
		this.token = token;
	}
	public String getUsername() {
		return username;
	}
	public void setUsername(String username) {
		this.username = username;
	}
	public String getDevice() {
		return device;
	}
	public void setDevice(String device) {
		this.device = device;
	}
}
