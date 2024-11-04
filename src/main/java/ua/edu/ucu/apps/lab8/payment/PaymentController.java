package ua.edu.ucu.apps.lab8.payment;

import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;


@RestController
public class PaymentController {
    
    @GetMapping("path")
    public String getPayments(@RequestParam String param) {
        return new String();
    }
    
}
