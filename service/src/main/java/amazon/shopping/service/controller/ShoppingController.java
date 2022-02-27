package amazon.shopping.service.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.client.RestTemplate;

@RestController
public class ShoppingController {

    @Autowired
    private RestTemplate template;

    @GetMapping("/amazon-shopping/{price}")
    public String invokePaymentService(@PathVariable("price") Integer price) {
        String url = "http://PAYMENT-SERVICE/payment-service/paynow/" + price;
        return template.getForObject(url, String.class);
    }
}
