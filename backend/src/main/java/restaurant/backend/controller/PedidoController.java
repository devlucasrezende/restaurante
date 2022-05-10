package restaurant.backend.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import restaurant.backend.dto.in.PedidoIn;
import restaurant.backend.dto.in.ProdutoIn;
import restaurant.backend.dto.out.PedidoOut;
import restaurant.backend.dto.out.ProdutoOut;
import restaurant.backend.service.PedidoService;
import restaurant.backend.service.ProdutoService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/pedido")
@AllArgsConstructor
public class PedidoController {

    private final PedidoService pedidoService;

    @GetMapping("/findAll")
    public List<PedidoOut> findAllPedido() {
        return pedidoService.findAllPedidos();
    }

    @PostMapping
    public void save(@Valid @RequestBody PedidoIn in) {
        pedidoService.save(in);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        pedidoService.delete(id);
    }
}
