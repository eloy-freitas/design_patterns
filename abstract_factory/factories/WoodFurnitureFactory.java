package abstract_factory.factories;

import abstract_factory.product.Chair;
import abstract_factory.product.Desk;
import abstract_factory.product.WoodChair;
import abstract_factory.product.WoodDesk;

/**
 * WoodFurniture
 */
public class WoodFurnitureFactory implements FurnitureCollectionFactory{

    @Override
    public Chair createChair() {
        return new WoodChair();
    }

    @Override
    public Desk createDesk() {
        return new WoodDesk();
    }
    

}