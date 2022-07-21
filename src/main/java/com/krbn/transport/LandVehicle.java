package com.krbn.transport;


import com.krbn.interfaces.ITransportStrategy;
import com.krbn.interfaces.IVehicleVisitor;
import com.krbn.interfaces.IVisitableVehicle;

public class LandVehicle extends BaseTransportVehicle implements ITransportStrategy, IVisitableVehicle {
    public LandVehicle() {
        setName("Kara");
    }

    @Override
    public void move(double distance) {
        this.setTotalTransportTime(distance  / 100);
    }

    @Override
    public void visit(IVehicleVisitor visitor) {
        setTotalMaterialCost(visitor.accept(this));
    }
}
