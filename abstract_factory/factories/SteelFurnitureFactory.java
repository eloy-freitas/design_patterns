package abstract_factory.factories;

import abstract_factory.product.Chair;
import abstract_factory.product.Desk;
import abstract_factory.product.SteelChair;
import abstract_factory.product.SteelDesk;

public class SteelFurnitureFactory implements FurnitureCollectionFactory{

    @Override
    public Chair createChair() {
        return new SteelChair();
    }

    @Override
    public Desk createDesk() {
        return new SteelDesk();
    }
    
}
