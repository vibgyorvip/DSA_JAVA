public class Exercise {
    public static void main(String [] args)
    {
        Exercise obj = new Exercise();
        int[] arr = {1,2,3,4,5,6,8,9,10};
        obj.missingNumber(arr);
    }
    public void missingNumber(int[] intArray) {
        // TODO
        int number =1;
        for(int index =0 ; index< intArray.length ; index++)
        {
            if(intArray[index] == number )
            {
                number++;
            }
            else{
                System.out.println("missing number found :" + number);
                number++;
                index--;
            }
        }
    }

}
