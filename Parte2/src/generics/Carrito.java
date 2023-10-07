package generics;

public class Carrito implements Juguete{

    public Carrito (){
        System.out.println("estoy creando un carrito");
    }

    @Override
    public Integer getId() {
        return 5;
    }
}
