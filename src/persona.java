public class persona {
    private String nombre;
    private int edad;
    private String sexo;
    private  String direccion;

    public persona(String nombre, int edad, String sexo, String direccion) {
        this.nombre = nombre;
        this.edad = edad;
        this.sexo = sexo;
        this.direccion = direccion;
    }

    public String getNombre() {
        return nombre;
    }
    public void MasterInfo(){
        System.out.println("Nombre: "+nombre);
        System.out.println("Edad: "+edad);
        System.out.println("Sexo: "+sexo);
        System.out.println("Direccion: "+direccion);
    }
}
