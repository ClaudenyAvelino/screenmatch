package exercicio2;

import java.util.ArrayList;

public class Pessoa {
    private String nome;
    private int idade;

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public int getIdade() {
        return idade;
    }

    public void setIdade(int idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Pessoa{" +
                "nome='" + nome + '\'' +
                ", idade=" + idade +
                '}';
    }

    public static void main(String[] args) {

        ArrayList<Pessoa> listaDePessoas = new ArrayList<>();

        Pessoa p1 = new Pessoa();
        p1.setNome("claudeny");
        p1.setIdade(47);
        Pessoa p2 = new Pessoa();
        p2.setNome("jose");
        p2.setIdade(16);
        Pessoa p3 = new Pessoa();
        p3.setNome("veronica");
        p3.setIdade(50);

        listaDePessoas.add(p1);
        listaDePessoas.add(p2);
        listaDePessoas.add(p3);

        System.out.println("Tamanho da lista: "+listaDePessoas.size());
        System.out.println("Primeira pessoa: "+listaDePessoas.get(0).getNome());
        System.out.println("Lista "+listaDePessoas.toString() );

    }
}
