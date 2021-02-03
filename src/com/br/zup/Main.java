package com.br.zup;


public class Main {

    public static void main(String[] args) {
	    IO entradaESaida = new IO();
	    Contador calculadora = new Contador();
	    calculadora.primeiraParcela = entradaESaida.pedirUmDado("Digite primeiro numero").nextInt();
	    calculadora.segundaParcela = entradaESaida.pedirUmDado("Pedir segundo numero").nextInt();

	    entradaESaida.saidaDeDados("O valor total da soma é "+calculadora.soma());
	    entradaESaida.saidaDeDados("O valor total da subtração é "+calculadora.subtrair());

    }
}
