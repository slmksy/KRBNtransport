package com.krbn.material;


import com.krbn.interfaces.IMaterialVisitor;
import com.krbn.interfaces.IVisitableMaterial;

public class NuclearMaterial extends BaseCriticalMaterial implements IVisitableMaterial {

    public NuclearMaterial(){

    }


    @Override
    public void visit(IMaterialVisitor visitor) {
        setTotalMaterialCost(visitor.accept(this));
    }
}
