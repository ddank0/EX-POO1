public class Chinelo extends Calcado {

    private boolean tira;
    private boolean acessorio;

    //constructors
    public Chinelo() {

    }
    public Chinelo(boolean tira, boolean acessorio) {
        setTira(tira);
        setAcessorio(acessorio);
    }
    public Chinelo(int tamanho, boolean tira) {
        super(tamanho);
        setTira(tira);
    }
    public Chinelo(String marca, boolean tira) {
        super(marca);
        setTira(tira);
    }
    public Chinelo(double preco, boolean tira) {
        super(preco);
        setTira(tira);
    }
    public Chinelo(int tamanho, boolean tira, boolean acessorio) {
        super(tamanho);
        setTira(tira);
        setAcessorio(acessorio);
    }
    public Chinelo(String marca, boolean tira, boolean acessorio) {
        super(marca);
        setTira(tira);
        setAcessorio(acessorio);
    }
    public Chinelo(double preco, boolean tira, boolean acessorio) {
        super(preco);
        setTira(tira);
        setAcessorio(acessorio);
    }
    public Chinelo(String marca, double preco, boolean tira) {
        super(marca, preco);
        setTira(tira);
    }
    public Chinelo(int tamanho, String marca, boolean tira) {
        super(tamanho, marca);
        setTira(tira);
    }
    public Chinelo(int tamanho, String marca, boolean tira, boolean acessorio) {
        super(tamanho, marca);
        setTira(tira);
        setAcessorio(acessorio);
    }
    public Chinelo(int tamanho, String marca, double preco, boolean tira) {
        super(tamanho, marca, preco);
        setTira(tira);
    }
    public Chinelo(int tamanho, double preco, boolean tira, boolean acessorio) {
        super(tamanho, preco);
        setTira(tira);
        setAcessorio(acessorio);
    }
    public Chinelo(String marca, double preco, boolean tira, boolean acessorio) {
        super(marca, preco);
        setTira(tira);
        setAcessorio(acessorio);
    }
    public Chinelo(int tamanho, String marca, double preco, boolean tira, boolean acessorio) {
        super(tamanho, marca, preco);
        setTira(tira);
        setAcessorio(acessorio);
    }


    //getters
    public boolean getTira() {
        return this.tira;
    }
    public boolean getAcessorio() {
        return this.acessorio;
    }

    //setters
    public void setTira(boolean tira) {
        this.tira = tira;
    }
    public void setAcessorio(boolean acessorio) {
        this.acessorio = acessorio;
    }
}