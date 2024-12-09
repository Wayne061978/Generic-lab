package generics;

import java.util.List;

public class GenericMethod {
    public static <T> void printList(List<T> list) {
        for (T element : list) {
            System.out.println(element);
        }
    }
}