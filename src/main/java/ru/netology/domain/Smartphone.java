package ru.netology.domain;

public class Smartphone extends Product {
    private String producer;

    public Smartphone() {
        super();
    }

    public Smartphone(int id, String name, int price, String producer) {
        super(id, name, price);
        this.producer = producer;
    }

    public void setProducer(String producer) {
        this.producer = producer;
    }

    public String getProducer() {
        return producer;
    }

    public boolean matches(String search) {
        if (super.matches(search)) {
            return true;
        }
        if (getProducer().equalsIgnoreCase(search)) {
            return true;
        }
        return false;
    }
}
