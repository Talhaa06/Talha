import java.util.Scanner;
public class addmatrix {
    public static void main(String[] args) {
      System.out.println("generate a additive matrix");
      Scanner sc = new Scanner(System.in);
      int [][] a = {{1,2,3},{1,2,3},{1,2,3}};
      int [][] b = {{1,2,3}, {1,2,3},{1,2,3}};
        int [][] sum = new int [a.length][b.length];
        for (int i=0; i< a.length;i++){
            for (int j=0; j<a[0].length; j++){
            

                sum[i][j] = a[i][j]+ b[i][j];
            }
        }
        
        System.out.println("sum of matrixes");

       for ( int i = 0 ; i< a.length; i++){
        for (int j = 0 ; j< a[0].length; j++){
            System.out.print(sum[i][j] + " ");
        }
        System.out.println();
       }


    }
}
