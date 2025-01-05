package ma.enset.inventotyservice.web;

import ma.enset.inventotyservice.entities.Product;
import ma.enset.inventotyservice.repository.ProductRepository;
import org.springframework.security.core.Authentication;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api")
// @CrossOrigin("*")
public class ProductRestController {

    private ProductRepository productRepository;

    public ProductRestController(ProductRepository productRepository) {
        this.productRepository = productRepository;
    }

    @GetMapping("/products")
    public List<Product> productList(){
        return productRepository.findAll();
    }

    @GetMapping("/products/{id}")
    public Product  productById(@PathVariable String id){
        return productRepository.findById(id).get();
    }


    @GetMapping("/auth")
    public Authentication authentication(Authentication authentication){
        return authentication;
    }
}
