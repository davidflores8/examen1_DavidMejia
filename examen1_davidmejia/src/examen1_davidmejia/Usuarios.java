/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package examen1_davidmejia;

import java.util.ArrayList;
import java.util.Date;

/**
 *
 * @author Nadina Mazzoni
 */
public class Usuarios {
    String Usuario;
    String contraseña;
    Date fecha;
    String telefono;
    String correo;
    String nombre; 
    String genero;
    ArrayList<Libros>libros=new ArrayList();
    ArrayList<Usuarios>amigos=new ArrayList();

    public Usuarios() {
    }

    public Usuarios(String Usuario, String contraseña, Date fecha, String telefono, String correo, String nombre, String genero) {
        this.Usuario = Usuario;
        this.contraseña = contraseña;
        this.fecha = fecha;
        this.telefono = telefono;
        this.correo = correo;
        this.nombre = nombre;
        this.genero = genero;
    }

    public String getUsuario() {
        return Usuario;
    }

    public void setUsuario(String Usuario) {
        this.Usuario = Usuario;
    }

    public String getContraseña() {
        return contraseña;
    }

    public void setContraseña(String contraseña) {
        this.contraseña = contraseña;
    }

    public Date getFecha() {
        return fecha;
    }

    public void setFecha(Date fecha) {
        this.fecha = fecha;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        this.nombre = nombre;
    }

    public String getGenero() {
        return genero;
    }

    public void setGenero(String genero) {
        this.genero = genero;
    }

    public ArrayList<Libros> getLibros() {
        return libros;
    }

    public void setLibros(ArrayList<Libros> libros) {
        this.libros = libros;
    }

    public ArrayList<Usuarios> getAmigos() {
        return amigos;
    }

    public void setAmigos(ArrayList<Usuarios> amigos) {
        this.amigos = amigos;
    }

   

    @Override
    public String toString() {
        return Usuario;
    }
    
    
    
}
