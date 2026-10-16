package com.example.shipping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;
import java.util.*;
@RestController
public class ShippingController {
 @GetMapping("/shipments")
 public List<Map<String,Object>> getShipments() {
  Map<String,Object> shipment = new LinkedHashMap<>();
  shipment.put("shipmentId",501); shipment.put("orderId",101);
  shipment.put("destination","Vijayawada"); shipment.put("status","In Transit");
  return List.of(shipment);
 }
}