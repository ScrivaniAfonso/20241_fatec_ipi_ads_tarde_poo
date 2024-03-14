public class LivroDeNotas{
    //variável de instância(objeto)
    private String nomeDisciplina;

    //construtor padrão: lista de parâmetros vazia
    LivroDeNotas(String n) {
        nomeDisciplina = n;
    }
    public void exibirMensagem() {
        System.out.printf(
            "Bem vindo ao livro de notas de %s",
        nomeDisciplina
        );
    }
    //setter
    // public void setNomeDisciplina(String n) {
    //     if (nomeDisciplina.length() >= 3)
    //         nomeDisciplina = n;
    // }

    //getter
    public String getNomeDisciplina() {
        return nomeDisciplina;
    }
}