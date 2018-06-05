package objects;

import java.io.IOException;

import contract.IMoving;
import contract.Permeability;
import model.Objects;

public abstract class Moving extends Elements implements IMoving{

	Permeability penetrable;
}
