import org.w3c.dom.ls.LSOutput;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.OptionalDouble;

public class SimpleStream {
    public static void main(String[] args) {
        List<Integer> li = List.of(6, 4, 3, 2, 6, 9, 1, 2);

        OptionalDouble average = li.stream().mapToDouble(Integer::doubleValue).average();
        Optional<Double> ad = Optional.ofNullable(null);
        System.out.println(ad.isPresent() );

        double t;
        if (average.isPresent()) {
            t = average.getAsDouble();
            System.out.println(t);
        } else {
            System.out.println("empty");
        }




    }

}