package co.hodler.paymentprocessor;

import co.hodler.productstorage.ProductDAO;

public class PaymentProcessor {

  private ProductDAO productDao;

  public PaymentProcessor(ProductDAO productDao) {
    this.productDao = productDao;
  }

  public void buyProductBy(String productCode) {
    productDao.findProductBy(productCode);
  }

}
