/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package procedimientos;

import java.util.Scanner;

/**
 *
 * @author DELL
 */
public class Main {

    public static void main(String[] args) {
        
        Scanner sc = new Scanner(System.in);
        System.out.println("Digite la operación que quiere realizar siendo 1 suma, 2 resta, 3 división");
        int valor= sc.nextInt();
                
        verificarS(valor);
    }
    
    public static void verificarS(int valor) {

        switch (valor) {
            case 1:
                //Suma
                
                Scanner Teclado = new Scanner(System.in);
                
                System.out.println("Inserta el primer número: ");
                int num1 = Teclado.nextInt();
                
                System.out.println("Inserta el segundo número: ");
                int num2= Teclado.nextInt();
                        
                
                int resultado=num1+num2;
                System.out.println("El resultado de la suma es: " +resultado);
                
                break;
                
                
            case 2:
                //Resta
                Scanner Tecla = new Scanner(System.in);
                 
                System.out.println("Inserta el primer número: ");
                double nro1 = Tecla.nextDouble();
                
                System.out.println("Inserta el segundo número: ");
                double nro2 = Tecla.nextDouble();
                
                double result=nro1-nro2;
                
                break;
            
            case 3:
                //División
                Scanner Tecl = new Scanner(System.in);
                System.out.println("Inserta el primer número: " );
                double nm1 = Tecl.nextDouble();
                
                System.out.println("Inserta el segundo número: ");
                double nm2 = Tecl.nextDouble();
                
                
                double resultad= nm1/nm2;
                
                //Suma s = new Suma(10, 2);
                //double t = s.sumar();
                //double resultad = s.resultado;
                //System.out.println("La suma es igual a " + resultad);


        }
    }
    /*
        Suma s = new Suma(10, 2);
        double t = s.sumar();
        double resultad = s.resultado;
        System.out.println("La suma es igual a " + resultad);

        Resta r = new Resta(5, 3);
        double e = r.restar();
        double result = r.resultado;
        System.out.println("La resta es igual a: " + result);

        Division d = new Division(t, 2);
        d.dividir();
        double resul = d.resultado;
        System.out.println("El resultado de la operación es: " + resul);

    } */
}


