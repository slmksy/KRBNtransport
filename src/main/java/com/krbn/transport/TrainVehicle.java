package com.krbn.transport;

import com.krbn.interfaces.ITransportStrategy;
import com.krbn.interfaces.IVehicleVisitor;
import com.krbn.interfaces.IVisitableVehicle;


public class TrainVehicle extends BaseTransportVehicle implements ITransportStrategy, IVisitableVehicle {
    public TrainVehicle(){
        setName("Tren");
    }
    @Override
    public void move(double distance) {
        setTotalTransportTime(distance / 150);
    }

    @Override
    public void visit(IVehicleVisitor visitor) {
        setTotalMaterialCost(visitor.accept(this));
    }
}
