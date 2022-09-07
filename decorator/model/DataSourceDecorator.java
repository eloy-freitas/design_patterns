package decorator.model;


public class DataSourceDecorator implements DataSource{
    protected DataSource wrapper;
    
    public DataSourceDecorator(DataSource datasource){
        this.wrapper = datasource;
    }

    @Override
    public void writeData(String data) {
        this.wrapper.writeData(data);
        
    }

    @Override
    public String readData() {
        return this.wrapper.readData();
    
    }
}
