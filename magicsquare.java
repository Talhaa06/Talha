import java.util.Scanner;
public class magicsquare{
    public static void main(String[]args){
    System.out.println("Generate a magic square");
    Scanner sc=new Scanner(System.in);
    int dimensions;
    do{
        System.out.println("the dimensions must be in odd");
        dimensions =sc.nextInt();
    } while ( dimensions%2==0);     

     int [][] magicsquaree = new int [dimensions][dimensions];
     int i = 0;
     int j = dimensions/2;

     for (int value = 1; value<= (dimensions * dimensions); value++){
         magicsquaree[i][j] = value ;
         int new_i  = (i-1 + dimensions)% dimensions ;
         int new_j  = (j + 1 )% dimensions;
         if ( magicsquaree[new_i][new_j]!=0){
            i = ( i + 1)% dimensions;

         }else {
            i = new_i;
            j = new_j;
         }

     }
      
    System.out.println("magic square ");
     for (int row = 0; row < dimensions; row++) {
            for (int col = 0; col < dimensions; col++) {
                System.out.print(magicsquaree[row][col] + "\t");
            }
            System.out.println();
        }

        

    }
}

