package abstract_factory.product;

public class WoodChair implements Chair{

    @Override
    public void chairType() {
        System.out.println("this is a wood chair");
    }
    
}
