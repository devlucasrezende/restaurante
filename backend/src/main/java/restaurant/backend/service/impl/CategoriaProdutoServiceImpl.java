package restaurant.backend.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import restaurant.backend.dto.in.CategoriaProdutoIn;
import restaurant.backend.dto.in.ProdutoIn;
import restaurant.backend.dto.out.CategoriaProdutoOut;
import restaurant.backend.dto.out.ProdutoOut;
import restaurant.backend.mapper.CategoriaProdutoMapper;
import restaurant.backend.mapper.ProdutoMapper;
import restaurant.backend.respository.CategoriaProdutoRepository;
import restaurant.backend.respository.ProdutoRepository;
import restaurant.backend.service.CategoriaProdutoService;
import restaurant.backend.service.ProdutoService;

import java.util.List;

@Service
@AllArgsConstructor
public class CategoriaProdutoServiceImpl implements CategoriaProdutoService {

    private final CategoriaProdutoRepository categoriaProdutoRepository;
    private final CategoriaProdutoMapper categoriaProdutoMapper;

    public List<CategoriaProdutoOut> findAllCategoriasProdutos() {
        return categoriaProdutoMapper.categoriasToCategoriasOut(categoriaProdutoRepository.findAll());
    }

    public CategoriaProdutoOut save(CategoriaProdutoIn in) {
        return categoriaProdutoMapper.categoriaProdutoToCategoriaProdutoOut(categoriaProdutoRepository.save(categoriaProdutoMapper.categoriaProdutoInToCategoriaProduto(in)));
    }

    public void delete(Long id) {
        categoriaProdutoRepository.deleteById(id);
    }
}
