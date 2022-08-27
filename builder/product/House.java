package builder.product;

public class House {
    
    private String paredes;
    private String portas;
    private String telhado;
    private String janelas;
    private String chao;

    public House(){
        this.paredes = "";
        this.portas = "";
        this.telhado = "";
        this.janelas = "";
        this.chao = "";
    }

    public String getParedes() {
        return paredes;
    }

    public String getPortas() {
        return portas;
    }

    public String getTelhado() {
        return telhado;
    }

    public String getJanelas() {
        return janelas;
    }

    public String getChao() {
        return chao;
    }

    public void setParedes(String paredes) {
        this.paredes = paredes;
    }

    public void setPortas(String portas) {
        this.portas = portas;
    }

    public void setTelhado(String telhado) {
        this.telhado = telhado;
    }

    public void setJanelas(String janelas) {
        this.janelas = janelas;
    }

    public void setChao(String chao) {
        this.chao = chao;
    }

    @Override
    public String toString() {
        String values = "paredes: %s\nportas: %s\ntelhado: %s\njanelas: %s\nchao: %s\n";
        return String.format(
            values
            , this.getParedes()
            , this.getPortas()
            , this.getTelhado()
            , this.getJanelas()
            , this.getChao()
        );
        
    }
}
