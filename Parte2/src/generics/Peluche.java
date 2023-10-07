package generics;

public class Peluche implements Juguete {

    public Peluche() {
        System.out.println("estoy creando un peluche");
    }

    @Override
    public Integer getId() {
        return 4;
    }
}
