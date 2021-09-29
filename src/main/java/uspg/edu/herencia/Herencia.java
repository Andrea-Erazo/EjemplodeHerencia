/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package uspg.edu.herencia;



import uspg.edu.model.Entrenador;
import uspg.edu.model.Futbolista;
import uspg.edu.model.IntegrantesSeleccion;
import uspg.edu.model.Masajista;


/**
 *
 * @author Usuario
 */
public class Herencia {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
         IntegrantesSeleccion integrantes[] = new IntegrantesSeleccion[3];
         
         Entrenador guardiola = new Entrenador(2,3,"pep","guardiola",34);
         Futbolista messi = new Futbolista(23, "delantero",3,"Leonel","Messi",32);
         Masajista juan = new Masajista("sexta",5,3,"juan","Hernandez",34);
         
        integrantes[0] = guardiola;
        integrantes[1] = messi;
        integrantes[2] = juan;
        
        System.out.println("Todos los integrantes comienzan una concentración. (Todos ejecutan el mismo método)");
         for (int i = 0; i < integrantes.length; i++){
             System.out.print(integrantes[i].getNombre()+ " " + integrantes[i].getApellidos()+ "->");
              integrantes[i].concentrarse();
         }
         System.out.println("***********************************************");
         System.out.println("Todos los integrantes viajan para jugar partido. (Todos ejecutan el mismo método)");
         for (int i = 0; i < integrantes.length; i++){
             System.out.print(integrantes[i].getNombre()+ " " + integrantes[i].getApellidos()+ "->");
              integrantes[i].viajar();
                 
         
        
        
         
         }
    }
        
        
      
}
        
        
        
    

