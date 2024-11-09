// src/main/java/com/ejemplo/microserviciocliente/service/ClienteService.java
package com.ejemplo.microserviciocliente.service;

import com.ejemplo.microserviciocliente.model.Cliente;
import com.ejemplo.microserviciocliente.repository.ClienteRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ClienteService {

    @Autowired
    private ClienteRepository clienteRepository;

    public List<Cliente> obtenerTodosLosClientes() {
        return clienteRepository.findAll();
    }

    public Optional<Cliente> obtenerClientePorId(Long id) {
        return clienteRepository.findById(id);
    }

    public Cliente guardarCliente(Cliente cliente) {
        return clienteRepository.save(cliente);
    }

    public void eliminarCliente(Long id) {
        clienteRepository.deleteById(id);
    }

    public Cliente actualizarCliente(Long id, Cliente clienteActualizado) {
        clienteActualizado.setId(id);
        return clienteRepository.save(clienteActualizado);
    }
}
