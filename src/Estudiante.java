public class Estudiante extends Persona {
    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String apellido, String numId, int edad, String direccion, String telefono,
                      String matricula, String carrera, double promedio) {
        super(nombre, apellido, numId, edad, direccion, telefono);
        this.matricula = matricula;
        this.carrera = carrera;
        this.promedio = promedio;
    }
}
