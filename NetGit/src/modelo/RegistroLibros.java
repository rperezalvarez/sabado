/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

import java.util.ArrayList;

/**
 *
 * @author ronald
 */
public class RegistroLibros {
    private ArrayList<Libro> libros;

    public RegistroLibros() {
        libros = new ArrayList<>();
    }
    
    public void setLibro(Libro libro){
        libros.add(libro);
    }
    
    public Libro getLibro(String ISBN){
        for(Libro libro:libros){
            if(libro.getISBN().equals(ISBN))
                return libro;
        }
        return null;
    }

    @Override
    public String toString() {
        String informacion="";
        for(int indice=0;indice<libros.size();indice++)
            informacion+=libros.get(indice).toString()+"\n\n";
        return informacion; //To change body of generated methods, choose Tools | Templates.
    }
    
    
    
    
    
}
