package prototype.prototypes;

public class Retangle extends Shape{

    public Retangle(){

    }

    public Retangle(Retangle source){
        super(source);
    }

    @Override
    public IShape clone() {
        return new Retangle(this);
    }
    
    public void setWidth(float width){
        this.width = width;
    }

    public float getWidth(){
        return this.width;
    }

    public void setHeight(float height){
        this.height = height;
    }

    public float getHeight(){
        return this.height;
    }

}
