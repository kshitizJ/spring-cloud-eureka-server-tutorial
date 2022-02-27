package payment.service.client.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payment-service")
public class PaymentController {

    @GetMapping("/paynow/{price}")
    public String payNow(@PathVariable("price") Integer price) {
        return "payment: " + price;
    }
}
