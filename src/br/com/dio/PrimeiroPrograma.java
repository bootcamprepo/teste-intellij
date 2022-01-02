package br.com.dio;

import br.com.dio.animal.Animal;

import java.util.Objects;

public class PrimeiroPrograma {

    public static void main(String[] args) {
        int x = 1;
        int y = 3;
        int t = 7;

        Animal animal = new Animal("Dog", "Dogui", 5);

        System.out.println(animal);

        Livro livro = new Livro("Java",355);
        System.out.println(livro);


    }
}

class Livro{
    String nome;
    Integer numPaginas;

    public Livro(String nome, Integer numPaginas) {
        this.nome = nome;
        this.numPaginas = numPaginas;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Integer getNumPaginas() {
        return numPaginas;
    }

    public void setNumPaginas(Integer numPaginas) {
        this.numPaginas = numPaginas;
    }

    @Override
    public String toString() {
        return "livro{" +
                "nome='" + nome + '\'' +
                ", numPaginas=" + numPaginas +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Livro livro = (Livro) o;
        return nome.equals(livro.nome) && numPaginas.equals(livro.numPaginas);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, numPaginas);
    }
}
