import java .util.Scanner;
public class fourth{
    public static void main(String args[])
    {
        System.out.println("enter the nunber ");
        Scanner sc=new Scanner(System.in);
        int button=sc.nextInt();
        switch(button)
        {
            case 1:
            System.out.println("hello");
            break;
            case 2:
            System .out.println("nameste");
            break;
            case 3:
            System.out.println("bonjor");
            break;
            default:
            System.out.println("invalid button");

        }

    }
}