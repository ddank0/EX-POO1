public class Calcado {
    
    private String  marca;
    private double  preco;
    private int     tamanho;

    //método construtor
    public Calcado() {

    }
    public Calcado(int tamanho) {
        setTamanho(tamanho);
    }
    public Calcado(String marca){
        setMarca(marca);
    }
    public Calcado(double preco){
        setPreco(preco);
    }
    public Calcado(int tamanho, String marca) {
        setTamanho(tamanho);
        setMarca(marca);
    }
    public Calcado(int tamanho, double preco) {
        setPreco(preco);
        setTamanho(tamanho);
    }
    public Calcado(String marca, double preco) {
        setMarca(marca);
        setPreco(preco);
    }
    public Calcado(int tamanho, String marca, double preco) {
        setTamanho(tamanho);
        setMarca(marca);
        setPreco(preco);
    }

    //getter => pegar informação
    public String getMarca() {
        return marca;
    }
    public int getTamanho() {
        return tamanho;
    }
    public double getTipoSola() {
        return preco;
    }

    //setter => inserir informação
    public void setMarca(String marca) {
        if (!marca.isEmpty()) {
            this.marca = marca;
        }
    }
    public void setPreco(double preco) {
        if(preco >= 0) {
            this.preco = preco;
        }
    }
    public void setTamanho(int tamanho) {
        if (tamanho > 0) {
            this.tamanho = tamanho;
        }
    }

    //método imprimir (requisito 4)
    public void imprimir(Object toPrint){
        System.out.println(toPrint);
    }
}
