public class TesteCalculadora {
    public static void main(String [] args) {
        Calculadora calc = new Calculadora();
        int soma = calc.somar(7, 8);
        int subtracao = calc.subtrair(7, 2);
        int multiplicacao = calc.multiplicar(25, 2);
        int divisao = calc.dividir(14, 2);
        System.out.println("Até mais");
    }    
}