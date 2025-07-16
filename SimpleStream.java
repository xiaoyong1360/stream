import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SimpleStream {
    public static void main2(String[] args) {
        List<Integer> li = List.of(6 ,4 ,3, 2, 6, 9 ,1 ,2);
//        List<Integer> li = new ArrayList<>();// List.of(6 ,4 ,3, 2, 6, 9 ,1 ,2);
        Optional<Integer> max = li.stream().max(Integer::compareTo);
        if(max.isEmpty()){
            System.out.println("empty");
        }
        else {
            System.out.println(max.get());
        }
        Integer integer = li.stream().max(Integer::compareTo).orElse(0);
        System.out.println(integer);

    }
    public static void main(String[] args) {
        Optional<String> optional1 = Optional.of("hello");
        Optional<String> optional2 = Optional.empty();
        Optional<String> optional3 = Optional.ofNullable(null);
//        Optional<String> optional4 = Optional.of(null);

//        System.out.println(optional3.isPresent());
        optional3.ifPresentOrElse(System.out::print, () -> System.out.println("empty") );



//        System.out.println("optional1 isPresent: " + optional1.isPresent()); // true
//        System.out.println("optional1 isEmpty: " + optional1.isEmpty());   // false
//
//        System.out.println("optional2 isPresent: " + optional2.isPresent()); // false
//        System.out.println("optional2 isEmpty: " + optional2.isEmpty());   // true
    }}
