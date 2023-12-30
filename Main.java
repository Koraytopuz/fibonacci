import java.util.Scanner;
public class Main {
    public static void main(String[] args) {
        Scanner klavye = new Scanner(System.in);
        System.out.println("Enter a number :");
        int n = klavye.nextInt();
        int s1=0,s2=1,sum=0;
        System.out.println(s1+" "+s2);
        for(int i=1;i<=n;i++)
        {
            sum=s1+s2;
            System.out.println(" "+sum);
            s1=s2;
            s2=sum;
        }
    }
}   