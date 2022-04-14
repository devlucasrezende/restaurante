package restaurant.backend.service;

import restaurant.backend.dto.in.ProdutoIn;
import restaurant.backend.dto.out.ProdutoOut;

import java.util.List;

public interface ProdutoService {

    List<ProdutoOut> findAllProdutos();

    ProdutoOut save(ProdutoIn in);

    void delete(Long id);
}
