/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package modelo;

/**
 *
 * @author antonio.jose
 */
public class Academia {
    //Atributos
    private String nombre;
    private int numAlumnos;
    private String director;
    private float ratioAlumnos;
    public static Cursos curso;
    public enum Cursos{
        JAVA, C, DISEÑOWEB, HTML, CSS;
    }
    
    public Academia(){
        nombre = null;
        numAlumnos = 0;
        director = null;
        ratioAlumnos = 5;
        cursos=Cursos.C;
    }

    public Academia(String nombre, int numAlumnos, String director, float ratioAlumnos) {
        this.nombre = nombre;
        this.numAlumnos = numAlumnos;
        this.director = director;
        this.ratioAlumnos = ratioAlumnos;
    }

   
    	
    public getNombre() {
    	return nombre;
    }
    
}
