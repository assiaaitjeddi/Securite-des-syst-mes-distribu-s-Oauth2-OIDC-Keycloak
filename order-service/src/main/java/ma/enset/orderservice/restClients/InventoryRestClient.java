package ma.enset.orderservice.restClients;

import ma.enset.orderservice.model.Product;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import java.util.List;

//Utiliser pour prenner la liste des produits (car il trouve dans autre service)
@FeignClient(name = "inventoty-service", url = "http://localhost:8087")
public interface InventoryRestClient {

    @GetMapping("/api/products")
    List<Product> getAllProducts();

    @GetMapping("/api/products/{id}")
    Product findProductById(@PathVariable String id);

}