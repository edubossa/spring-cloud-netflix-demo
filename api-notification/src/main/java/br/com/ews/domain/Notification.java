package br.com.ews.domain;

/**
 * Created by wallace on 08/03/17.
 */
public class Notification {

    private String token;
    private String type;

    public Notification() {
    }

    public Notification(String token, String type) {
        this.token = token;
        this.type = type;
    }

    public String getToken() {
        return token;
    }

    public void setToken(String token) {
        this.token = token;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    @Override
    public String toString() {
        return "Notification{" +
                "token='" + token + '\'' +
                ", type='" + type + '\'' +
                '}';
    }
}
