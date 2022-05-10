package restaurant.backend.service;

import restaurant.backend.dto.in.PedidoIn;
import restaurant.backend.dto.out.PedidoOut;

import java.util.List;

public interface PedidoService {

    List<PedidoOut> findAllPedidos();

    void save(PedidoIn in);

    void delete(Long id);
}
