public class Exercise {
    public String maxProduct(int[] intArray) {
        // TODO
        int maxProduct=0;
        String temp="";
        
        for(int index1=0; index1<intArray.length;index1++)
        {
            for(int index2= index1+1 ; index2<intArray.length; index2++)
            {
                if(intArray[index1]*intArray[index2] > maxProduct)
                {
                    maxProduct=intArray[index1]*intArray[index2] ;
                    temp=Integer.toString(intArray[index1])+","+Integer.toString(intArray[index2]);
                }
            }
        }
        return temp;
    }

}
