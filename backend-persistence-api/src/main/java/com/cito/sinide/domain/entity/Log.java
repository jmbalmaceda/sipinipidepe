package com.cito.sinide.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

import com.cito.sinide.domain.OfflineUpdateableStatus;
import com.cito.sinide.domain.base.DomainBase;
import com.cito.sinide.domain.base.OfflineUpdateable;
@Entity
@Table(name = "Log")
public class Log extends DomainBase implements OfflineUpdateable {
	private static final long serialVersionUID = -4825820715120653524L;
	@Id	@Column(name="id")	
	@GeneratedValue(strategy = GenerationType.AUTO)	
	private Long id;
	@Column(name="creation_code")	private String creationCode;
	@Column(name="date")	private Date date;
	@Column(name="message")	private String message;
	@Column(name="confirmation_code")	private String confirmationCode;
	public Long getId() {
		return id;
	}
	public void setId(Long id) {
		this.id = id;
	}
	public String getCreationCode() {
		return creationCode;
	}
	public void setCreationCode(String creationCode) {
		this.creationCode = creationCode;
	}
	public Date getDate() {
		return date;
	}
	public void setDate(Date date) {
		this.date = date;
	}
	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public String getConfirmationCode() {
		return confirmationCode;
	}
	public void setConfirmationCode(String confirmationCode) {
		this.confirmationCode = confirmationCode;
	}
	@Override
	public String getStatus() {
		return OfflineUpdateableStatus.NO_CHANGES.toString();
	}
}
