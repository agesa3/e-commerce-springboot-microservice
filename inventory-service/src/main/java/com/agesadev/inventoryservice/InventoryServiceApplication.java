package com.agesadev.inventoryservice;

import com.agesadev.inventoryservice.model.Inventory;
import com.agesadev.inventoryservice.repository.InventoryRepository;
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
    public CommandLineRunner loadData(InventoryRepository inventoryRepository) {
        return args -> {
            Inventory inventory = new Inventory();
            inventory.setSkuCode("shoe_item_1");
            inventory.setQuantity(34);

            Inventory inventory3 = new Inventory();
            inventory3.setSkuCode("shoe_item_2");
            inventory3.setQuantity(10);

            inventoryRepository.save(inventory);
            inventoryRepository.save(inventory3);

        };
    }
}
