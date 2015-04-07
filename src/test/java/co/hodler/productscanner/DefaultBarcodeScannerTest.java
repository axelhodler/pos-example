package co.hodler.productscanner;

import static org.mockito.Mockito.verify;

import org.junit.Test;
import org.junit.runner.RunWith;
import org.mockito.InjectMocks;
import org.mockito.Mock;
import org.mockito.runners.MockitoJUnitRunner;

import co.hodler.paymentprocessor.PaymentProcessor;

@RunWith(MockitoJUnitRunner.class)
public class DefaultBarcodeScannerTest {

  @Mock
  PaymentProcessor paymentProcessor;

  @InjectMocks
  DefaultBarcodeScanner scanner;

  private static final String PRODUCT_CODE = "12345";

  @Test
  public void provide_productcode_to_payment_processor() {
    scanner.onScan(PRODUCT_CODE);

    verify(paymentProcessor).buyProductBy(PRODUCT_CODE);
  }
}
