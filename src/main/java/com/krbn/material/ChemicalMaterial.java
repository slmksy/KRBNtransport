package  com.krbn.material;

import com.krbn.interfaces.IMaterialVisitor;
import com.krbn.interfaces.IVisitableMaterial;

public class ChemicalMaterial extends BaseCriticalMaterial implements IVisitableMaterial {

    public ChemicalMaterial(){

    }

    @Override
    public void visit(IMaterialVisitor visitor) {
        setTotalMaterialCost(visitor.accept(this));
    }
}
