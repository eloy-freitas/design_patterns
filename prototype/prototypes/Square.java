package prototype.prototypes;

public class Square extends Shape{

    public Square(){

    }

    public Square(Square source){
        super(source);
        this.width = source.width;
    }

    @Override
    public IShape clone() {
        return new Square(this);
    }

    public void setWidth(float width){
        this.width = width;
    }

    public float getWidth(){
        return this.width;
    }
    
}
