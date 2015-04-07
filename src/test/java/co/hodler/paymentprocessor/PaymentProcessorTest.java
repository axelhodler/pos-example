package co.hodler.paymentprocessor;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import co.hodler.productstorage.ProductDAO;
import static org.mockito.Mockito.verify;

@RunWith(MockitoJUnitRunner.class)
public class PaymentProcessorTest {

  @Mock
  ProductDAO productDao;

  @InjectMocks
  PaymentProcessor paymentProcessor;

  private static final String PRODUCT_CODE = "12345";

  @Test
  public void buying_invokes_retrieval_of_productinfos() {
    paymentProcessor.buyProductBy(PRODUCT_CODE);

    verify(productDao).findProductBy(PRODUCT_CODE);
  }
}
