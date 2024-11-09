// src/main/java/com/ejemplo/microserviciocliente/repository/ClienteRepository.java
package com.ejemplo.microserviciocliente.repository;

import com.ejemplo.microserviciocliente.model.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepository extends JpaRepository<Cliente, Long> {
}
