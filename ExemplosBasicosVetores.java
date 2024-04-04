import java.util.Arrays;

public class ExemplosBasicosVetores {
  public static void main(String[] args) {

    Personagem [] personagens = new Personagem[4];
    personagens[0] = new Personagem();
    personagens[1] = new Personagem(5, 5, 5);
    personagens[2] = new Personagem(10, 0, 5);
    personagens[3] = new Personagem(3, 3, 4);

    personagens[0].nome = "Ana";
    for (Personagem p : personagens){
      p.nome = "Pedro";
      System.out.println(p);
    }
    

  }
}