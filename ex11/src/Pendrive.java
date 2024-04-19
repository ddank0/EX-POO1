public class Pendrive {
    //ATRIBUTOS
    private String  marca;
    private int     capacidade;
    private double comprimento, 
                    largura,
                    profundidade,
                    peso,
                    preco; 

    //METODOS DE ACESSO
    public void setMarca(String marca){
        if (!marca.isEmpty())
            this.marca = marca;
    } 
    public void setCapacidade(int capacidade){
        if(capacidade > 0)
            this.capacidade = capacidade;
    }
    public void setComprimento(double comprimento){
        if(comprimento > 0)
            this.comprimento = comprimento;
    }
    public void setLargura(double largura){
        if(largura > 0)
            this.largura = largura;
    }
    public void setProfundidade(double profundidade){
        if(profundidade > 0)
            this.profundidade = profundidade;
    }
    public void setPeso(double peso){
        if(peso > 0)
            this.peso = peso;
    }
    public void setPreco(double preco){
        if(preco > 0)
            this.preco = preco;
    }
    //
    public String getMarca() {
        return this.marca;
    }
    public double getComprimento() {
        return comprimento;
    }
    public double getLargura() {
        return largura;
    }
    public double getProfundidade() {
        return profundidade;
    }
    public double getPeso() {
        return peso;
    }
    public double getPreco() {
        return preco;
    }
    public int getCapacidade() {
        return capacidade;
    }
}
