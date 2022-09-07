package composite.model;

import java.util.ArrayList;
import java.util.List;

public class CompoundGraphic implements Graphic{
    private List<Graphic> children;

    public CompoundGraphic(){
        children = new ArrayList<>();
    }
    
    @Override
    public void move(double x, double y) {
        for (Graphic g : children) {
            g.move(x, y);
        }
    }

    @Override
    public void draw() {
        for (Graphic g : children) {
            g.draw();
        }
    }
    
    public void add(Graphic child){
        this.children.add(child);
    }

    public void remove(Graphic child){
        this.children.remove(child);
    }

}
