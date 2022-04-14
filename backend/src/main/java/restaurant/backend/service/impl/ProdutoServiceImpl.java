package restaurant.backend.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import restaurant.backend.dto.in.ClienteIn;
import restaurant.backend.dto.in.ProdutoIn;
import restaurant.backend.dto.out.ClienteOut;
import restaurant.backend.dto.out.ProdutoOut;
import restaurant.backend.entity.CategoriaProduto;
import restaurant.backend.mapper.ClienteMapper;
import restaurant.backend.mapper.ProdutoMapper;
import restaurant.backend.respository.CategoriaProdutoRepository;
import restaurant.backend.respository.ClienteRepository;
import restaurant.backend.respository.ProdutoRepository;
import restaurant.backend.service.ClienteService;
import restaurant.backend.service.ProdutoService;

import java.util.List;
import java.util.Optional;

@Service
@AllArgsConstructor
public class ProdutoServiceImpl implements ProdutoService {

    private final ProdutoRepository produtoRepository;
    private final ProdutoMapper produtoMapper;
    private final CategoriaProdutoRepository categoriaProdutoRepository;

    public List<ProdutoOut> findAllProdutos() {
        return produtoMapper.produtosToProdutosOut(produtoRepository.findAll());
    }

    public ProdutoOut save(ProdutoIn in) {
        ProdutoOut produtoOut = produtoMapper.produtoToProdutoOut(produtoRepository.save(produtoMapper.produtoInToProduto(in)));
        Optional<CategoriaProduto> categoriaProduto = categoriaProdutoRepository.findById(in.getCategoriaProduto().getId());
        categoriaProduto.ifPresent(produtoOut::setCategoriaProduto);
        return produtoOut;
    }

    public void delete(Long id) {
        produtoRepository.deleteById(id);
    }
}
