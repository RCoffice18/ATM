import java.util.Scanner;
public class ATM {
    public static void main(String[] args)
    {
        System.out.println("Enter the Account Number: ");
        System.out.println("choose between 1804, 2711, 1905");
        Scanner s=new Scanner(System.in);
        int an=s.nextInt();
        if(an==1804) {
            String Ram = "Ram charan M";
            System.out.println("Account Name is "+Ram);
            Ram o=new Ram();
            o.ac();
        }
        else if(an==2711){
            String Kasak= "Ajith Sugumar K";
            System.out.println("Account Name is "+Kasak);
            Kasak o1=new Kasak();
            o1.ac();
        }
        else if(an==1905){
            String Siva="Sivanesh J";
            System.out.println("Account Name is "+Siva);
            Siva o2=new Siva();
            o2.ac();
        }
        else{
            System.out.println("Invalid Account Number");
        }
    }
}
class Ram {
    public static void ac() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the PIN");
        int a = s.nextInt();
        int PIN = 1234;
        int sa = 36000;
        int be = 500000;
        int cw;
        {
            if (a == PIN) {
                System.out.println("Enter the selection 1.Savings Account  2.Balance Enquiry  3.Cash Withdrawal");
                int b = s.nextInt();
                if (b < 4) {
                    switch (b) {
                        case 1:
                            System.out.println("Savings account = " + sa);
                            break;
                        case 2:
                            System.out.println("Balance Enquiry = " + be);
                            break;
                        case 3:
                            System.out.println("Cash Withdrawal");
                            System.out.println("Please enter the Amount in Hundreds");
                            System.out.println("ex: 5*100=500");
                            int cash = s.nextInt() * 100;
                        {
                            if (cash < 40000) {
                                cw = be - cash;
                                System.out.println("Collect the cash amount entered = "+cash);
                                System.out.println("Balance Amount in Account = " + cw);
                            } else {
                                System.out.println("Exceeded the Withdrawal status");
                            }
                        }
                        default:
                            System.out.println("Thank You, Welcome Again");
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
class Kasak {
    public static void ac() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the PIN");
        int a = s.nextInt();
        int PIN = 1234;
        int sa = 36000;
        int be = 500000;
        int cw;
        {
            if (a == PIN) {
                System.out.println("Enter the selection 1.Savings Account  2.Balance Enquiry  3.Cash Withdrawal");
                int b = s.nextInt();
                if (b < 4) {
                    switch (b) {
                        case 1:
                            System.out.println("Savings account = " + sa);
                            break;
                        case 2:
                            System.out.println("Balance Enquiry = " + be);
                            break;
                        case 3:
                            System.out.println("Cash Withdrawal");
                            System.out.println("Please enter the Amount in Hundreds");
                            System.out.println("ex: 5*100=500");
                            int cash = s.nextInt() * 100;
                        {
                            if (cash < 40000) {
                                cw = be - cash;
                                System.out.println("Collect the cash amount entered = "+cash);
                                System.out.println("Balance Amount in Account = " + cw);
                            } else {
                                System.out.println("Exceeded the Withdrawal status");
                            }
                        }
                        default:
                            System.out.println("Thank You, Welcome Again");
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
class Siva {
    public static void ac() {
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the PIN");
        int a = s.nextInt();
        int PIN = 1234;
        int sa = 36000;
        int be = 500000;
        int cw;
        {
            if (a == PIN) {
                System.out.println("Enter the selection 1.Savings Account  2.Balance Enquiry  3.Cash Withdrawal");
                int b = s.nextInt();
                if (b < 4) {
                    switch (b) {
                        case 1:
                            System.out.println("Savings account = " + sa);
                            break;
                        case 2:
                            System.out.println("Balance Enquiry = " + be);
                            break;
                        case 3:
                            System.out.println("Cash Withdrawal");
                            System.out.println("Please enter the Amount in Hundreds");
                            System.out.println("ex: 5*100=500");
                            int cash = s.nextInt() * 100;
                        {
                            if (cash < 40000) {
                                cw = be - cash;
                                System.out.println("Collect the cash amount entered = "+cash);
                                System.out.println("Balance Amount in Account = " + cw);
                            } else {
                                System.out.println("Exceeded the Withdrawal status");
                            }
                        }
                        default:
                            System.out.println("Thank You, Welcome Again");
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
