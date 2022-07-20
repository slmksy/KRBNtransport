package com.krbn.interfaces;

import com.krbn.cargo.KbrnCargo;

public interface ICargoVisitor {
    double accept(KbrnCargo cargo);
}
