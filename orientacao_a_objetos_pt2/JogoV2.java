import java.util.Random;
public class JogoV2 {
    public static void main(String[] args) throws Exception {
        var p = new Personagem();
        var p2 = new Personagem(1, 2, 10);
        var p3 = new Personagem(2, 10, 4);
        p.nome = "Gamal";
        p2.nome = "Soneca";
        p3.nome = "Afonso";
        // p2.energia = 1;
        // p2.fome = 2;
        // p2.sono = 10;
        // p3.energia = 1;
        // p3.fome = 10;
        // p3.sono = 2;
        var gerador = new Random();
        while(true){
            int oQueFazer = gerador.nextInt(4);
            switch(oQueFazer){
                case 0:
                case 3:
                    p.cacar();
                    p2.dormir();
                    p3.comer();
                    break;
                case 1:
                    p.comer();
                    p2.comer();
                    p3.cacar();
                    break;
                case 2:
                    p.dormir();
                    p2.cacar();
                    p3.dormir();
                    break;
            }
            System.out.println(p);
            System.out.println(p2);
            System.out.println(p3);
            System.out.println("********************");
            Thread.sleep(4000);
        }
    }
}
