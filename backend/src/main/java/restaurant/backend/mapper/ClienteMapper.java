package restaurant.backend.mapper;

import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import restaurant.backend.dto.in.ClienteIn;
import restaurant.backend.dto.out.ClienteOut;
import restaurant.backend.entity.Cliente;

import java.util.List;

@Mapper(componentModel = "spring")
public interface ClienteMapper {

    List<ClienteOut> clientesToClientesOut(List<Cliente> clientes);

    ClienteOut clienteToClienteOut (Cliente cliente);

    ClienteIn clienteToClienteIn (Cliente cliente);

    @Mapping(target = "dataRegistro", ignore = true)
    Cliente clienteInToCliente (ClienteIn in);
}
