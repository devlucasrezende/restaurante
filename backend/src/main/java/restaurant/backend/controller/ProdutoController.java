package restaurant.backend.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import restaurant.backend.dto.in.ClienteIn;
import restaurant.backend.dto.in.ProdutoIn;
import restaurant.backend.dto.out.ClienteOut;
import restaurant.backend.dto.out.ProdutoOut;
import restaurant.backend.service.ClienteService;
import restaurant.backend.service.ProdutoService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/produto")
@AllArgsConstructor
public class ProdutoController {

    private final ProdutoService produtoService;

    @GetMapping("/findAll")
    public List<ProdutoOut> findAllClientes() {
        return produtoService.findAllProdutos();
    }

    @PostMapping
    public ProdutoOut save(@Valid @RequestBody ProdutoIn in) {
        return produtoService.save(in);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        produtoService.delete(id);
    }
}
