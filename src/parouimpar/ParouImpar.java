/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package parouimpar;

import java.util.Scanner;

/**
 *
 * @author Vinicius
 */
public class ParouImpar {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
       Scanner e=new Scanner(System.in);
       
       int numero;
        System.out.println("Digite um Numero :");
        numero=e.nextInt();
        if (numero%2==0){
            System.out.println("Seu numero é par +5 é igual a : "+(numero+5));
        }else {
            System.out.println("Seu numero Impar +8 é igual a :"+(numero+8));
        }
    }
    
}
