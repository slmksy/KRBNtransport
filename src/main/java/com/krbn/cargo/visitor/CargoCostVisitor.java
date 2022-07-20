package com.krbn.cargo.visitor;


import com.krbn.cargo.KbrnCargo;
import com.krbn.interfaces.ICargoVisitor;

public class CargoCostVisitor implements ICargoVisitor {
    @Override
    public double accept(KbrnCargo cargo) {
        return cargo.getTransportCost() + cargo.getMaterialCost();
    }
}
