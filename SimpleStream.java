import java.util.ArrayList;
import java.util.List;
import java.util.Optional;

public class SimpleStream {
    public static void main(String[] args) {
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
}
