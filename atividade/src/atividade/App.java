package atividade;

public class App {
    public static void main(String[] args) {
        // Criando uma inst�ncia de Pessoa para cada estuantes
        Pessoa pessoa = new Pessoa("Daniel", 25);
        Pessoa pessoa2 = new Pessoa("Taylane", 19);
        

        // Exibindo as informa��es dos estudantes
        pessoa.exibirInformacoes();
        pessoa2.exibirInformacoes();
    }
}