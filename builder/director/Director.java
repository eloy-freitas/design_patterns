package bulder.director;

import bulder.builders.HouseBuilder;
import bulder.product.House;

public class Director {
    
    private HouseBuilder builder;

    public Director(HouseBuilder builder){
        this.builder = builder;
    }

    public void changeBuilder(HouseBuilder builder){
        this.builder = builder;
    }

    public House makeHouseWithoutTelhado(){
        this.builder.reset();
        this.builder.setChao();
        this.builder.setJanelas();
        this.builder.setParede();
        this.builder.setPortas();
        return this.builder.getResult();
    }

    public House makeHouseWithoutChao(){
        this.builder.reset();
        this.builder.setTelhado();
        this.builder.setJanelas();
        this.builder.setParede();
        this.builder.setPortas();
        return this.builder.getResult();
    }
}
