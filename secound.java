import java.util.Scanner;
public class secound{
    public static void main(String args[])
    {
        int num;
        System.out.println("enter the number ");
        Scanner sc=new Scanner(System.in);
        num=sc.nextInt();
        if(num==0)
        {
            System.out.println("number is zero");
        }
        else if(num>=0)
        {
            System.out.println("number is grater then zero");
        }
        else{
            System.out.println("number is less then zero");
        }

    }
}