package com.krbn.material.visitor;

import com.krbn.interfaces.IMaterialVisitor;
import com.krbn.material.BiologicMaterial;
import com.krbn.material.ChemicalMaterial;
import com.krbn.material.NuclearMaterial;
import com.krbn.material.RadiologicMaterial;


public class MatterialCostVisitor implements IMaterialVisitor {
    @Override
    public double accept(BiologicMaterial material) {
       return material.getWeight() * (material.getProtectionCostFactor() + material.getDutyAndStampCostFactor());
    }

    @Override
    public double accept(ChemicalMaterial material) {
        return  material.getWeight() * (material.getProtectionCostFactor() + material.getDutyAndStampCostFactor());
    }

    @Override
    public double accept(NuclearMaterial material) {
        return  material.getWeight() * (material.getProtectionCostFactor() + material.getDutyAndStampCostFactor());
    }

    @Override
    public double accept(RadiologicMaterial material) {
        return  material.getWeight() * (material.getProtectionCostFactor() + material.getDutyAndStampCostFactor());
    }
}
