import java.util.ArrayList;
import java.util.List;
import java.util.function.Consumer;
import java.util.function.Predicate;

/**
 * 断定型接口学习
 * Created by lizihanglove on 2017/6/22.
 */
public class TestPredicate {

    public static void main(String[] args) {

        ArrayList<String> strings = new ArrayList<>();
        strings.add("1");
        strings.add("2");
        strings.add("3");
        strings.add("4");
        strings.add("5");
        strings.add("6");
        strings.add("7");
        strings.add("8");
        strings.add("9");
        strings.add("10");
        strings.add("11");
        List<String> filteredString = filter(strings, (s) -> s.length() > 1);
        System.out.println(filteredString);

        Predicate<String> stringPredicate = new Predicate<String>() {
            @Override
            public boolean test(String s) {
                return false;
            }
        };

    }

    public static List<String> filter(List<String> strings, Predicate<String> predicate) {
        ArrayList<String> arrayList = new ArrayList<>();
        for (String string : strings) {
            if (predicate.test(string)) {
                arrayList.add(string);
            }
        }
        return arrayList;
    }


}
