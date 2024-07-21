/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Controlador;

/**
 *
 * @author COSAS DE LA Y
 */
public class Gestion_contraseñas extends Arooz_con_papas {
    @Override
    public String creador_contraseñas() {
        // Implementa la lógica para crear contraseñas
        return "ContraseñaEjemplo123";
    }

    @Override
    public String creador_usuarios() {
        // No implementa la lógica para crear usuarios, solo contraseñas
        return "";
    }
}
