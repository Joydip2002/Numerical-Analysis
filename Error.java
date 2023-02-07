import java.util.Scanner;

public class Error {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter Exact Value: ");
        float trueVal  = sc.nextFloat();
        System.out.println("Enter Approxiamate Value: ");
        float approxValue = sc.nextFloat();
             
        float absoluteError  = (trueVal - approxValue);
        System.out.println("Absolute Error: "+absoluteError);

        float relativeError = (absoluteError/trueVal);
        System.out.println("Relative Error: "+relativeError);
        float percentageError = (relativeError*100);
        System.out.println("Percentage Error is: "+percentageError+"%");
        sc.close();
    }
}
