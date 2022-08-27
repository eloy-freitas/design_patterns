package builder.builders;

import builder.product.House;

public class StoneHouseBuilder implements HouseBuilder{

    private House house;

    @Override
    public void reset() {
        this.house = new House();        
    }

    @Override
    public void setParede() {
        this.house.setParedes("parede de pedra");
    }

    @Override
    public void setPortas() {
        this.house.setPortas("porta de aço");
    }

    @Override
    public void setTelhado() {
       this.house.setTelhado("telhado de pedra");
    }

    @Override
    public void setJanelas() {
       this.house.setJanelas("janelas de aço");
        
    }

    @Override
    public void setChao() {
        this.house.setChao("chão de pedra");
        
    }

    @Override
    public House getResult() {
        return this.house;
    }
    
}
