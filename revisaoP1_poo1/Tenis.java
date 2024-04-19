public class Tenis extends Calcado {

    private boolean cadarco;
    private boolean esportivo;

    //constructors
    public Tenis(){

    }
    public Tenis(boolean cadarco, boolean esportivo) {
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }
    public Tenis(int tamanho, boolean cadarco) {
        super(tamanho);
        setCadarco(cadarco);
    }
    public Tenis(String marca, boolean cadarco) {
        super(marca);
        setCadarco(cadarco);
    }
    public Tenis(double preco, boolean cadarco) {
        super(preco);
        setCadarco(cadarco);
    }
    public Tenis(int tamanho, boolean cadarco, boolean esportivo) {
        super(tamanho);
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }
    public Tenis(int tamanho, String marca, boolean cadarco) {
        super(tamanho, marca);
        setCadarco(cadarco);
    }
    public Tenis(int marca, double preco, boolean cadarco) {
        super(marca, preco);
        setCadarco(cadarco);
    }
    public Tenis(String marca, boolean cadarco, boolean esportivo) {
        super(marca);
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }
    public Tenis(double preco, boolean cadarco, boolean esportivo) {
        super(preco);
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }
    public Tenis(int tamanho, String marca, boolean cadarco, boolean esportivo) {
        super(tamanho, marca);
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }
    public Tenis(int tamanho, double preco, boolean cadarco, boolean esportivo) {
        super(tamanho, preco);
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }
    public Tenis(String marca, double preco, boolean cadarco, boolean esportivo) {
        super(marca, preco);
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }
    public Tenis(int tamanho, String marca, double preco, boolean cadarco, boolean esportivo) {
        super(tamanho, marca, preco);
        setCadarco(cadarco);
        setEsportivo(esportivo);
    }


    //getters
    public boolean getCadarco() {
        return cadarco;
    }
    public boolean getEsportivo() {
        return esportivo;
    }

    //setters
    public void setCadarco(boolean cadarco) {
        this.cadarco = cadarco;
    }
    public void setEsportivo(boolean esportivo) {
        this.esportivo = esportivo;
    }
}
