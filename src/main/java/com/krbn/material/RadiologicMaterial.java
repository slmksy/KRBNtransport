package com.krbn.material;


import com.krbn.interfaces.IMaterialVisitor;
import com.krbn.interfaces.IVisitableMaterial;

public class RadiologicMaterial extends BaseCriticalMaterial implements IVisitableMaterial {

    public RadiologicMaterial(){

    }

    @Override
    public void visit(IMaterialVisitor visitor) {
        setTotalMaterialCost(visitor.accept(this));
    }
}
