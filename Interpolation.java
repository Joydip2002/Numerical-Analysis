import java.util.Scanner;

public class Interpolation {
    static int calc(int x){
        int res = (x*x*x)+5*x*x+2*x+3;
        return res;
    }
    public static void main(String[]args){
       int ip, ipp,h;
        Scanner sc = new Scanner(System.in);
       System.out.print("Enter Initial point: ");
        ip = sc.nextInt();
        System.out.print("Enter Height: ");
        h = sc.nextInt();
        System.out.print("Enter Interpolating Number: ");
        ipp = sc.nextInt();

        for(int i = 0; i < ipp; i++){
            int Result = calc(ip);
            ip  += h;
            System.out.print("X value Is:"+ip+" ");
            System.out.print(" Y value Is: "+Result+"\n");
        }

       sc.close();
    }
    
}
