package abstract_factory;

import java.util.ArrayList;
import java.util.List;

import abstract_factory.factories.SteelFurnitureFactory;
import abstract_factory.factories.WoodFurnitureFactory;
import abstract_factory.product.Chair;
import abstract_factory.product.Desk;

public class Main {
    public static void main(String[] args) {
        SteelFurnitureFactory steelFurnitureFactory = new SteelFurnitureFactory();
        WoodFurnitureFactory woodFurnitureFactory = new WoodFurnitureFactory();
        
        List<Chair> cList = new ArrayList<>();
        List<Desk> dList = new ArrayList<>();

        cList.add(steelFurnitureFactory.createChair());
        cList.add(woodFurnitureFactory.createChair());
        
        dList.add(steelFurnitureFactory.createDesk());
        dList.add(woodFurnitureFactory.createDesk());

        for (Chair c : cList){
            c.chairType();
        }

        for (Desk d : dList){
            d.deskType();
        }
    }
}
