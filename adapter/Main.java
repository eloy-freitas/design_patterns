package adapter;

import adapter.model.RoundHole;
import adapter.model.RoundPeg;
import adapter.model.SquarePeg;
import adapter.model.SquarePegAdapter;

public class Main {
    public static void main(String[] args) {
        RoundHole rHole = new RoundHole(10);
        RoundPeg rPeg = new RoundPeg(9);
        SquarePeg sPeg = new SquarePeg(8);
        SquarePegAdapter sAdapter = new SquarePegAdapter(sPeg);
        System.out.println(rHole.fits(rPeg));
    }
}
