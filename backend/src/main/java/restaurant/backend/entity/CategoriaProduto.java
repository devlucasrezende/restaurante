package restaurant.backend.entity;


import lombok.Getter;
import lombok.Setter;
import restaurant.backend.util.ConfigUrl;

import javax.persistence.*;
import java.time.LocalDate;


@Getter
@Setter
@Entity(name = "categoria_produto")
@Table(schema = ConfigUrl.SCHEMA_RESTAURANTE)
public class CategoriaProduto {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

}
