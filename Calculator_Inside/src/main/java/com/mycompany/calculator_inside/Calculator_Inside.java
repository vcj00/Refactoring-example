/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */
package calculadora;

import java.util.Scanner;

public class Calculator_Inside {

    public static void main(String[] args) {

        int opc;
        int operador1;
        int operador2;
        Scanner sc = new Scanner(System.in);
        Calculadora c1 = new Calculadora();

        do {

            System.out.println(" Bienvenido a la calculadora elige una opción");
            System.out.println("1. Sumar");
            System.out.println("2.Restar");
            System.out.println("3.Multiplicar");
            System.out.println("4.Dividir");
            /*System.out.println("5.Sumatorio");
            System.out.println("6.Factor");*/

            opc = sc.nextInt();

            switch (opc) {

                case 1:
                    System.out.println("Introduce 2 numeros a operar");
                    operador1 = sc.nextInt();
                    operador2 = sc.nextInt();

                    System.out.println("Tu resultado es: "+c1.sumar(operador1,operador2));
                    break;

                case 2:
                    System.out.println("Introduce 2 numeros a operar");
                    operador1 = sc.nextInt();
                    operador2 = sc.nextInt();
                     System.out.println("Tu resultado es: "+     c1.restar(operador1,operador2));
               
                    break;

                case 3:
                    System.out.println("Introduce 2 numeros a operar");
                    operador1 = sc.nextInt();
                    operador2 = sc.nextInt();
                     System.out.println("Tu resultado es: "+     c1.multiplicar(operador1,operador2));
               
                    break;

                case 4:
                    System.out.println("Introduce 2 numeros a operar");
                    operador1 = sc.nextInt();
                    operador2 = sc.nextInt();
                     System.out.println("Tu resultado es: "+  c1.dividir(operador1,operador2));
                  
                    break;

            }//switch end

        } while (opc != 0);

    }//main end
}//class end
