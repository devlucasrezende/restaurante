package restaurant.backend.dto.out;

import lombok.Data;
import restaurant.backend.entity.CategoriaProduto;

@Data
public class ProdutoOut {

    private String nome;

    private String descricao;

    private Double preco;

    private CategoriaProduto categoriaProduto;
}
