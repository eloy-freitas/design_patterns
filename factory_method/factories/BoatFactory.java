package factories;

import product.Boat;
import product.IVeicle;

public class BoatFactory extends VeicleFactory{
    @Override
    public IVeicle createVeicle() {
        
        return new Boat();
    }
}
