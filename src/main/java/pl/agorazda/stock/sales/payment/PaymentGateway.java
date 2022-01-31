package pl.agorazda.stock.sales.payment;

import pl.agorazda.stock.sales.ordering.CustomerDetails;
import pl.agorazda.stock.sales.ordering.PaymentDetails;

import java.math.BigDecimal;

public interface PaymentGateway {
    PaymentDetails register(String id, BigDecimal total, CustomerDetails customerDetails);
}