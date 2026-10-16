
Requirements: JDK 17, Maven 3.8+, internet for first dependency download.

Run each project in a separate terminal:
1) cd inventory-service && mvn spring-boot:run
2) cd shipping-service && mvn spring-boot:run
3) cd api-gateway && mvn spring-boot:run

Postman GET URLs:
- http://localhost:8081/items (direct Inventory)
- http://localhost:8080/inventory/items (Inventory through Gateway)
- http://localhost:8082/shipments (direct Shipping)
- http://localhost:8080/shipping/shipments (Shipping through Gateway)

Expected Inventory JSON:
[{"id":101,"name":"Laptop","quantity":25,"price":55000}]

Expected Shipping JSON:
[{"shipmentId":501,"orderId":101,"destination":"Vijayawada","status":"In Transit"}]

Gateway removes the first path segment using StripPrefix=1 before forwarding.
The sample data is generated in controller methods and is not saved in a database.
