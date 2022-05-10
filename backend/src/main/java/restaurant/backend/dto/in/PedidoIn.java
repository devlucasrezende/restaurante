package restaurant.backend.dto.in;

import lombok.Data;
import restaurant.backend.enums.TamanhoPedido;

import java.util.List;

@Data
public class PedidoIn {

    private Long id;

    private List<ProdutoIn> produtos;

    private Integer quantidade;

    private String observacao;

    private Double total;

    private TamanhoPedido tamanhoPedido;

    private ClienteIn cliente;
}
