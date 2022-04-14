package restaurant.backend.controller;


import lombok.AllArgsConstructor;
import org.springframework.web.bind.annotation.*;
import restaurant.backend.dto.in.ClienteIn;
import restaurant.backend.dto.out.ClienteOut;
import restaurant.backend.service.ClienteService;

import javax.validation.Valid;
import java.util.List;

@RestController
@RequestMapping("/cliente")
@AllArgsConstructor
public class ClienteController {

    private final ClienteService clienteService;

    @GetMapping("/findAll")
    public List<ClienteOut> findAllClientes() {
        return clienteService.findAllClientes();
    }

    @PostMapping
    public ClienteOut save(@Valid @RequestBody ClienteIn in) {
        return clienteService.save(in);
    }

    @DeleteMapping("/{id}")
    public void delete(@PathVariable Long id) {
        clienteService.delete(id);
    }
}
