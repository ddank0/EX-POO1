public class Sapato extends Calcado {

    private boolean cadarco;
    private String  Modelo;

    //constructors
    public Sapato(){

    }
    public Sapato(boolean cadarco, String modelo) {
        setCadarco(cadarco);
        setModelo(modelo);
    }
    public Sapato(int tamanho, boolean cadarco, String modelo) {
        super(tamanho);
        setCadarco(cadarco);
        setModelo(modelo);
    }
    public Sapato(String marca, boolean cadarco, String modelo) {
        super(marca);
        setCadarco(cadarco);
        setModelo(modelo);
    }
    public Sapato(double preco, boolean cadarco, String modelo) {
        super(preco);
        setCadarco(cadarco);
        setModelo(modelo);
    }
    public Sapato(int tamanho, String marca, boolean cadarco, String modelo) {
        super(tamanho, marca);
        setCadarco(cadarco);
        setModelo(modelo);
    }
    public Sapato(int tamanho, double preco, boolean cadarco, String modelo) {
        super(tamanho, preco);
        setCadarco(cadarco);
        setModelo(modelo);
    }
    public Sapato(String marca, double preco, boolean cadarco, String modelo) {
        super(marca, preco);
        setCadarco(cadarco);
        setModelo(modelo);
    }
    public Sapato(int tamanho, String marca, double preco, boolean cadarco, String modelo) {
        super(tamanho, marca, preco);
        setCadarco(cadarco);
        setModelo(modelo);
    }


    //getters
    public boolean getCadarco() {
        return cadarco;
    }
    public String getModelo() {
        return Modelo;
    }

    //setters
    public void setCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }
    public void setModelo(String modelo) {
        if(!modelo.isEmpty()){
            Modelo = modelo;
        }
    }
}
