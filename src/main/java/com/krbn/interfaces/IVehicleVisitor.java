package com.krbn.interfaces;


import com.krbn.transport.AirVehicle;
import com.krbn.transport.LandVehicle;
import com.krbn.transport.ShipVehicle;
import com.krbn.transport.TrainVehicle;

public interface IVehicleVisitor {
    double accept(AirVehicle vehicle);
    double accept(ShipVehicle vehicle);
    double accept(LandVehicle vehicle);
    double accept(TrainVehicle vehicle);
}
