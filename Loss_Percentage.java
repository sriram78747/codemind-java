import java.util.*;
public class ls{
    public static void main(String[] args)
    {
        Scanner read = new Scanner(System.in);
        int x,y;
        double z;
        x = read.nextInt();
        y = read.nextInt();
        z = (x-y)*100.0/(x);
        System.out.printf("%.2f",z);
    }
}