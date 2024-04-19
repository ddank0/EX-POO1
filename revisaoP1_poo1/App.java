public class App {
    public static void main(String[] args){

        Chinelo chinelo1 = new Chinelo(39, "Havaianas",35.90, true);
        Chinelo chinelo2 = new Chinelo(40, "Havaianas", true);
        Chinelo chinelo3 = new Chinelo(35.43, true);

        Tenis tenis1 = new Tenis(41, "nike", true);
        Tenis tenis2 = new Tenis("adidas", true);
        Tenis tenis3 = new Tenis("puma", 200.47, true, true);

        Sapato sapato1 = new Sapato();
        Sapato sapato2 = new Sapato(true, "modelo1");
        Sapato sapato3 = new Sapato(150.00, true, "modelo2");



        tenis1.imprimir(sapato2.getModelo());

    }
}