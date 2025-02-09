package org.example.model;

public class Store {
    public static void main(String[] args) {

        //listProducts();
        ProductForSale chocolate=new Chocolate("Ülker",10.5,"good");
        ProductForSale coke=new Coke("Coca-cola",11.4,"bad");
        ProductForSale bread=new Bread("Tam buğdaylı",2.0,"good");

        ProductForSale[] array=new ProductForSale[3];
        array[0]=chocolate;
        array[1]=coke;
        array[2]=bread;



    }

    public static void listProducts(ProductForSale[] products) {
        for(ProductForSale product : products){
            product.showDetails();
        }
    }

}