package com.krbn.material;

public abstract class BaseCriticalMaterial {
    private String name;
    private double weight;
    private double totalMaterialCost;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    protected void setTotalMaterialCost(double totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    public double getTotalMaterialCost() {
        return totalMaterialCost;
    }

    public double getWeight() {
        return weight;
    }

    public void setWeight(double weight) {
        this.weight = weight;
    }

}
