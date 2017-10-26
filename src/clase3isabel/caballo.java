/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package clase3isabel;

/**
 *
 * @author LAB08
 */
public class caballo {
    String altura;
    String color;
    String peso;
    String raza;
    int patas= 4, edad;
    
    //Metodo constructor
    public caballo(String nuevoNombre)
    {
    raza = nuevoNombre;
}
//Metodo get y set de la clase
    public void relinchar()
    {
        
        
   }
    //Metodo para obtener la raza del caballo
    public String obtenerRaza()
        {
        //Sentencia obligatoria de retorno
        return raza;    
        }
         public int obtenerEdad()
         {
         //Sentencia obligatoria de retorno
          return edad;
           
         }
        
            
       
    }