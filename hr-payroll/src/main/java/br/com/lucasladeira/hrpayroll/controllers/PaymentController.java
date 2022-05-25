package br.com.lucasladeira.hrpayroll.controllers;

import br.com.lucasladeira.hrpayroll.entities.Payment;
import br.com.lucasladeira.hrpayroll.services.PaymentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/payments")
public class PaymentController {

    @Autowired
    private PaymentService paymentService;

    @GetMapping("/{workerId}/days/{days}")
    public ResponseEntity<Payment> getPayment(@PathVariable("workerId") Long workerId,@PathVariable("days") Integer days){
        return ResponseEntity.status(HttpStatus.OK).body(paymentService.getPayment(workerId, days));
    }
}
