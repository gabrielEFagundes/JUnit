package com.tests.methods;

public class Vogais {

    public int contar(String palavra){
        char[] arr = palavra.toLowerCase().toCharArray();
        char[] vogais = {'a', 'e', 'i', 'o', 'u'};
        int counter = 0;

        for(int i = 0; i < arr.length; i++){
            for(int y = 0; y < vogais.length; y++){
                if(arr[i] == vogais[y]){
                    counter++;
                }
            }
        }
        return counter;
    }

}
