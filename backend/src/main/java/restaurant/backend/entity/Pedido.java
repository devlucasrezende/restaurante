package restaurant.backend.entity;


import lombok.Getter;
import lombok.Setter;
import restaurant.backend.enums.TamanhoProduto;
import restaurant.backend.util.ConfigUrl;

import javax.persistence.*;
import java.util.List;


@Getter
@Setter
@Entity(name = "pedido")
@Table(schema = ConfigUrl.SCHEMA_RESTAURANTE)
public class Pedido {

    @Id
    @Column(name = "ID")
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    @Column(name = "ID_PRODUTO")
    @OneToMany
    private List<Produto> produtos;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @Column(name = "TOTAL")
    private Double total;

    @Column(name = "TAMANHO")
    private TamanhoProduto tamanhoProduto;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "id")
    private Cliente cliente;
}
