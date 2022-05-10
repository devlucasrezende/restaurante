package restaurant.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import restaurant.backend.dto.in.PedidoIn;
import restaurant.backend.dto.in.ProdutoIn;
import restaurant.backend.dto.out.PedidoOut;
import restaurant.backend.dto.out.ProdutoOut;
import restaurant.backend.entity.Pedido;
import restaurant.backend.entity.Produto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface PedidoMapper {

    List<PedidoOut> pedidosToPedidosOut(List<Pedido> pedidos);

    @Mapping(target = "produtos", ignore = true)
    @Mapping(target = "cliente", ignore = true)
    PedidoOut pedidoToPedidoOut (Pedido pedido);

    @Mapping(target = "id", ignore = true)
    @Mapping(target = "produtos", ignore = true)
    @Mapping(target = "cliente", ignore = true)
    Pedido pedidoInToPedido (PedidoIn in);
}
