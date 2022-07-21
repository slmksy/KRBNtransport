package com.krbn.transport;

import com.krbn.interfaces.ITransportStrategy;
import com.krbn.interfaces.IVehicleVisitor;
import com.krbn.interfaces.IVisitableVehicle;

public class ShipVehicle extends BaseTransportVehicle implements ITransportStrategy, IVisitableVehicle {
    public ShipVehicle(){
        setName("Gemi");
    }

    @Override
    public void move(double distance) {
        setTotalTransportTime(distance / 50);
    }

    @Override
    public void visit(IVehicleVisitor visitor) {
        setTotalTransportCost(visitor.accept(this));
    }
}
