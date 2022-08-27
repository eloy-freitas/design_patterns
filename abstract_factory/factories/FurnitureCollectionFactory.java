package abstract_factory.factories;

import abstract_factory.product.Chair;
import abstract_factory.product.Desk;

public interface  FurnitureCollectionFactory {
    
    Chair createChair();

    Desk createDesk();
    
}
