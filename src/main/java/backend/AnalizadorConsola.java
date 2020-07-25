/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

import java.util.Scanner;

/**
 *
 * @author lguilln
 */
public class AnalizadorConsola {

    
    Scanner entrada = new Scanner(System.in);
    String base1;
    String base2;
    
    System.out.println("Analizador de Consola");
  
    System.out.print("Cadena 1: ");
    base1 = entrada.nextLine(); //Secuencia1 
    System.out.println("");
    System.out.print("Cadena 2: ");
    base2 = entrada.nextLine(); //Secuencia 2
    String repetida = "";  //variable que almacena el resultado, es el conjunto ordenado de las bases de mayor tamaño en ambas secuencias
    
        //Desarrollo de Cadena Repetida
        String cadena_r = null;
         if(base1.length() >= base2.length()){
            for (int r = base1.length(); r >= 0; r--)  
                         {
                                  for (int l = 0; l < r; l++){
                                      if (base2.contains(base1.substring(l, r)) && 
 
                    repetida.length() < base1.substring(l, r).length())
                                  repetida = base1.substring(l, r);
                                          }
            }
        }else if(base2.length() >= base1.length()) //Se aplica la condicion de verifica la base de mayor tamaño
                {

                    for (int r = base2.length(); r >= 0; r--)
                    {
            
                      for (int l = 0; l < r; l++) {
                         if (base1.contains(base2.substring(l, r)) && 
                             repetida.length() < base2.substring(l, r).length()) {
                               repetida = base2.substring(l, r);
                                  }
                        }
            
        }
        
    }
System.out.println("Resultado: "+ repetida); //Muestra la cadena mayor
    

