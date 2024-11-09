package com.ejemplo.microserviciofactura.service;

import com.ejemplo.microserviciofactura.model.Factura;
import com.ejemplo.microserviciofactura.repository.FacturaRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.web.client.RestTemplate;

import java.util.List;
import java.util.Optional;

@Service
public class FacturaService {

    @Autowired
    private FacturaRepository facturaRepository;

    @Autowired
    private RestTemplate restTemplate;  // Inyectamos el RestTemplate

    public List<Factura> findAll() {
        return facturaRepository.findAll();
    }

    public Optional<Factura> findById(Long id) {
        return facturaRepository.findById(id);
    }

    public Factura save(Factura factura) {
        return facturaRepository.save(factura);
    }

    public void deleteById(Long id) {
        facturaRepository.deleteById(id);
    }

    public Object obtenerClientePorId(Long clienteId) {
        String url = "http://localhost:8081/api/clientes/" + clienteId;
        return restTemplate.getForObject(url, Object.class);
    }
}
