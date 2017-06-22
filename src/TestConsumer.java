import java.util.function.Consumer;

/**
 * 消费者接口学习
 * Created by lizihanglove on 2017/6/22.
 */
public class TestConsumer {

    public static void main(String[] args){
        double money = 1000;
        happy(money,c->System.out.println("我使用了"+1000+"元！很happy!"));
        Consumer<Double> con = new Consumer<Double>() {
            @Override
            public void accept(Double aDouble) {

            }
        };
    }
    public static void happy(Double money, Consumer<Double> consumer){
        consumer.accept(money);


    }


}
