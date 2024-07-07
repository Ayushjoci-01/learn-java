import java. util.Scanner;
public class ten{
    public static void main(String args[])
    {
        int n;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the number range");
        n=sc.nextInt();
        for(int i=1;i<=11;i++)
        {
            System.out.println(+n*i);
        }


    }
}