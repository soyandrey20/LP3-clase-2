package src.prototype;

public class Estudiante {
    private long id;
    private int creditos;
    private String nombre;


    public Estudiante(long id, int creditos, String nombre) {
        this.id = id;
        this.creditos = creditos;
        this.nombre = nombre;
    }

    public Estudiante(Estudiante estudiante) {
        this.nombre = estudiante.nombre;
        this.id = estudiante.id;
        this.creditos = estudiante.creditos;
    }


    @Override
    public Estudiante clone() {
        return new Estudiante(this);
    }

    @Override
    public String toString() {
        return "Estudiante{" +
                "id=" + id +
                ", creditos=" + creditos +
                ", nombre='" + nombre + '\'' +
                '}';
    }
}
