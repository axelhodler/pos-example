package co.hodler.productstorage;

public class Product {

  private String id;
  private String string;

  public Product() {
  }

  public Product(String id, String price) {
    this.id = id;
    this.string = price;
  }

  public String getId() {
    return id;
  }

  public void setId(String id) {
    this.id = id;
  }

  public String getString() {
    return string;
  }

  public void setString(String string) {
    this.string = string;
  }

}
