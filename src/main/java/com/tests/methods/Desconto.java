package com.tests.methods;

public class Desconto {

    public double calcularDesconto(double preco, double desconto){
        if(desconto < 0 || desconto > 100){
            throw new IllegalArgumentException();
        }

        double descontoReal = desconto/100;
        return preco-(preco*descontoReal);
    }

}
