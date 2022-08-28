package prototype.prototypes;

public interface IShape {
    IShape clone();
    String getColor();    
    void setColor(String color);
}