package ma.enset.inventotyservice.repository;

import ma.enset.inventotyservice.entities.Product;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, String> {
}
