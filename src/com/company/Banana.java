package com.company;

public class Banana  {

    private ChocoCake choco;
    private CherryCake cherry;
    private double bananaCost;


    public Banana(CherryCake cherry, double bananaCostcost) {
        this.cherry = cherry;
        this.bananaCost = 8.0;
        this.choco = choco;
    }

    public CherryCake getCherry() {
        return cherry;
    }

    public void setCherry(CherryCake cherry) {
        this.cherry = cherry;
    }

    public double getBananaCost() {
        return bananaCost;
    }

    public void setBananaCost(double bananaCost) {
        this.bananaCost = bananaCost;
    }

    public ChocoCake getChoco() {
        return choco;
    }

    public void setChoco(ChocoCake choco) {
        this.choco = choco;
    }
}
