package restaurant.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import restaurant.backend.dto.in.ClienteIn;
import restaurant.backend.dto.in.ProdutoIn;
import restaurant.backend.dto.out.ClienteOut;
import restaurant.backend.dto.out.ProdutoOut;
import restaurant.backend.entity.Cliente;
import restaurant.backend.entity.Produto;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ProdutoMapper {

    List<ProdutoOut> produtosToProdutosOut(List<Produto> produtos);

    @Mapping(target = "categoriaProduto", ignore = true)
    ProdutoOut produtoToProdutoOut (Produto produto);

    Produto produtoInToProduto (ProdutoIn in);
}
