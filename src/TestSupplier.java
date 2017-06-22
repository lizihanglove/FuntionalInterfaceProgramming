import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Supplier;

/**
 * 供给型接口学习
 * Created by lizihanglove on 2017/6/22.
 */
public class TestSupplier {

    public static void main(String[] args){

        int num = 10;
        List<Integer> numberList = getNumberList(num, () ->new Random().nextInt(100));
        numberList.forEach(System.out::println);

        Supplier<Double> supplier = new Supplier<Double>() {
            @Override
            public Double get() {
                return null;
            }
        };

    }
    public static List<Integer> getNumberList(int num, Supplier<Integer> sup){
        ArrayList<Integer> doubles = new ArrayList<>();
        for (int i = 0; i < num; i++) {
            Integer integer = sup.get();
            doubles.add(integer);
        }
     return doubles;
    }


}
