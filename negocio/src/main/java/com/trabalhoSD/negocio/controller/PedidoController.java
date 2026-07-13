package com.trabalhoSD.negocio.controller;

import com.trabalhoSD.negocio.model.Pedido;
import com.trabalhoSD.negocio.repository.PedidoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/pedidos")
public class PedidoController {

    @Autowired
    private PedidoRepository repository;

    @GetMapping
    public List<Pedido> listarPedidos() {
        return repository.findAll();
    }

    @PostMapping
    public Pedido criarPedido(@RequestBody Pedido pedido) {
        return repository.save(pedido);
    }
}