package co.hodler.productstorage;

public class Product {

  private String id;
  private String price;

  public Product() {
  }

  public Product(String id, String price) {
    this.id = id;
    this.price = price;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getPrice() {
    return price;
  }

  public void setPrice(String price) {
    this.price = price;
  }

}
