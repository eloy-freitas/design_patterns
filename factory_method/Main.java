import java.util.ArrayList;
import java.util.List;

import factories.BoatFactory;
import factories.CarFactory;
import product.IVeicle;

public class Main {


    public static void main(String[] args) {
        CarFactory carFactory = new CarFactory();
        BoatFactory boatFactory = new BoatFactory();

        List<IVeicle> vList = new ArrayList<>();
        
        for (int i=0;i<10;i++){
            vList.add(boatFactory.createVeicle());
            vList.add(carFactory.createVeicle());
        }

        for (int i=0;i<10;i++){
            vList.get(i).move();
        }
    }
}
