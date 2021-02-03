package com.br.zup;

public class Contador {
    int primeiraParcela;
    int segundaParcela;

    public int soma(){
        int total = primeiraParcela + segundaParcela;
        return total;
    }

    public int subtrair(){
        if(new Validador().oPrimeiroÉMaior(primeiraParcela, segundaParcela)){
            return primeiraParcela - segundaParcela;
        }
        return segundaParcela - primeiraParcela;
    }
}
