package restaurant.backend.service.impl;


import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import restaurant.backend.dto.in.ClienteIn;
import restaurant.backend.dto.out.ClienteOut;
import restaurant.backend.mapper.ClienteMapper;
import restaurant.backend.respository.ClienteRepository;
import restaurant.backend.service.ClienteService;

import java.util.List;

@Service
@AllArgsConstructor
public class ClienteServiceImpl implements ClienteService {

    private final ClienteRepository clienteRepository;
    private final ClienteMapper clienteMapper;

    public List<ClienteOut> findAllClientes() {
        return clienteMapper.clientesToClientesOut(clienteRepository.findAll());
    }

    public ClienteOut save(ClienteIn in) {
        return clienteMapper.clienteToClienteOut(clienteRepository.save(clienteMapper.clienteInToCliente(in)));
    }

    public void delete(Long id) {
        clienteRepository.deleteById(id);
    }
}
