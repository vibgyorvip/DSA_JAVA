public class Exercise {
    public boolean isUnique(int[] intArray) {
        // TODO
        for(int index1=0; index1<intArray.length;index1++)
        {
            for(int index2=index1+1; index2<intArray.length;index2++)
            {
                if(intArray[index1]== intArray[index2])
                return false;
            }
        }
        return true;
    }

}
