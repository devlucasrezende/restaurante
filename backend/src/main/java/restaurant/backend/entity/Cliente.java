package restaurant.backend.entity;


import lombok.Getter;
import lombok.Setter;
import restaurant.backend.util.ConfigUrl;

import javax.persistence.*;
import java.time.LocalDate;
import java.util.List;


@Getter
@Setter
@Entity(name = "cliente")
@Table(schema = ConfigUrl.SCHEMA_RESTAURANTE)
public class Cliente {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "ENDERECO")
    private String endereco;

    @Column(name = "DATA_REGISTRO")
    private LocalDate dataRegistro = LocalDate.now();

    @Column(name = "TELEFONE")
    private String telefone;

    @Column(name = "CELULAR")
    private String celular;

    @Column(name = "CPF")
    private String cpf;

    @Column(name = "DATA_NASCIMENTO")
    private LocalDate dataNascimento;

}
