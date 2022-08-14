package com.agesadev.inventoryservice.services;

import com.agesadev.inventoryservice.dto.InventoryResponse;

import java.util.List;

public interface InventoryService {

    List<InventoryResponse> isItemInStock(List<String> skuCode);

}
