/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package backend;

/**
 *
 * @author lguilln
 */
public class Analizador {

    public String cadenaRepetida(String base1, String base2, String repetida) //variables de entrada y cadena repetida en ADN
    {
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
    cadena_r = repetida;
    return cadena_r;
}
    
}
