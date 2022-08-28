package singleton.model;

public class ProductionDbConfig {
    
    private String host;
    private String schema;
    private String user;
    private String password;
    int port;
    private static ProductionDbConfig instance;

    private ProductionDbConfig(String host, String schema, String user, String password, int port){
        this.host = host;
        this.schema = schema;
        this.user = user;
        this.password = password;
        this.port = port;
    }

    public static ProductionDbConfig getInstance(){
        if(instance == null){
            instance = new ProductionDbConfig(
                "localhost", 
                "airflow",
                "admin", 
                "admin123", 
                5432
            );
        }
        return instance;
    }

    @Override
    public String toString() {
        String result = "host: %s,\nschema: %s,\nuser: %s,\npassword: %s,\nport: %d";
        return String.format(result, host, schema, user, password, port);
    }
}
