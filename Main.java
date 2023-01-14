public class Main {
    public static void main(String[] args) {
        Persona miPersona = new Persona(3,"Ana","65656565");

        miPersona.setNombre("Julia");
        miPersona.setEdad(8);
        miPersona.setTelefono("78787878");
        System.out.println("Mi Persona es:" + miPersona.getNombre());
        System.out.println("Mi Persona es:" + miPersona.getEdad());
        System.out.println("Mi Persona es:" + miPersona.getNombre());

    }
}


