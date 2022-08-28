package prototype;

import prototype.factories.ShapeFactory;
import prototype.prototypes.IShape;


public class Main {
    public static void main(String[] args) {
        ShapeFactory factory = new ShapeFactory();
        IShape s1 = factory.retangleFactory(10, 20, "azul");
        factory.addShape(s1);
        IShape s2 = factory.cloneShape(0);
        System.out.println(s1.getColor());
        System.out.println(s2.getColor());

    }
}
