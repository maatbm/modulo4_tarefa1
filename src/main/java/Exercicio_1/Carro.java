package Exercicio_1;

public class Carro {
    private final String mark;
    private final String model;
    private final int year;

    public Carro(String marca, String modelo, int ano) {
        this.mark = marca;
        this.model = modelo;
        this.year = ano;
    }

    public String getDescription(){
        return ("Marca: " + this.mark + ", Modelo: " + this.model) + ", Ano: " + this.year;
    }
}
