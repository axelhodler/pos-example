package co.hodler.paymentprocessor;

import org.junit.Before;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;

import static org.mockito.BDDMockito.given;

import org.mockito.runners.MockitoJUnitRunner;

import co.hodler.display.Display;
import co.hodler.productstorage.Product;
import co.hodler.productstorage.ProductDAO;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PaymentProcessorTest {

  @Mock
  ProductDAO productDao;
  @Mock
  Display display;

  @InjectMocks
  PaymentProcessor paymentProcessor;

  private static final String PRODUCT_CODE = "12345";
  private static final String UNKNOWN_PRODUCT_CODE = ":):):):)";
  private static final String PRICE = "$12.83";

  @Before
  public void initialize() {
    Product p = new Product(PRODUCT_CODE, PRICE);
    given(productDao.findProductBy(PRODUCT_CODE)).willReturn(p);
  }

  @Test
  public void buying_invokes_retrieval_of_productinfos() {
    paymentProcessor.buyProductBy(PRODUCT_CODE);

    verify(productDao).findProductBy(PRODUCT_CODE);
  }

  @Test
  public void provide_price_to_display() {
    paymentProcessor.buyProductBy(PRODUCT_CODE);

    verify(display).showPrice(PRICE);
  }

  @Test
  public void display_message_if_product_not_found() {
    given(productDao.findProductBy(UNKNOWN_PRODUCT_CODE)).willReturn(null);

    paymentProcessor.buyProductBy(UNKNOWN_PRODUCT_CODE);

    verify(display).showProductUnknown();
  }
}
