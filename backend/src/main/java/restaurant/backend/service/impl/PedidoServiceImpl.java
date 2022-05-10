package restaurant.backend.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import restaurant.backend.dto.in.PedidoIn;
import restaurant.backend.dto.out.PedidoOut;
import restaurant.backend.entity.Cliente;
import restaurant.backend.entity.Pedido;
import restaurant.backend.entity.Produto;
import restaurant.backend.mapper.ClienteMapper;
import restaurant.backend.mapper.PedidoMapper;
import restaurant.backend.mapper.ProdutoMapper;
import restaurant.backend.respository.ClienteRepository;
import restaurant.backend.respository.PedidoRepository;
import restaurant.backend.respository.ProdutoRepository;
import restaurant.backend.service.PedidoService;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class PedidoServiceImpl implements PedidoService {

    private final ProdutoRepository produtoRepository;
    private final PedidoMapper pedidoMapper;
    private final PedidoRepository pedidoRepository;
    private final ClienteRepository clienteRepository;

    public List<PedidoOut> findAllPedidos() {
        return pedidoMapper.pedidosToPedidosOut(pedidoRepository.findAll());
    }

    public void save(PedidoIn in) {
        Pedido pedido = pedidoMapper.pedidoInToPedido(in);
        List<Produto> produtos = new ArrayList<>();
        in.getProdutos().forEach(produto -> {
            Optional<Produto> produtoBanco = produtoRepository.findById(produto.getId());
            produtoBanco.ifPresent(produtos::add);
        });
        pedido.setProdutos(produtos);
        Optional<Cliente> clienteBanco = clienteRepository.findById(in.getCliente().getId());
        clienteBanco.ifPresent(pedido::setCliente);

        pedidoRepository.save(pedido);

    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }
}
