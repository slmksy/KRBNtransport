package  com.krbn.material;

import com.krbn.interfaces.IMaterialVisitor;
import com.krbn.interfaces.IVisitableMaterial;


public class BiologicMaterial extends BaseCriticalMaterial implements IVisitableMaterial {

    public BiologicMaterial(){

    }

    @Override
    public void visit(IMaterialVisitor visitor) {
        setTotalMaterialCost(visitor.accept(this));
    }


}
