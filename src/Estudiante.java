public class Estudiante extends Persona {
    private String matricula;
    private String carrera;
    private double promedio;

    public Estudiante(String nombre, String apellido, String numId, int edad, String direccion, String telefono,
                      String matricula, String carrera, double promedio) {
        super(nombre, apellido, numId, edad, direccion, telefono);
        setMatricula(matricula);
        setCarrera(carrera);
        setPromedio(promedio);
    }

    public String getMatricula() { return matricula; }

    public void setMatricula(String matricula) {
        if (matricula != null && !matricula.trim().isEmpty())
            this.matricula = matricula;
        else {
            System.out.println("Error: La matricula no puede ser 'null'");
            this.matricula = "???";
        }
    }

    public String getCarrera() { return carrera; }

    public void setCarrera(String carrera) {
        this.carrera = carrera;
    }

    public double getPromedio() { return promedio; }

    public void setPromedio(double promedio) {
        this.promedio = promedio;
    }

    public void estudiar() {
        System.out.println("El estudiante " + this.getNombre() + " " + this.getApellido() + " esta estudiando la carrera: " + this.getCarrera());
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Matricula: " + this.getMatricula());
        System.out.println("Carrera: " + this.getCarrera());
        System.out.println("Promedio: " + this.getPromedio());
    }
}