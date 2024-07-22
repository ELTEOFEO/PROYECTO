
package Controlador;

public class Postulante {
    protected String nombre;
    protected String fecha;
    protected String bachillerato;
    protected String abanderado;
    protected String discapacidad;
    protected String carrera;
    protected String usuario;
    protected String contraseña;

    public Postulante(String nombre, String fecha, String bachillerato, String abanderado, String discapacidad, String carrera, String usuario, String contraseña) {
        this.nombre = nombre;
        this.fecha = fecha;
        this.bachillerato = bachillerato;
        this.abanderado = abanderado;
        this.discapacidad = discapacidad;
        this.carrera = carrera;
    }
    
}
