/**
 * Created by Administrator on 2017/10/13 0013.
 */
public class ReverseIntegerTest {

    public static void main(String args[]) {
        ReverseInteger ri = new ReverseInteger();
        System.out.println(ri.reverse(Integer.MAX_VALUE));
        for (int i = 0; i < 20; i++) {
            int num  = (i + 1) * (i + 1);
            System.out.println(num + ":" + ri.reverse(num));
        }
    }
}
