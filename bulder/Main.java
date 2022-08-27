package bulder;

import bulder.builders.HouseBuilder;
import bulder.builders.StoneHouseBuilder;
import bulder.product.House;

public class Main {
    public static void main(String[] args) {
        HouseBuilder stoneHouseBuilder = new StoneHouseBuilder();
        
        stoneHouseBuilder.reset();
        stoneHouseBuilder.setTelhado();
        stoneHouseBuilder.setJanelas();
        stoneHouseBuilder.setParede();
        stoneHouseBuilder.setPortas();
        stoneHouseBuilder.setChao();
        House h = stoneHouseBuilder.getResult();
        stoneHouseBuilder.reset();
        System.out.println(h.toString());
    }
}
