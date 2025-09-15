package com.tests.methods;

public class VerificarParidade {

    public String parOuImpar(int num){
        if(num % 2==0){
            return "Par".toLowerCase();
        }else{
            return "Impar".toLowerCase();
        }
    }

}
