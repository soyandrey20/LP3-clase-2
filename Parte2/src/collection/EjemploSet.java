package collection;

import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.TreeSet;

public class EjemploSet {
    public static void main(String[] args) {
        Set<Integer> integers = new TreeSet<>();
        integers.add(1);
        integers.add(5);
        integers.add(1);

        System.out.println(integers);
        integers.addAll(Set.of(40,80,10,42,12,65,20,1,2,3,4,5,6,7,8,9));
        integers.forEach(str -> System.out.print(str + " "));
    }
}
