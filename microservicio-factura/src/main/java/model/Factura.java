package com.ejemplo.microserviciofactura.model;

import jakarta.persistence.*;
import java.util.List;

@Entity
public class Factura {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private Long clienteId;
    private Double total;

    @ElementCollection
    private List<Long> listaProductos;  // IDs de productos en la factura

    // Getters y Setters
    public Long getId() { return id; }
    public void setId(Long id) { this.id = id; }

    public Long getClienteId() { return clienteId; }
    public void setClienteId(Long clienteId) { this.clienteId = clienteId; }

    public Double getTotal() { return total; }
    public void setTotal(Double total) { this.total = total; }

    public List<Long> getListaProductos() { return listaProductos; }
    public void setListaProductos(List<Long> listaProductos) { this.listaProductos = listaProductos; }
}
