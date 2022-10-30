public class Exercise {
    void rotateMatrix(int[][] matrix) {
        // TODO
        int row = matrix.length;
        int col = matrix[0].length;
        
        for(int i =0 ; i< row; i++)
        {
            for(int j=0; j<i;j++)
            {
                int temp = matrix[i][j];
                matrix[i][j]=matrix[j][i];
                matrix[j][i]=temp;
            }
        }
        
        for(int[] arr: matrix)
        {
            int i=0;
            int j=col-1;
            
            while(i<j)
            {
                int temp=arr[i];
                arr[i]=arr[j];
                arr[j]=temp;
                i++;
                j--;
            }
        }
        
    }

}
