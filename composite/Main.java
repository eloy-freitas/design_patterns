package composite;

import composite.model.CompoundGraphic;
import composite.model.Dot;

public class Main {
    public static void main(String[] args) {
        Dot d1 = new Dot(10, 10);
        Dot d2 = new Dot(11, 20);
        Dot d3 = new Dot(12, 30);
        Dot d4 = new Dot(13, 40);
        Dot d5 = new Dot(14, 50);
        Dot d6 = new Dot(15, 60);
        Dot d7 = new Dot(16, 70);

        CompoundGraphic n1 = new CompoundGraphic();
        CompoundGraphic n2 = new CompoundGraphic();
        CompoundGraphic n3 = new CompoundGraphic();
        CompoundGraphic n4 = new CompoundGraphic();

        n2.add(d1);
        n2.add(d2);
        n3.add(d3);
        n3.add(d4);
        n4.add(d5);
        n4.add(d6);
        n1.add(n2);
        n1.add(n3);
        n1.add(n4);
        n1.add(d7);

        n1.draw();

    }
}
