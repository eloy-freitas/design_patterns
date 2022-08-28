package prototype.factories;

import java.util.ArrayList;
import java.util.List;

import prototype.prototypes.IShape;
import prototype.prototypes.Retangle;
import prototype.prototypes.Square;

public class ShapeFactory {
    private List<IShape> shapes;

    public ShapeFactory(){
        this.shapes = new ArrayList<>();
    }

    public Square squareFactory(float width, String color){
        Square s = new Square();
        s.setWidth(width);
        s.setColor(color);
        return s;
    }

    public Retangle retangleFactory(float width, float height, String color){
        Retangle r = new Retangle();
        r.setColor(color);
        r.setHeight(height);
        r.setWidth(width);
        return r;
    }

    public void addShape(IShape source){
        this.shapes.add(source);
    }

    public IShape cloneShape(int index){
        return this.shapes.get(index).clone();
    }

    public IShape getShapeById(int index){
        return this.shapes.get(index);
    }
}
