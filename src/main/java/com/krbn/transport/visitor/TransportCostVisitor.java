package com.krbn.transport.visitor;

import com.krbn.interfaces.IVehicleVisitor;
import com.krbn.transport.AirVehicle;
import com.krbn.transport.LandVehicle;
import com.krbn.transport.ShipVehicle;
import com.krbn.transport.TrainVehicle;


public class TransportCostVisitor implements IVehicleVisitor {
    @Override
    public double accept(AirVehicle vehicle) {
        return vehicle.getTransportCostFactor() * vehicle.getLoadWeight();
    }

    @Override
    public double accept(ShipVehicle vehicle) {
        return vehicle.getTransportCostFactor() * vehicle.getLoadWeight();
    }

    @Override
    public double accept(LandVehicle vehicle) {
        return vehicle.getTransportCostFactor() * vehicle.getLoadWeight();
    }

    @Override
    public double accept(TrainVehicle vehicle) {
        return vehicle.getTransportCostFactor() * vehicle.getLoadWeight();
    }
}
