package restaurant.backend.dto.out;

import lombok.Data;
import restaurant.backend.enums.TamanhoPedido;

import java.util.List;

@Data
public class PedidoOut {

    private List<ProdutoOut> produtos;

    private Integer quantidade;

    private String observacao;

    private Double total;

    private TamanhoPedido tamanhoPedido;

    private ClienteOut cliente;
}
