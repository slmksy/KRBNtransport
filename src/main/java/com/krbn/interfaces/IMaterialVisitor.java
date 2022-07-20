package com.krbn.interfaces;


import com.krbn.material.BiologicMaterial;
import com.krbn.material.ChemicalMaterial;
import com.krbn.material.NuclearMaterial;
import com.krbn.material.RadiologicMaterial;

public interface IMaterialVisitor {
    double accept(BiologicMaterial material);
    double accept(ChemicalMaterial material);
    double accept(NuclearMaterial material);
    double accept(RadiologicMaterial material);
}
