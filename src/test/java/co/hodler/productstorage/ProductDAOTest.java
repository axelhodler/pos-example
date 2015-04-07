package co.hodler.productstorage;

import static org.junit.Assert.*;

import org.junit.Test;

public class ProductDAOTest {

  private static final String PRODUCT_CODE = "12345678";

  @Test
  public void find_product_retrieves_product() {
    ProductDAO productDAO = new ProductDAO();

    Product product = productDAO.findProductBy(PRODUCT_CODE);

    assertNotNull(product);
  }
}
