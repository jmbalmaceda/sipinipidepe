package com.cito.sinide.domain.entity;

import java.util.Date;

import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;

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

	
}
