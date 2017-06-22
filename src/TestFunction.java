import java.util.ArrayList;
import java.util.List;
import java.util.Random;
import java.util.function.Function;
import java.util.function.Supplier;

/**
 * 函数型接口学习
 * Created by lizihanglove on 2017/6/22.
 */
public class TestFunction {

    public static void main(String[] args){

    String raw = "bfubsfGKUFUSYFOSFUSHUSHGUSHG";
        String handleString = handleString(raw, String::toLowerCase);
        System.out.println(handleString);

        Function<String, String> fun = new Function<String, String>() {
            @Override
            public String apply(String s) {
                return null;
            }
        };

    }
    public static String handleString(String raw,Function<String,String> fun){
      return   fun.apply(raw);
    }
}
