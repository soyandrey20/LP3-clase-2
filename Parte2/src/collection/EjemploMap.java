package collection;

import java.util.HashMap;
import java.util.Map;

public class EjemploMap {
    public static void main(String[] args) {
        Map<Integer,String> map = new HashMap<>();
        map.put(4,"AccionEliminar");
        map.put(3,"AccionMonstrar");
        map.put(20,"Accioncualquiera");
        map.put(11,"Accioncualquiera5");
        map.put(4,"dos");

        String val = map.get(3);

        System.out.println(val);

    }
}
