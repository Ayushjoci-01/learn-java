import java .util.Scanner;
public class thied
{
    public static void main(String args[])
    {
        int a;
        int b;
        Scanner sc=new Scanner(System.in);
        System.out.println("enter the value of a ");
        a=sc.nextInt();
        System.out.println("enter the value of b");
        b=sc.nextInt();
        if(a==b)
        {
            System.out.println("a and b are equal");
        }
        else if (a>b)
        {
            System.out.println("a is grater then b");
        }
        else if(a<b){
            System.out.println("a is less then b");
        }
        

        
    }
}