package com.cito.sinide.repository;

import org.springframework.data.jpa.repository.JpaRepository;

import com.cito.sinide.domain.entity.Token;

public interface TokenRepository extends JpaRepository<Token, String>{
}
