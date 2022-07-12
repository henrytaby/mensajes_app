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
public class Inicio {
    public static void main(String[] args){
        Scanner sc = new Scanner(System.in);
        int opcion = 0;
        do{
            System.out.println("-------------------------");
            System.out.println(" Aplicación de mensajes");
            System.out.println("1. Crear mensaje");
            System.out.println("2. Listar mensajes");
            System.out.println("3. Eliminar mensaje");
            System.out.println("4. Editar mensaje");
            System.out.println("5. Salir");
            // leemos la opción del  usuario
            opcion = sc.nextInt();
            switch(opcion){
                case 1:
                    mensajesService.crearMensaje();
                    break;
                case 2:
                    mensajesService.listarMensaje();
                    break;
                case 3:
                    mensajesService.borrarMensaje();
                    break;
                case 4:
                    mensajesService.editarMensaje();
                    break;
                default:
                    System.out.println("Opción incorrecta");
                    break;
            }
        }while(opcion !=5);       
    }
}
        /*
        Conexion conexion = new Conexion();
        try(Connection cnx = conexion.get_connection()){
            
        }catch(Exception e){
            System.out.println(e);
        }
*/
