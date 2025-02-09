package org.example.model;

public class Coke extends ProductForSale{
    private String whereFrom;

    public Coke(String type, double price, String description) {
        super(type, price, description);
    }

    public Coke(String type, double price, String description, String whereFrom) {
        super(type, price, description);
        this.whereFrom = whereFrom;
    }

    @Override
    public void showDetails(){
        System.out.println(super.toString()+this);
    }
}
