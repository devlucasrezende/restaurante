package restaurant.backend.service;

import restaurant.backend.dto.in.CategoriaProdutoIn;
import restaurant.backend.dto.out.CategoriaProdutoOut;

import java.util.List;

public interface CategoriaProdutoService {

    List<CategoriaProdutoOut> findAllCategoriasProdutos();

    CategoriaProdutoOut save(CategoriaProdutoIn in);

    void delete(Long id);
}
