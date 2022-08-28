package prototype.prototypes;

public abstract class Shape implements IShape{

    protected float width;
    protected float height;
    protected String color;

    public Shape(){
    }

    public Shape(Shape source){
        this();
        this.width = source.width;
        this.height = source.height;
        this.color = source.color;
    }


    @Override
    public abstract IShape clone();

    @Override
    public String getColor() {
        return this.color;
    }

    @Override
    public void setColor(String color) {
        this.color = color;
    }
    
}
