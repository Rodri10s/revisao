package atividades;

import java.util.ArrayList;

public class AtividadeTres {
    public static void main(String[] args) {
        ArrayList numeros = new ArrayList();

    int n=0;

    for (int i=0; i<100; i++){
        if(i==2 || i==3){
            numeros.add(n, i);
            n++;
        }
    if(!(i%2==0 || i%3==0 || i%5==0)){
        numeros.add(n, i);
        n++;
    }
    }
        System.out.println(numeros);
    }
}
