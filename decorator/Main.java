package decorator;

import decorator.model.CompressionDecorator;
import decorator.model.DataSource;
import decorator.model.EncryptionDecorator;
import decorator.model.FileDataSource;

public class Main {
    public static void main(String[] args) {
        DataSource source = new FileDataSource("teste.txt");
        String data = "hello world";
        source.writeData(data);

        source = new CompressionDecorator(source);

        source.writeData(data);
        
        source = new EncryptionDecorator(source);

        source.writeData(data);
        System.out.println(source.readData());
    }
}
