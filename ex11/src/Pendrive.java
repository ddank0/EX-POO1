public class Pendrive {
    //ATRIBUTOS
    private String  marca;
    private int     capacidade;
    private boolean comprimento, 
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
    public void setComprimento(boolean comprimento){
        if(capacidade > 0)
            this.comprimento = comprimento;
    }
    public void setLargura(boolean largura){
        if(capacidade > 0)
            this.largura = largura;
    }
    public void setProfundidade(boolean profundidade){
        if(capacidade > 0)
            this.profundidade = profundidade;
    }
    public void setPeso(boolean peso){
        if(capacidade > 0)
            this.peso = peso;
    }
    public void setPreco(boolean preco){
        if(capacidade > 0)
            this.preco = preco;
    }
    //
    public String getMarca() {
        return this.marca;
    }
    public boolean getComprimento() {
        return comprimento;
    }
    public boolean getLargura() {
        return largura;
    }
    public boolean getProfundidade() {
        return profundidade;
    }
    public boolean getPeso() {
        return peso;
    }
    public boolean getPreco() {
        return preco;
    }
    public int getCapacidade() {
        return capacidade;
    }
}
