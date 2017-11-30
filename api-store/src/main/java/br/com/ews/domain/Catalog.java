package br.com.ews.domain;

/**
 * Created by wallace on 07/03/17.
 */
public class Catalog {

    private String description;
    private String amount;

    public Catalog() {
    }

    public Catalog(String descricao, String amount) {
        this.description = descricao;
        this.amount = amount;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getAmount() {
        return amount;
    }

    public void setAmount(String amount) {
        this.amount = amount;
    }

    @Override
    public String toString() {
        return "Catalog{" +
                "description='" + description + '\'' +
                ", amount=" + amount +
                '}';
    }
}
