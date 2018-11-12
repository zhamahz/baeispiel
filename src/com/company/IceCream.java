package com.company;

public class IceCream {

    private ChocoCake choco;
    private CherryCake cherry;
    private double IceCreamCost;

    public IceCream(CherryCake cherry, double iceCreamCost) {
        this.cherry = cherry;
        IceCreamCost = 6.0;
        this.choco = choco;
    }

    public CherryCake getCherry() {
        return cherry;
    }

    public void setCherry(CherryCake cherry) {
        this.cherry = cherry;
    }

    public double getIceCreamCost() {
        return IceCreamCost;
    }

    public void setIceCreamCost(double iceCreamCost) {
        IceCreamCost = iceCreamCost;
    }

    public ChocoCake getChoco() {
        return choco;
    }

    public void setChoco(ChocoCake choco) {
        this.choco = choco;
    }
}
