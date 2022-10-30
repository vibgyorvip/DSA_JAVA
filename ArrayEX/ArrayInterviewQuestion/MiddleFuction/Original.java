import java.util.Arrays;
public class Exercise {
    static int[] middle(int[] arr) {
        return Arrays.copyOfRange(arr, 1, arr.length-1); 
    }
}
