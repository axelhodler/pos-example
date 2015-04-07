package co.hodler.paymentprocessor;

import co.hodler.display.Display;
import co.hodler.productstorage.Product;
import co.hodler.productstorage.ProductDAO;

public class PaymentProcessor {

  private ProductDAO productDao;
  private Display display;

  public PaymentProcessor(ProductDAO productDao, Display display) {
    this.productDao = productDao;
    this.display = display;
  }

  public void buyProductBy(String productCode) {
    Product p = productDao.findProductBy(productCode);

    if (p != null)
      display.showPrice(p.getPrice());
    else
      display.showProductUnknown();
  }

}
