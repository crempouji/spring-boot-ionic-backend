package com.nelioalves.cursomc.services;

import com.nelioalves.cursomc.domain.Pedido;
import com.nelioalves.cursomc.repositories.PedidoRepository;
import com.nelioalves.cursomc.services.exceptions.ObjectNotFoundException;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.Optional;

@Service
@RequiredArgsConstructor()
public class PedidoService {

    private final PedidoRepository pedidoRepository;

    public Pedido find(Integer id) {
        Optional<Pedido> obj = pedidoRepository.findById(id);
        return obj.orElseThrow(() -> new ObjectNotFoundException(
                "Pedido não encontrado! Id: " + id + ", Tipo: " + Pedido.class.getName()));
    }
}
