public class VetorDinamico {
    private int qtde;
    private int cap;
    private int [] elementos;
    private static final int CAP_MINIMA = 4;
    VetorDinamico(){
        cap = CAP_MINIMA;
        qtde = 0;
        elementos = new int[CAP_MINIMA];
    }
  
    VetorDinamico(int capMinima){
        double aux = capMinima;
        while (aux >= 2)
            aux /= 2;
            cap = aux == 1 && capMinima > 3 ? capMinima : CAP_MINIMA;
    }
  
    void adicionar(int elemento){
      
      elementos[qtde] = elemento;
      qtde++;
    }
  
    boolean estaCheio(){
        return qtde == cap;
    }
  
    void redimensionar(){
        int aux [] = new Int [cap*2];
        int i = 0;
        for (int i = 0; i < qtde; i++){
             aux[i] = elementos[i];
        }
        cap *=2;
        elementos = aux;
    }
  }