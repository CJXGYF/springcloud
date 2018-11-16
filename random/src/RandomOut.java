import java.util.Arrays;
import java.util.Random;

/**
 * @author 陈嘉欣
 * @date 2018/10/31 10:55
 **/
public class RandomOut {

    public static void main(String[] args) {
        Integer[] arr = new Integer[]{1,2,3,4,5};
        for (int i = 0; i < arr.length; i++) {
            int sec = new Random().nextInt(arr.length) + 1;
            int p = sec - 1;
            int temp = arr[i];
            arr[i] = arr[p];
            arr[p] = temp;
        }
        System.out.println(Arrays.toString(arr));
    }
}
