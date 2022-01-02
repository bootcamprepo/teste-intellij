package br.com.dio.animal;

import java.util.Objects;

public class Animal {

    private String nome;
    private String especie;
    private Integer idade;

    public Animal() {
    }

    public Animal(String nome, String especie, Integer idade) {
        this.nome = nome;
        this.especie = especie;
        this.idade = idade;
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getEspecie() {
        return especie;
    }

    public void setEspecie(String especie) {
        this.especie = especie;
    }

    public Integer getIdade() {
        return idade;
    }

    public void setIdade(Integer idade) {
        this.idade = idade;
    }

    @Override
    public String toString() {
        return "Animal{" +
                "nome='" + nome + '\'' +
                ", especie='" + especie + '\'' +
                ", idade=" + idade +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Animal animal = (Animal) o;
        return Objects.equals(nome, animal.nome) && Objects.equals(especie, animal.especie) && Objects.equals(idade, animal.idade);
    }

    @Override
    public int hashCode() {
        return Objects.hash(nome, especie, idade);
    }
}
