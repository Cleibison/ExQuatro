/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exquatro;

import java.util.Scanner;

/**
 *
 * @author user
 */
public class ExQuatro {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Scanner numero = new Scanner(System.in);
        int entrada;//armazena a entrada digitada pelo usuario
        double resultado;// resultado
        System.out.println("Digite um numero: ");
        entrada = numero.nextInt();//entrada recebe numero, nextInt pq sera um numero inteiro
        resultado = entrada*entrada; // numero ao quadrado é n*ele mesmo entao entrada*entrada
        System.out.println(resultado);
    }
    
}
