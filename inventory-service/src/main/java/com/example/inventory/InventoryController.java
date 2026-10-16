package com.example.inventory;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class InventoryController {
 @GetMapping("/items")
 public List<Map<String,Object>> getItems() {
  Map<String,Object> item = new LinkedHashMap<>();
  item.put("id",101); item.put("name","Laptop"); item.put("quantity",25); item.put("price",55000);
  return List.of(item);
 }
}