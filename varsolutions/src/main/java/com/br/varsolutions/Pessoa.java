package com.br.varsolutions;

public class Pessoa {
    String nome;
    String sobrenome;
    String endereco;
    int idade;
    double peso;
    double altura;

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getSobrenome(){return sobrenome;}
    public void setSobrenome(String sobrenome){this.sobrenome = sobrenome;}

    public String getEndereco(){return endereco; }
    public void setEndereco(String endereco){this.endereco = endereco;}

    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}

    public double getPeso(){return peso;}
    public void setPeso(double peso){this.peso = peso;}

    public double getAltura(){return altura;}
    public void setAltura(double altura){this.altura = altura;}
}
