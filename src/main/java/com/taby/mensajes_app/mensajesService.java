/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.taby.mensajes_app;
import java.util.Scanner;
/**
 *
 * @author henry.taby
 */
public class mensajesService {
    public static void crearMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Tu nombre:");
        String nombre = sc.nextLine();
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setAutor_mensaje(nombre);
        
        MensajeDAO.crearMensajeDB(registro);
    }
    public static void listarMensaje(){
        MensajeDAO.leerMensajesDB();
    }
    public static void borrarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Indica el ID del mensaje a borrar");
        int id_mensaje = sc.nextInt();
        MensajeDAO.borrarMensajeDB(id_mensaje);
    }
    public static void editarMensaje(){
        Scanner sc = new Scanner(System.in);
        System.out.println("Escribe tu nuevo mensaje");
        String mensaje = sc.nextLine();
        System.out.println("Indica el ID del mensaje a editar");
        int id_mensaje = sc.nextInt();
        Mensajes registro = new Mensajes();
        registro.setMensaje(mensaje);
        registro.setId_mensaje(id_mensaje);
        MensajeDAO.actualizarMensajeDB(registro);
    }
}
