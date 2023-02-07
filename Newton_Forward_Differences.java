import java.util.*;
public class Newton_Forward_Differences{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,j;
        System.out.println("Enter Array Size: ");
        n = sc.nextInt();
        int x[] = new int[n];
        int y[][] = new int[20][20];
        System.out.println("Value of X: ");
    for( i = 0; i < n; i++){
        x[i] = sc.nextInt();
    }
    System.out.println("Value of Y: ");
    for( i = 0; i < n; i++){
        y[0][i] = sc.nextInt();
    }
    // Calculation Part forward differences
    // for(i = 1; i < n; i++){
    //     for(j = 0; j < n-1;j++){
    //         y[i][j] = y[i-1][j+1] - y[i-1][j];
    //     }
    // }

    // backword differences
    for ( i = 1; i < n; i++)
    {
        for ( j = n - 1; j > 0; j--)
            y[i][j] = y[j][i - 1] - y[j - 1][i - 1];
    }



    //Display Value
    System.out.println("\n"+"X"+"\t"+"Y"+"\t"+"deltaY"+"\t"+"Delte^2Y"+" "+"Delta^3Y"+" "+"Delta^4Y");
    for(i = 0; i < n; i++){
        System.out.print(x[i]+"\t");
        for(j =0 ; j < n-i; j++){
            System.out.print(y[j][i]+"\t");
        }
        System.out.println("\n");
    }
     
    }
}