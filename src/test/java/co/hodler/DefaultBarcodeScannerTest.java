package co.hodler;

import org.junit.Test;

public class DefaultBarcodeScannerTest {

  private static final String PRODUCT_CODE = "12345";

  @Test
  public void can_receive_product_code() {
    BarcodeScanner scanner = new DefaultBarcodeScanner();

    scanner.onScan(PRODUCT_CODE);
  }
}
