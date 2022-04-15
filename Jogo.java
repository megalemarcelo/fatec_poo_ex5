import java.util.Random;

public class Jogo {
    public static void main(String[] args) throws Exception {
        Personagem cacador = new Personagem(10, 0, 0);
        Personagem guloso = new Personagem(2, 10, 0);

        cacador.setNome("Caçador");
        guloso.setNome("Guloso");
        Random gerador = new Random();

        while (true) {
            int oQueFazer = gerador.nextInt(6) + 1;

            switch (oQueFazer) {
                case 1:
                    cacador.cacar();
                    cacador.estado();
                    break;
                case 2:
                    guloso.cacar();
                    guloso.estado();
                    break;
                case 3:
                    cacador.comer();
                    cacador.estado();
                    break;
                case 4:
                    guloso.comer();
                    guloso.estado();
                    break;
                case 5:
                    cacador.dormir();
                    cacador.estado();
                    break;
                case 6:
                    guloso.dormir();
                    guloso.estado();
                    break;
            }
            System.out.println("\n-------------------------------------------------\n");
            Thread.sleep(2000);
        }
    }
}