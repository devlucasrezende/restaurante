package restaurant.backend.dto.in;


import com.fasterxml.jackson.annotation.JsonFormat;
import lombok.Data;
import restaurant.backend.entity.Pedido;

import java.time.LocalDate;
import java.util.List;

@Data
public class ClienteIn {

    private Long id;

    private String nome;

    private String endereco;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataRegistro;

    private String telefone;

    private String celular;

    private String cpf;

    @JsonFormat(pattern = "dd/MM/yyyy")
    private LocalDate dataNascimento;

}
