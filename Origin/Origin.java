package Origin;
import java.util.Scanner;
public class Origin {
    public static void main(String[] args){
        System.out.println("Enter the Account Number: ");
        Scanner s=new Scanner(System.in);
        int an=s.nextInt();
        if(an==1804) {
            Ramcharan.ac();
        }
        else if(an==2711){
            Ajith_Sugumar.ac();
        }
        else if(an==1905){
            Sivanesh.ac();
        }
        else{
            System.out.println("Invalid Account Number");
        }
    }
}
