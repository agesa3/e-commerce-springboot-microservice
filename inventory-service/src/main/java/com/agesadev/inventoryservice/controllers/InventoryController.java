package com.agesadev.inventoryservice.controllers;

import com.agesadev.inventoryservice.dto.InventoryResponse;
import com.agesadev.inventoryservice.services.InventoryServiceImpl;
import lombok.RequiredArgsConstructor;
import org.springframework.http.HttpStatus;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequiredArgsConstructor
@RequestMapping("/api/inventory")
public class InventoryController {

    private final InventoryServiceImpl inventoryService;

    @GetMapping
    @ResponseStatus(HttpStatus.OK)
    public List<InventoryResponse> isProductInStock(@RequestParam List<String> skuCode) {
        return inventoryService.isItemInStock(skuCode);

    }
}
