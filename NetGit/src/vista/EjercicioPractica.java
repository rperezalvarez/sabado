/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package vista;

import modelo.Libro;
import modelo.RegistroLibros;

/**
 *
 * @author ronald
 */
public class EjercicioPractica {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        System.out.println("Hola");
        Libro libro=new  Libro("1221","Juan", "JAva");
        Libro libro1=new  Libro("567","Deitel", "C++");
        
//        System.out.println(libro.toString());
        
        RegistroLibros registroLibros=new RegistroLibros();
        registroLibros.setLibro(libro);
        registroLibros.setLibro(libro1);
        System.out.println(registroLibros.toString());
        
        System.out.println("Encontrado\n"+registroLibros.getLibro("1221"));
        
    }
    
}
