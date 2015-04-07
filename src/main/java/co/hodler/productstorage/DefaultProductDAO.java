package co.hodler.productstorage;

public class DefaultProductDAO implements ProductDAO {

  @Override
  public Product findProductBy(String productCode) {
    return new Product();
  }

}
