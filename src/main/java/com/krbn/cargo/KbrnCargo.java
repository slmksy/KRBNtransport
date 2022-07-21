package com.krbn.cargo;



import com.krbn.interfaces.ICargoVisitor;
import com.krbn.interfaces.IVisitableCargo;
import com.krbn.material.BaseCriticalMaterial;
import com.krbn.transport.BaseTransportVehicle;


public class KbrnCargo implements IVisitableCargo {
    private BaseCriticalMaterial material;
    private BaseTransportVehicle transportVehicle;
    private double cargoCost;


    public KbrnCargo(){

    }

    public KbrnCargo(BaseCriticalMaterial material, BaseTransportVehicle transportVehicle){
        this.transportVehicle = transportVehicle;
        this.material = material;
    }

    public void setMaterial(BaseCriticalMaterial material) {
        this.material = material;
    }
    public void setTransportVehicle(BaseTransportVehicle transportVehicle) {
        this.transportVehicle = transportVehicle;
    }
    public double getMaterialCost() {
        return material.getTotalMaterialCost();
    }
    public double getTransportCost() {
        return transportVehicle.getTotalTransportCost();
    }
    public double getCargoCost() {
        return cargoCost;
    }
    public double getTransportTime() {
        return transportVehicle.getTotalTransportTime();
    }


    @Override
    public void visit(ICargoVisitor visitor) {
        this.cargoCost = visitor.accept(this);
    }
}
