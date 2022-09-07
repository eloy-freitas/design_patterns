package composite.model;

public class Dot implements Graphic {

    private double x;
    private double y;

    public Dot(double x, double y){
        this.x = x;
        this.y = y;
    }

    @Override
    public void move(double x, double y) {
        this.x =+ x;
        this.y =+ y;
    }

    @Override
    public void draw() {
        String output = "dot in position: (%f, %f)";
        System.out.println(String.format(output, this.x, this.y));
        
    }
    
}
