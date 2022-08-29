package adapter.model;

public class SquarePegAdapter extends RoundPeg{
    private SquarePeg peg;

    public SquarePegAdapter(SquarePeg peg){
        super(peg.getWidth());
        this.peg = peg;
    }

    @Override
    public float getRadius() {
        return (float) (peg.getWidth() * Math.sqrt(2)/2);
    }
}
