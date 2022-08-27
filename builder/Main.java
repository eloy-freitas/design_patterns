package bulder;

import bulder.builders.HouseBuilder;
import bulder.builders.StoneHouseBuilder;
import bulder.builders.WoodHouseBuilder;
import bulder.director.Director;
import bulder.product.House;

public class Main {
    public static void main(String[] args) {
        HouseBuilder builder = new StoneHouseBuilder();
        Director d1 = new Director(builder);
        
        House h1 = d1.makeHouseWithoutChao();
        System.out.println(h1.toString());
        House h2 = d1.makeHouseWithoutTelhado();
        System.out.println(h2.toString());

        builder = new WoodHouseBuilder();
        d1.changeBuilder(builder);

        House h3 = d1.makeHouseWithoutChao();
        System.out.println(h3.toString());
        House h4 = d1.makeHouseWithoutTelhado();
        System.out.println(h4.toString());

    }
}
