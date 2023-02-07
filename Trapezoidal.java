import java.util.Scanner;

public class Trapezoidal{
    static float functionCalc(float x){
    //    float res = 1/(1 + (x*x));
    float res = x * x * x;
       return res;
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int n,i,k;
        System.out.println("Enter No of Interval: ");
        n = sc.nextInt();
        float arr[] = new float[n+1];
        float lb ,ub ,s1 = 0,s2 =0,s3 = 0,s4 =0,s5 = 0,s;
        System.out.println("Enter Lower Bound: ");
        lb = sc.nextFloat();
        System.out.println("Enter Upper Bound: ");
        ub = sc.nextFloat();
        float h = (ub-lb)/n;
        System.out.println("Value of H is  :" + h);
        // // Initializing the variable `x` to the value of `lb`.
         float x = lb;
        for(i = 0; i <= n; i++){
         arr[i] = functionCalc(x);
         System.out.println("x value :"+x);
         x += h;
        }
        for(i = 0; i <= n; i++){
            System.out.println(arr[i]+" ");
        }
        
        s = arr[0]+arr[arr.length-1];
        // System.out.println(s);
        for ( k = 1; k < arr.length-1; k++) {
            s1 = s1 + arr[k];
            // System.out.println(s1);
        }
        
        float ApproxRes = h/2*(s+2*s1);
        System.out.println("Trapezoidal Result Is:"+ApproxRes);

        // Simpson's 1/3 Rule
       for(k = 1; k < arr.length -1; k++){
            if(k % 2 == 1){
                s2 += arr[k];              
            }
            else{
                s3 +=arr[k];
            }
       }
       float ApproxResSimpson = h/3*(s+(4*s2)+2*(s3));
       System.out.println("Simpson's 1/3 Result Is:"+ApproxResSimpson);

       //Simpson's 3/8 Rule
       for(k = 1; k < arr.length-1; k++){
        if(k % 3  == 0){
            s4 += arr[k]; 
        //    System.out.println("value is: "+s4);
        }
        
        else{
            s5 += arr[k];
        }
       }
    //    System.out.println("value is: "+s4);
       float Simpson_3By_8Approx =3*h/8*((s+(3*s5)+(2*s4)));
       System.out.println("Simpson's 3/8 Result is: "+Simpson_3By_8Approx);

      sc.close();
    }
}