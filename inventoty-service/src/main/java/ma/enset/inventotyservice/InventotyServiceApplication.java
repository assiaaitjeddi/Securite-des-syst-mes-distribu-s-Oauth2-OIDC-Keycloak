package ma.enset.inventotyservice;

import ma.enset.inventotyservice.entities.Product;
import ma.enset.inventotyservice.repository.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

import java.util.UUID;

@SpringBootApplication
public class InventotyServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventotyServiceApplication.class, args);
    }

    @Bean
    CommandLineRunner commandLineRunner(ProductRepository productRepository){
        return args -> {
            productRepository.save(Product.builder().id("P01").name("Computer").price(6000.39).quantity(13).build());
            productRepository.save(Product.builder().id("P02").name("Smart Phone").price(10000).quantity(20).build());
            productRepository.save(Product.builder().id("P03").name("Printer").price(2300).quantity(10).build());
        };
    }
}
