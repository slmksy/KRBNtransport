package com.krbn.transport.visitor;

import com.krbn.interfaces.IVehicleVisitor;
import com.krbn.transport.AirVehicle;
import com.krbn.transport.LandVehicle;
import com.krbn.transport.ShipVehicle;
import com.krbn.transport.TrainVehicle;


public class TransportCostVisitor implements IVehicleVisitor {
    @Override
    public double accept(AirVehicle vehicle) {
        double transportCostFactor = 2;
        return transportCostFactor * vehicle.getLoadWeight();
    }

    @Override
    public double accept(ShipVehicle vehicle) {
        double transportCostFactor = 0.5;
        return transportCostFactor * vehicle.getLoadWeight();
    }

    @Override
    public double accept(LandVehicle vehicle) {
        double transportCostFactor = 0.8;
        return transportCostFactor * vehicle.getLoadWeight();
    }

    @Override
    public double accept(TrainVehicle vehicle) {
        double transportCostFactor = 1;
        return transportCostFactor * vehicle.getLoadWeight();
    }
}
