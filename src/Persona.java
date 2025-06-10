// Pr2 JOO -- Esteban Flores

public class Persona {
    private String nombre;
    private String apellido;
    private String numId; /**(DNI, pasaporte, etc.) */
    private int edad;
    private String direccion;
    private String telefono;

    public Persona (String nombre, String apellido, String numId, int edad, String direccion, String telefono) {
        setNombre(nombre);
        setApellido(apellido);
        setNumId(numId);
        setEdad(edad);
        setDireccion(direccion);
        setTelefono(telefono);
    }

    public String getNombre() {
        return nombre;
    }

    public void setNombre(String nombre) {
        if (nombre != null && !nombre.trim().isEmpty()) {
            this.nombre = nombre;
        } else {
            System.out.println("Error: El Nombre no puede ser nulo");
            this.nombre = "???";
        }
    }

    public String getApellido() {
        return apellido;
    }

    public void setApellido(String apellido) {
        if (apellido != null && !apellido.trim().isEmpty()) {
            this.apellido = apellido;
        } else {
            System.out.println("Error: El Apellido no puede ser nulo");
            this.apellido = "???";
        }
    }

    public String getNumId() {
        return numId;
    }

    public void setNumId(String numId) {
        this.numId = numId;
    }

    public int getEdad() {
        return edad;
    }

    public void setEdad(int edad) {
        if (edad < 0) {
            throw new IllegalArgumentException("La edad no puede ser negativa.");
        }
        this.edad = edad;
    }

    public String getDireccion() {
        return direccion;
    }

    public void setDireccion(String direccion) {
        this.direccion = direccion;
    }

    public String getTelefono() {
        return telefono;
    }

    public void setTelefono(String telefono) {
        this.telefono = telefono;
    }

    public void mostrarInfo() {
        System.out.println("Nombre y Apellido: " + this.getNombre() + " " + this.getApellido());
        System.out.println("Numero de identificacion: " + this.getNumId());
        System.out.println("Edad: " + this.getEdad());
        System.out.println("Direccion: " + this.getDireccion());
        System.out.println("Telefono: " + this.getTelefono());
    }

    public void saludo() {
        System.out.println("Hola mi nombre es " + this.getNombre() + " " + this.getApellido());
    }
}
