package restaurant.backend.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import restaurant.backend.dto.in.CategoriaProdutoIn;
import restaurant.backend.dto.in.ClienteIn;
import restaurant.backend.dto.out.CategoriaProdutoOut;
import restaurant.backend.dto.out.ClienteOut;
import restaurant.backend.service.CategoriaProdutoService;
import restaurant.backend.service.ClienteService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/categoriaProduto")
@AllArgsConstructor
public class CategoriaProdutoController {

    private final CategoriaProdutoService categoriaProdutoService;

    @GetMapping("/findAll")
    public List<CategoriaProdutoOut> findAllClientes() {
        return categoriaProdutoService.findAllCategoriasProdutos();
    }

    @PostMapping
    public CategoriaProdutoOut save(@Valid @RequestBody CategoriaProdutoIn in) {
        return categoriaProdutoService.save(in);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        categoriaProdutoService.delete(id);
    }
}
