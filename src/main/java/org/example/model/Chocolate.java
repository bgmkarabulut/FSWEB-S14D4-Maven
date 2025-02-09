package org.example.model;

public class Chocolate extends ProductForSale{
    private String color;

    public Chocolate(String type, double price, String description) {
        super(type, price, description);
    }
    public Chocolate(String type,double price,String description,String color){
        super(type,price,description);
        this.color=color;
    }

    @Override
    public void showDetails() {
        System.out.println(super.toString()+this);
    }
}
