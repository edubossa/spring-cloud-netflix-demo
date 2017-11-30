package br.com.ews.domain;

import java.util.Collection;
import java.util.UUID;

/**
 * Created by wallace on 13/03/17.
 */
public class Transaction {

    private String instance;
    private String token;

    private Collection<Payment> payments;

    public Transaction() {
    }

    public Transaction(String instance, Collection<Payment> payments) {
        this.instance = instance;
        this.payments = payments;
        this.token = UUID.randomUUID().toString();
    }

    public String getInstance() {
        return instance;
    }

    public void setInstance(String instance) {
        this.instance = instance;
    }

    public Collection<Payment> getPayments() {
        return payments;
    }

    public void setPayments(Collection<Payment> payments) {
        this.payments = payments;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    @Override
    public String toString() {
        return "Transaction{" +
                "instance='" + instance + '\'' +
                ", token='" + token + '\'' +
                ", payments=" + payments +
                '}';
    }
}
