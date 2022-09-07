package decorator.model;

public class FileDataSource implements DataSource{

    private String data;
    private String filename;

    public FileDataSource(String filename){
        this.data = "";
        this.filename = filename;
    }

    @Override
    public void writeData(String data) {
        this.data = data;
        
    }

    @Override
    public String readData() {
        return this.data;

    }
    
}
