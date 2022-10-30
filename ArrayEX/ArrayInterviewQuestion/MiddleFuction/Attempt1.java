import java.util.Arrays;

public class Exercise {
    static int[] middle(int[] arr) {
        // TODO 
        int[] result= new int[2];
        for(int index=1 , i=0; index< arr.length-1;index++,i++)
        {
            result[i]=arr[index];
        }
        return result;
    }

}
