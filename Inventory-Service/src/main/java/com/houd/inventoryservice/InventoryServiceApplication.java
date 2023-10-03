package com.houd.inventoryservice;

import com.houd.inventoryservice.entities.Product;
import com.houd.inventoryservice.repositories.ProductRepository;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.annotation.Bean;

@SpringBootApplication
public class InventoryServiceApplication {

    public static void main(String[] args) {
        SpringApplication.run(InventoryServiceApplication.class, args);
    }
    @Bean
    CommandLineRunner start(ProductRepository productRepository){
        return args -> {
            productRepository.save(new Product(null,"Computer",788,12));
            productRepository.save(new Product(null,"Printer",788,12));
            productRepository.save(new Product(null,"Phone",788,12));

            productRepository.findAll().forEach(product -> {
                System.out.println(product.toString());
            });
        };
    }

}
