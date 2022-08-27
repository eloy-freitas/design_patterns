package bulder.builders;

import bulder.product.House;

public interface HouseBuilder {

    void reset();
    void setParede();
    void setPortas();
    void setTelhado();
    void setJanelas();
    void setChao();
    House getResult();
    
}
