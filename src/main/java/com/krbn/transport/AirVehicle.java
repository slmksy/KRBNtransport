package com.krbn.transport;


import com.krbn.interfaces.ITransportStrategy;
import com.krbn.interfaces.IVehicleVisitor;
import com.krbn.interfaces.IVisitableVehicle;

public class AirVehicle extends BaseTransportVehicle implements ITransportStrategy, IVisitableVehicle {
    public AirVehicle(){

    }

    @Override
    public void move(double distance) {
        this.setTotalTransportTime(distance / 1000);
    }

    @Override
    public void visit(IVehicleVisitor visitor) {
        setTotalMaterialCost(visitor.accept(this));
    }
}
