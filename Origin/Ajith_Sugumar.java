package Origin;
import java.util.Scanner;
public class Ajith_Sugumar {
    public static void ac() {
        String Kasak= "Ajith Sugumar K";
        System.out.println("Account Name is "+Kasak);
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the PIN");
        int a = s.nextInt();
        int PIN = 1234;
        int sa = 36000;
        int be = 500000;
        int cw;
        {
            if (a == PIN) {
                System.out.println("Enter the Options\n1.Savings Account \n2.Balance Enquiry \n3.Cash Withdrawal\n");
                int b = s.nextInt();
                if (b <= 3) {
                    switch (b) {
                        case 1:
                            System.out.println("Savings account = " + sa);
                            break;
                        case 2:
                            System.out.println("Balance Enquiry = " + be);
                            break;
                        case 3:
                            System.out.println("Cash Withdrawal\t\t( Per day limit is 40000 )");
                            System.out.println("Please enter the Amount in Hundreds\nex: 5*100=500");
                            int cash = s.nextInt() * 100;
                        {
                            if (cash < 40000) {
                                cw = be - cash;
                                System.out.println("Collect the cash amount = "+cash);
                                System.out.println("Balance Amount in Account = " + cw);
                            } else {
                                System.out.println("Exceeded the Withdrawal status");
                            }
                        }
                        default:
                            System.out.println("Thank You, Welcome Again");
                            System.exit(0);
                    }
                } else {
                    System.out.println("Enter the Valid Options");
                    System.out.println("Thank You, Welcome Again");
                }
            } else {
                System.out.println("Entered an Invalid PIN");
            }
        }
    }
}
