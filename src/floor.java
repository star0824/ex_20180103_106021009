import java.util.Scanner;

public class floor {
    public static void main(String[] args){
        Scanner scn = new Scanner(System.in);
        int n = scn.nextInt();
        System.out.println(fun(n));
    }
    public static int fun(int a){
        if (a==1){
            return 1;
        }
        else {
            return a*fun(a-1);
        }
    }
}
