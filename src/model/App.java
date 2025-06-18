package model;

import exceptions.ParametrosInvalidosException;

import java.util.Scanner;

public class App {

    private Scanner sc = new Scanner(System.in);
    private Integer numeroUm, numeroDois;

    public void appInit(){
       boolean isNumerosValidos = false;
       while (!isNumerosValidos){
           System.out.print("Digite o primeiro número: ");
           numeroUm = sc.nextInt();
           System.out.print("Digite o segundo número: ");
           numeroDois = sc.nextInt();

           try{
               contar(numeroUm, numeroDois);
               isNumerosValidos = true;
           } catch (ParametrosInvalidosException e){
               System.out.println("Ocorreu um erro: " + e.getMessage());
               System.out.println("Será necessário digitar os números novamente!");
           }
       }
    }

    public void contar(Integer numeroUm, Integer numeroDois) throws ParametrosInvalidosException{
        if (numeroUm > numeroDois) {
            throw new ParametrosInvalidosException("O segundo parâmetro deve ser maior que o primeiro");
        }

        var contagem = numeroDois - numeroUm;

        System.out.println("Primeiro número digitado: " + numeroUm);
        System.out.println("Segundo número digitado: " + numeroDois);
        System.out.println("Quantidade de ocorrências do loop: " + contagem);
        System.out.println();

        System.out.println("Iniciando o loop....");

        for ( int i = 1; i <= contagem ; i++){
            System.out.println("Imprimindo o número: " + i);
        }
    }

}
