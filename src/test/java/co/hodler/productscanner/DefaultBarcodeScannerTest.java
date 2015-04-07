package co.hodler.productscanner;

import org.junit.Test;

import co.hodler.productscanner.BarcodeScanner;
import co.hodler.productscanner.DefaultBarcodeScanner;

public class DefaultBarcodeScannerTest {

  private static final String PRODUCT_CODE = "12345";

  @Test
  public void can_receive_product_code() {
    BarcodeScanner scanner = new DefaultBarcodeScanner();

    scanner.onScan(PRODUCT_CODE);
  }
}
