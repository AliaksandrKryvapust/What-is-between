import java.util.Arrays;

public class Source {
    public static void main(String[] args) {
        int a = 1;
        int b = 4;
        System.out.println(Arrays.equals(between(a, b), new int[]{1, 2, 3, 4}));
    }
    public static int[] between(int a, int b) {
        int [] result = new int[b-a+1];
        for (int i = 0; i < result.length; i++) {
            result[i]=a++;
        }
        return result;  // return rangeClosed(a, b).toArray();
    }
}
