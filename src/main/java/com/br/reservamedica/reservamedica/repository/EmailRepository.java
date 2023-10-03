package com.br.reservamedica.reservamedica.repository;

import com.br.reservamedica.reservamedica.entity.Email;
import org.springframework.data.jpa.repository.JpaRepository;

public interface EmailRepository extends JpaRepository<Email, Long> {
}
