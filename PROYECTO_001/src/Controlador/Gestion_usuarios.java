/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author COSAS DE LA Y
 */


public class Gestion_usuarios extends Arooz_con_papas {
    @Override
    public String creador_usuarios() {
        // Implementa la lógica para crear usuarios
        return "UsuarioEjemplo";
    }

    @Override
    public String creador_contraseñas() {
        // No implementa la lógica para crear contraseñas, solo usuarios
        return "";
    }
}