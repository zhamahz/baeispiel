package com.company;

public class ChocoCake extends Cake {

    public ChocoCake(String description, double cost) {
        super(description, cost);
    }

    public String getDescription() {
        return  "Choco Cake";
    }

    public double getCost(){

        return 5.00;
    }


}
