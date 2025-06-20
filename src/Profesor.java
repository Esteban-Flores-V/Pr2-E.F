public class Profesor extends Persona {
    private String departamento;
    private double salario;
    private int añosDeExperiencia;

    public Profesor(String nombre, String apellido, String numId, int edad, String direccion, String telefono,
                    String departamento, double salario, int añosDeExperiencia) {
        super(nombre, apellido, numId, edad, direccion, telefono);
        setDepartamento(departamento);
        setSalario(salario);
        setAñosDeExperiencia(añosDeExperiencia);
    }

    public String getDepartamento() {return departamento;}

    public void setDepartamento(String departamento) {
        this.departamento = departamento;
    }

    public double getSalario() {return salario;}

    public void setSalario(double salario) {
        this.salario = salario;
    }

    public int getAñosDeExperiencia() {return añosDeExperiencia;}

    public void setAñosDeExperiencia(int añosDeExperiencia) {
        this.añosDeExperiencia = añosDeExperiencia;
    }

    public void enseñar()
    {
        System.out.println("El profesor " + this.getNombre() + " " + this.getApellido() + " esta enseñando en el departamento" +
                "de " + this.getDepartamento());
    }

    @Override
    public void mostrarInfo() {
        super.mostrarInfo();
        System.out.println("Departamento: " + this.getDepartamento());
        System.out.println("Salario: " + this.getSalario());
        System.out.println("Años de Experiencia: " + this.getAñosDeExperiencia());
    }
}
