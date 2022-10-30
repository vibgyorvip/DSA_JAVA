public class Exercise {
      public int sumDiagonal(int[][] a) {
          int DiagonalSum=0;
          for(int row=0; row<a.length; row++)
          {
              for(int col=0; col<a[0].length; col++)
              {
                  if(row == col)
                  {
                      DiagonalSum+=a[row][col];
                  }
              }
          }
        return DiagonalSum;
    }
}
