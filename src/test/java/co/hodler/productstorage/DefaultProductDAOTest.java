package co.hodler.productstorage;

import static org.junit.Assert.*;

import org.junit.Test;

public class DefaultProductDAOTest {

  private static final String PRODUCT_CODE = "12345678";

  @Test
  public void find_product_retrieves_product() {
    ProductDAO productDAO = new DefaultProductDAO();

    Product product = productDAO.findProductBy(PRODUCT_CODE);

    assertNotNull(product);
  }
}
