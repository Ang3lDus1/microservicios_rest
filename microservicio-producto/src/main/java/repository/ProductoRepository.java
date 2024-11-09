package com.ejemplo.microservicioproducto.repository;

import com.ejemplo.microservicioproducto.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
