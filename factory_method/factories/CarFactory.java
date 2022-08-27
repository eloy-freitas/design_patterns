package factories;

import product.Car;
import product.IVeicle;

public class CarFactory  extends VeicleFactory{

    @Override
    public IVeicle createVeicle() {
        return new Car();
    }
    
}
