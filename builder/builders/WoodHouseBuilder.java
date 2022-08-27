package bulder.builders;

import bulder.product.House;

public class WoodHouseBuilder implements HouseBuilder {

    private House house; 

    @Override
    public void reset() {
        this.house = new House();
    }

    @Override
    public void setParede() {
        this.house.setParedes("parede de madeira");
        
    }

    @Override
    public void setPortas() {
        this.house.setPortas("porta de madeira");
        
    }

    @Override
    public void setTelhado() {
        this.house.setTelhado("telhado de madeira");
        
    }

    @Override
    public void setJanelas() {
        this.house.setJanelas("janela de vidro");
        
    }

    @Override
    public void setChao() {
        this.house.setChao("chao de madeira");
        
    }

    @Override
    public House getResult() {
        
        return this.house;
    }
    
}
