package restaurant.backend.service;

import restaurant.backend.dto.in.ClienteIn;
import restaurant.backend.dto.out.ClienteOut;

import java.util.List;

public interface ClienteService {

    List<ClienteOut> findAllClientes();
    ClienteOut save(ClienteIn in);
    void delete(Long id);
}
