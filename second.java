/*sing the switch statement, write a menu-driven program to calculate the
maturity amount of a bank deposit.
The user is given the following options:
(i) Term Deposit
(ii) Recurring Deposit
For option (i) accept Principal (p), rate of interest (r) and time period in years
(n). Calculate and output the maturity amount (a) receivable using the formula
a = p[1 + r / 100]n.
For option (ii) accept monthly installment (p), rate of interest (r) and time period
in months (n). Calculate and output the maturity amount (a) receivable using
the formula a = p * n + p * n(n + 1) / 2 * r / 100 * 1 / 12. For an incorrect option,
an appropriate error message should be displayed.
[ Use Scanner Class to take input ]
2
24
*/
import java.util.*;
public class second{
    public static void main(String args[]){
        Scanner sc=new Scanner(System.in);
        int choice;
        System.out.println("enter the choice press 1 for tern choice enter 2 for recuuring deposite");
        choice=sc.nextInt();
        switch (choice) {
            case 1:
            System.out.println("enter the principal");
            int p=sc.nextInt();
            System.out.println("enter the time");
            int t=sc.nextInt();
            System.out.println("enter the rate");
            int r=sc.nextInt();
            int total=(int) (p*Math.pow(1+(r/100),t));
            System.out.println("recurring deposite is"+total);
                break;
        case 2:
        System.out.println("enter the principal");
        int p2=sc.nextInt();
        System.out.println("enter the time");
        int t2=sc.nextInt();
        System.out.println("enter the rate");
        int r2=sc.nextInt();
        int total2=p2 * t2 + p2 * t2*(t2 + 1) / 2 * r2 / 100 * 1 / 12;
        System.out.println("total recurring deposite is "+total2);
        break;

            default:
            System.out.println("invalid choice");
                break;
        }


    }
}