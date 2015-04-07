package co.hodler.productscanner;

import co.hodler.paymentprocessor.PaymentProcessor;

public class DefaultBarcodeScanner implements BarcodeScanner {

  private PaymentProcessor paymentProcessor;

  public DefaultBarcodeScanner(PaymentProcessor paymentProcessor) {
    this.paymentProcessor = paymentProcessor;
  }

  public void onScan(String productCode) {
    paymentProcessor.buyProductBy(productCode);
  }

}
