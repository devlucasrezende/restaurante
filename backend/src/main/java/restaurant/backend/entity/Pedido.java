package restaurant.backend.entity;


import lombok.Getter;
import lombok.Setter;
import restaurant.backend.enums.TamanhoPedido;
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

    @ManyToMany
    @JoinTable(schema = ConfigUrl.SCHEMA_RESTAURANTE, name = "rel_produto_pedido",
    joinColumns = {@JoinColumn(name = "id_pedido")},
    inverseJoinColumns = {@JoinColumn(name = "id_produto")})
    private List<Produto> produtos;

    @Column(name = "QUANTIDADE")
    private Integer quantidade;

    @Column(name = "OBSERVACAO")
    private String observacao;

    @Column(name = "TOTAL")
    private Double total;

    @Column(name = "TAMANHO")
    private TamanhoPedido tamanhoPedido;

    @ManyToOne
    @JoinColumn(name = "ID_CLIENTE", referencedColumnName = "id")
    private Cliente cliente;
}
