package Servicio;

import Entidades.Pelicula;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.Iterator;
import java.util.Scanner;
import utilidades.Comparadores;

public class ServiPelicula {

    Scanner leer = new Scanner(System.in).useDelimiter("\n");

    public Pelicula subirPelicula() {
        String Titulo, Autor, opc;
        int Duracion;

        ArrayList<Pelicula> pelis = new ArrayList();

        do {
            System.out.println("Ingrese titulo");
            Titulo = leer.next();
            System.out.println("Ingrese autor");
            Autor = leer.next();
            System.out.println("Ingrese la duracion");
            Duracion = leer.nextInt();

            Pelicula newpeli = new Pelicula(Titulo, Autor, Duracion);
            pelis.add(newpeli);

            System.out.println("Desea agregar otra pelicula? s/n");
            opc = leer.next();

        } while (!opc.equals("n"));

        System.out.println("INFORMACION GENERAL DE LAS PELICULAS");

        for (Pelicula pel : pelis) {

            System.out.println("Lista de peliculas" + pel.toString());
        }

        System.out.println("    ");
        System.out.println("PELICULAS POR DURACION MAYOR A 1 HORA");

        for (int i = 0; i < pelis.size(); i++) {
            Pelicula p = pelis.get(i);
            if (p.getDuracion() > 1) {
                System.out.println(p.toString());
            }

        }

        System.out.println(" ");
        System.out.println("PELICULAS CON DURACION DE MAYOR A MENOR");
        
        Collections.sort(pelis, Comparadores.ordenDuracionDescendente);
        
        for (Pelicula peli : pelis) {
            System.out.println(peli);
        }
        
        System.out.println(" ");
        System.out.println("PELICULAS ORDENADAS POR TITULO ALFABETICAMENTE");
        
        Collections.sort(pelis, Comparadores.ordenTituloAlfabeticamente);
        
        for (Pelicula peli : pelis) {
            System.out.println(peli);
            
        }
        
        System.out.println(" ");
        System.out.println("PELICULAS ORDENADAS POR AUTOR ALFABETICAMENTE");
        
        Collections.sort(pelis, Comparadores.ordenAutorAlfabeticamente);
        
        for (Pelicula peli : pelis) {
            System.out.println(peli);
            
        }


        
        return new Pelicula(Titulo, Autor, Duracion);
    }

}
