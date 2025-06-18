public class Profesor extends Persona {
    private String departamento;
    private double salario;
    private int añosDeExperiencia;

    public Profesor(String nombre, String apellido, String numId, int edad, String direccion, String telefono,
                    String departamento, double salario, int añosDeExperiencia) {
        super(nombre, apellido, numId, edad, direccion, telefono);

    }

}
