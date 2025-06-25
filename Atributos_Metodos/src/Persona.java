import  java.util.Scanner;

public class Persona {
    private String nombre;
    private int edad;

    public Persona(String nombre, int edad) {
        this.nombre = nombre;
        this.edad = edad;
    }

    public void informacion(){
        System.out.println("Nombre: "+ nombre);
        System.out.println("Edad: " + edad + " años" );
    }

    public void cumplir(){
        edad++;
        System.out.println(nombre + " Ha cumplido años. Nueva edad: "+ edad);
    }

    public String getNombre() {
        return nombre;
    }

    public int getEdad() {
        return edad;
    }

    public void setNombre(String nuevoNombre) {
        nombre = nuevoNombre;
    }

    public void setEdad(int nuevaEdad) {
        edad = nuevaEdad;
    }

    public static void main (String [] args){
        Persona persona1= new Persona("Jhonatan", 25);

        persona1.informacion();

        persona1.cumplir();
        persona1.setNombre("Juan");
        persona1.setEdad(30);

        System.out.println("\nInformacion actualizada:");
        persona1.informacion();
    }
}
