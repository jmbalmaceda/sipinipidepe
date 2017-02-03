package com.cito.sinide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cito.sinide.domain.entity.Log;

public interface LogRepository extends JpaRepository<Log, Long>{
	Log findByCreationCode(String creationCode);
}
