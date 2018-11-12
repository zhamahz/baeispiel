package com.company;

public class Cream {

    private ChocoCake choco;
    private CherryCake cherry;
    private double creamCost;

    public Cream(CherryCake cherry, double creamCost) {
        this.cherry = cherry;
        this.creamCost = 5.0;
        this.choco = choco;
    }

    public CherryCake getCherry() {
        return cherry;
    }

    public void setCherry(CherryCake cherry) {
        this.cherry = cherry;
    }

    public double getCreamCost() {
        return creamCost;
    }

    public void setCreamCost(double creamCost) {
        this.creamCost = creamCost;
    }

    public ChocoCake getChoco() {
        return choco;
    }

    public void setChoco(ChocoCake choco) {
        this.choco = choco;
    }
}
