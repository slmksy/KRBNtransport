package com.krbn.transport;

public abstract class BaseTransportVehicle  {

    private String name;
    private double loadWeight;
    private double totalTransportCost;
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

    protected void setTotalTransportCost(double totalTransportCost) {
        this.totalTransportCost = totalTransportCost;
    }

    public double getTotalTransportTime() {
        return totalTransportTime;
    }

    public double getTotalTransportCost() {
        return totalTransportCost;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

}
