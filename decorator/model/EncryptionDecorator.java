package decorator.model;

public class EncryptionDecorator extends DataSourceDecorator{

    public EncryptionDecorator(DataSource datasource) {
        super(datasource);
        
    }

    @Override
    public void writeData(String data) {
        String dataEncrypted = String.valueOf(data.hashCode());
        this.wrapper.writeData(dataEncrypted);
        
    }

    @Override
    public String readData() {
        return this.wrapper.readData();
        
    }
    
}
