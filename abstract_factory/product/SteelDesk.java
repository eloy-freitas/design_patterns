package abstract_factory.product;

public class SteelDesk implements Desk{
    @Override
    public void deskType() {
        System.out.println("this is a steel desk");
    }
}
