package restaurant.backend.mapper;

import org.mapstruct.Mapper;
import restaurant.backend.dto.in.CategoriaProdutoIn;
import restaurant.backend.dto.in.ProdutoIn;
import restaurant.backend.dto.out.CategoriaProdutoOut;
import restaurant.backend.dto.out.ProdutoOut;
import restaurant.backend.entity.CategoriaProduto;
import restaurant.backend.entity.Produto;
import restaurant.backend.respository.CategoriaProdutoRepository;

import java.util.List;

@Mapper(componentModel = "spring")
public interface CategoriaProdutoMapper {

    List<CategoriaProdutoOut> categoriasToCategoriasOut(List<CategoriaProduto> categoriaProdutos);
    CategoriaProdutoOut categoriaProdutoToCategoriaProdutoOut (CategoriaProduto categoriaProduto);
    CategoriaProduto categoriaProdutoInToCategoriaProduto (CategoriaProdutoIn in);
}
