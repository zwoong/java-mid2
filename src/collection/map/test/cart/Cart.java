package collection.map.test.cart;

import java.util.HashMap;
import java.util.Map;
import java.util.Map.Entry;

public class Cart {
  private Map<Product, Integer> cartMap = new HashMap<>();

  public void add(Product product, int quantity) {
    cartMap.put(product, cartMap.getOrDefault(product, 0) + quantity);
  }

  public void printAll() {
    System.out.println("==모든 상품 출력==");
    for (Entry<Product, Integer> entry : cartMap.entrySet()) {
      System.out.println("상품: " + entry.getKey() + " 수량: " + entry.getValue());
    }
  }

  public void minus(Product product, int quantity) {
    Integer existingQuantity = cartMap.get(product);
    if (existingQuantity == null) {
      return;
    }

    int updatedQuantity = existingQuantity - quantity;
    if (updatedQuantity <= 0) {
      cartMap.remove(product);
    } else {
      cartMap.put(product, updatedQuantity);
    }
  }

}
