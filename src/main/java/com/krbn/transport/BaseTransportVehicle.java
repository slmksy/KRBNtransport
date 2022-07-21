package com.krbn.transport;

public abstract class BaseTransportVehicle  {

    private String name;
    private double transportCostFactor;
    private double loadWeight;
    private double totalMaterialCost;
    private double totalTransportTime;


    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }
    protected void setTotalTransportTime(double totalTransportTime) {
        this.totalTransportTime = totalTransportTime;
    }

    protected void setTotalMaterialCost(double totalMaterialCost) {
        this.totalMaterialCost = totalMaterialCost;
    }

    public double getTotalTransportTime() {
        return totalTransportTime;
    }

    public double getTotalMaterialCost() {
        return totalMaterialCost;
    }

    public double getTransportCostFactor() {
        return transportCostFactor;
    }

    public void setTransportCostFactor(double transportCostFactor) {
        this.transportCostFactor = transportCostFactor;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

}
