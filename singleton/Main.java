package singleton;

import singleton.model.ProductionDbConfig;

public class Main {
    public static void main(String[] args) {
        ProductionDbConfig db = ProductionDbConfig.getInstance();
        System.out.println(db.toString());
    }
}
