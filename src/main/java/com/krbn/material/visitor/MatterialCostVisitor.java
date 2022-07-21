package com.krbn.material.visitor;

import com.krbn.interfaces.IMaterialVisitor;
import com.krbn.material.BiologicMaterial;
import com.krbn.material.ChemicalMaterial;
import com.krbn.material.NuclearMaterial;
import com.krbn.material.RadiologicMaterial;


public class MatterialCostVisitor implements IMaterialVisitor {
    @Override
    public double accept(BiologicMaterial material) {
        double protectionCostFactor = 6;
        double dutyAndStampCostFactor = 10;
        return material.getWeight() * (protectionCostFactor + dutyAndStampCostFactor);
    }

    @Override
    public double accept(ChemicalMaterial material) {
        double protectionCostFactor = 2;
        double dutyAndStampCostFactor = 5;
        return material.getWeight() * (protectionCostFactor + dutyAndStampCostFactor);
    }

    @Override
    public double accept(NuclearMaterial material) {
        double protectionCostFactor = 25;
        double dutyAndStampCostFactor = 20;
        return material.getWeight() * (protectionCostFactor + dutyAndStampCostFactor);
    }

    @Override
    public double accept(RadiologicMaterial material) {
        double protectionCostFactor = 12;
        double dutyAndStampCostFactor = 15;
        return material.getWeight() * (protectionCostFactor + dutyAndStampCostFactor);
    }
}
