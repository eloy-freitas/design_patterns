package abstract_factory.product;

public class WoodDesk implements Desk{
    @Override
    public void deskType() {
        System.out.println("this is a wood desk");
    }
}
