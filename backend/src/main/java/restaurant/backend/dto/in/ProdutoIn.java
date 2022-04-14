package restaurant.backend.dto.in;

import lombok.Data;

@Data
public class ProdutoIn {

    private Long id;

    private String nome;

    private String descricao;

    private Double preco;

    private CategoriaProdutoIn categoriaProduto;
}
