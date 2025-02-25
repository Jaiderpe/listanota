class MiExcepcion extends Exception {

    public MiExcepcion(String mensaje) {
    super(mensaje);
    }
    }
    public class CustomExceptionExample {
    public static void main(String[] args){

    try {
    validarEdad(15);
    } catch (MiExcepcion e) {
    System.out.println("Error: " + e.getMessage());
    }
    }
    public static void validarEdad(int edad) throws MiExcepcion {

    if (edad < 18) {
    throw new MiExcepcion("Debe ser mayor de edad.");
    }
    System.out.println("Edad válida.");
    }
}

