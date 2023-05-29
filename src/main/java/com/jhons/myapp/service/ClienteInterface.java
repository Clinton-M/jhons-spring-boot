package com.jhons.myapp.service;

import com.jhons.myapp.entity.Cliente;

import java.util.List;

public interface ClienteInterface {
    List<Cliente> obtenerClientes();
    Cliente obtenerPorId(Long id);

    void guardarCliente(Cliente cliente);

    void actualizarCliente(Cliente cliente);

    void eliminarCliente(Long id);
}
