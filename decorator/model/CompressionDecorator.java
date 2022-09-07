package decorator.model;

public class CompressionDecorator extends DataSourceDecorator{

    public CompressionDecorator(DataSource datasource) {
        super(datasource);
        
    }

    @Override
    public void writeData(String data) {
        int length = data.length() - 1;
        String compressedData = data.substring(1, length);
        this.wrapper.writeData(compressedData);
        
    }

    @Override
    public String readData() {
        return this.wrapper.readData();
    
    }
    
}
