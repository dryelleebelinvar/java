package com.br.varsolutions;

public class Pessoa {
    String nome;
    String sobrenome;
    String endereco;
    int idade;
    float peso;
    float altura;
    double salario;
    String time;

    public String getNome(){return nome;}
    public void setNome(String nome){this.nome = nome;}

    public String getSobrenome(){return sobrenome;}
    public void setSobrenome(String sobrenome){this.sobrenome = sobrenome;}

    public String getEndereco(){return endereco; }
    public void setEndereco(String endereco){this.endereco = endereco;}

    public int getIdade(){return idade;}
    public void setIdade(int idade){this.idade = idade;}

    public float getPeso(){return peso;}
    public void setPeso(float peso){this.peso = peso;}

    public float getAltura(){return altura;}
    public void setAltura(float altura){this.altura = altura;}

    public double getSalario(){return salario;}

    public void setSalario(double salario){this.salario = salario;}

    public String getTime(){return time;}

    public void setTime(String time){this.time = time;}
}
