package restaurant.backend.entity;


import lombok.Getter;
import lombok.Setter;
import restaurant.backend.util.ConfigUrl;

import javax.persistence.*;


@Getter
@Setter
@Entity(name = "produto")
@Table(schema = ConfigUrl.SCHEMA_RESTAURANTE)
public class Produto {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "NOME")
    private String nome;

    @Column(name = "DESCRICAO")
    private String descricao;

    @Column(name = "PRECO")
    private Double preco;

    @OneToOne
    @JoinColumn(name = "id_categoria", referencedColumnName = "id")
    private CategoriaProduto categoriaProduto;

}
