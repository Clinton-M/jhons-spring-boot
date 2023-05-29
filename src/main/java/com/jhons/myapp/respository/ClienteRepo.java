package com.jhons.myapp.respository;

import com.jhons.myapp.entity.Cliente;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClienteRepo extends JpaRepository<Cliente, Long> {
}
