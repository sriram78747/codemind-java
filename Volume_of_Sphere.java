import java.util.*;
public class sphere{
    public static void main(String[] args){
        int a;
        double s;
        Scanner read = new Scanner(System.in);
        a = read.nextInt();
        s = (4.0/3.0)*3.14*a*a*a;
        System.out.printf("%.2f",s);
    }
}