package com.krbn.transport;

public abstract class BaseTransportVehicle  {
    private double transportCost;
    private double loadWeight;
    private double totalMaterialCost;
    private double totalTransportTime;



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

    public double getTransportCost() {
        return transportCost;
    }

    public void setTransportCost(double transportCost) {
        this.transportCost = transportCost;
    }

    public double getLoadWeight() {
        return loadWeight;
    }

    public void setLoadWeight(double loadWeight) {
        this.loadWeight = loadWeight;
    }

}
