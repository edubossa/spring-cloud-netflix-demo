package br.com.ews.controllers;

import br.com.ews.domain.Card;
import br.com.ews.domain.Payment;
import br.com.ews.domain.Transaction;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.slf4j.MDC;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.Collection;
import java.util.UUID;

/**
 * Created by wallace on 07/03/17.
 *
 * http://localhost:8081/payments
 */
@RestController
@RequestMapping("/payments")
public class PaymentsCtrl {

    Logger log = LoggerFactory.getLogger(PaymentsCtrl.class);

    /**
     * Pega essa configuracao em primeiro lugar do https://github.com/edubossa/spring-cloud-netflix-demo-config.git
     */
    @Value("${instance.name}")
    String instance;

    @RequestMapping(method = RequestMethod.GET)
    ResponseEntity<Transaction> payments() {
        log.info("PaymentsCtrl.payments --> " + instance);
        Collection<Payment> payments = new ArrayList<>();
        payments.add(new Payment("Television", "1234.89", Card.create()));
        payments.add(new Payment("DVD", "234.00", Card.create()));
        payments.add(new Payment("Option 1", "23.98", Card.create()));
        payments.add(new Payment("Option 2", "43.78", Card.create()));
        payments.add(new Payment("Option 3", "45.87", Card.create()));
        payments.add(new Payment("Option 4", "90.69", Card.create()));
        payments.add(new Payment("Option 5", "89.59", Card.create()));
        payments.add(new Payment("Option 6", "45.87", Card.create()));
        payments.add(new Payment("Option 7", "34.84", Card.create()));
        payments.add(new Payment("Option 8", "12.39", Card.create()));
        payments.add(new Payment("Option 9", "124.23", Card.create()));
        Transaction transaction = new Transaction(instance, payments);
        log.info(transaction.toString());
        return ResponseEntity.ok(transaction);
    }

    @RequestMapping(method = RequestMethod.GET, path = "/direct-pay")
    ResponseEntity<Transaction> directPay() {
        String token = UUID.randomUUID().toString();
        String orderId = UUID.randomUUID().toString().substring(0,8);

        MDC.put("token", token);
        MDC.put("orderId", orderId);

        log.info("Token Gerado -> " + token);
        log.info("OrderId Gerado -> " + orderId);

        log.info("PaymentsCtrl.directPay - INSTANCE NAME --> " + instance);
        Collection<Payment> payments = new ArrayList<>();
        payments.add(new Payment("Monitor", "534.90", Card.create()));
        Transaction transaction = new Transaction(instance, payments);
        transaction.setToken(token);
        log.info(transaction.toString());

        return ResponseEntity.ok(transaction);
    }


}
