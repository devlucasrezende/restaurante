package restaurant.backend.respository;


import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.JpaSpecificationExecutor;
import restaurant.backend.entity.CategoriaProduto;
import restaurant.backend.entity.Cliente;

public interface CategoriaProdutoRepository extends JpaRepository<CategoriaProduto, Long>, JpaSpecificationExecutor<CategoriaProduto> {
}
