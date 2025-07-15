// Para ler e escrever dados em Java, aqui na DIO padronizamos da seguinte forma:
// - new Scanner(System.in): cria um leitor de Entradas, com métodos úteis com prefixo "next";
// - System.out.println:.imprime um texto de Sáida (Output) e pulando uma linha.

import java.util.Scanner;

public class Desafio {
    public static void main(String[] args) {
        //Lê os valores de Entrada:
        Scanner leitorDeEntradas = new Scanner(System.in);
        float valorSalario = leitorDeEntradas.nextFloat();
        float valorBeneficios = leitorDeEntradas.nextFloat();

        float valorImposto = 0;
        if (valorSalario >= 0 && valorSalario <= 1100){
            //Atribiu a aliquota de 5% mediante o salario:
            valorImposto = 0.05F * valorSalario;
        }
        else if (valorSalario >= 1100.01 && valorSalario <= 2500){
            valorImposto = 0.10F * valorSalario;
        } else {
            valorImposto = 0.015F * valorSalario;
        }
        //TODO Criar as demais condições para as aliquotas de 10.00% e 15.00%.

        //Calcula e imprime a Saída (com 2 casas decimais):
        float saida = valorSalario - valorImposto + valorBeneficios;
        System.out.println(String.format("%.2f", saida));

    }
}