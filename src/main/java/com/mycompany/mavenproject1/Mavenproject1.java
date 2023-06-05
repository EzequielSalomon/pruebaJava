/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject1;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 *
 * @author Usuario
 */
public class Mavenproject1 {


    public static void main (String[]args) throws IOException {


System.out.println("Ingrese el primer numero:");
Integer numero1 = cargarNumero();

System.out.println("Ingrese el segundo numero:");
Integer numero2 = cargarNumero();

System.out.println("Ingrese el tercer numero:");
Integer numero3 = cargarNumero();

calcularNumeroMayor(numero1, numero2,numero3);
calcularNumeroMenor(numero1, numero2,numero3);
}
    private static Integer cargarNumero (){
   InputStreamReader capturarTeclado = new InputStreamReader(System.in);
   BufferedReader buffer = new BufferedReader(capturarTeclado);
   String strNumero = buffer.readLine();
   Integer numero = Integer.parseInt(strNumero);
   return numero;
    }
    
   private static void calcularNumeroMayor(Integer Numero1, Integer Numero2,Integer Numero3) {
   
          
 Integer numeroMayor = numero1;

if (numero2 > numeroMayor) {
    numeroMayor = numero2;
}

if (numero3 > numeroMayor) {
    numeroMayor = numero3;
}

}
    
      private static void calcularNumeroMenor(Integer Numero1, Integer Numero2,Integer Numero3) {
   

Integer numeroMenor = numero1;

if (numero2 < numeroMenor) {
    numeroMenor = numero2;
}

if (numero3 < numeroMenor) {
    numeroMenor = numero3;
}
   }
}


 