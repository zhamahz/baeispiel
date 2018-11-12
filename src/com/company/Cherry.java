package com.company;

public class Cherry  {

    private ChocoCake choco;
    private CherryCake cherry;
    private double cherryCost;

    public Cherry(CherryCake cherry, double cherryCost) {
        this.cherry = cherry;
        this.cherryCost = 7.0;
        this.choco = choco;
    }

    public CherryCake getCherry() {
        return cherry;
    }

    public void setCherry(CherryCake cherry) {
        this.cherry = cherry;
    }

    public double getCherryCost() {
        return cherryCost;
    }

    public void setCherryCost(double cherryCost) {
        this.cherryCost = cherryCost;
    }

    public ChocoCake getChoco() {
        return choco;
    }

    public void setChoco(ChocoCake choco) {
        this.choco = choco;
    }
}
