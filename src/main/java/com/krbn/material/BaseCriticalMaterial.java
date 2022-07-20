package com.krbn.material;

public abstract class BaseCriticalMaterial {
    private double dutyAndStampCost;
    private double protectionCost;
    private double weight;
    private double totalMaterialCost;


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

    public double getDutyAndStampCost() {
        return dutyAndStampCost;
    }

    public void setDutyAndStampCost(int dutyAndStampCost) {
        this.dutyAndStampCost = dutyAndStampCost;
    }

    public double getProtectionCost() {
        return protectionCost;
    }

    public void setProtectionCost(double protectionCost) {
        this.protectionCost = protectionCost;
    }



}
