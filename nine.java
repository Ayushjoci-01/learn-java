import java .util.Scanner;
public class nine{
    public static void main(String args[])
    {
        
        int n;
        Scanner sr=new Scanner(System.in);
        System.out.println("enter the number ");
        n=sr.nextInt();
        int sum=0;
        for(int i=1;i<=n;i++)
        {
            sum=sum+i;

        }
        System.out.println(sum);


    }
}