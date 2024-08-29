package OOPS;
import java.util.*;
class Accounts{
    private double balance;
    public void  getBalance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password");
        String pass=sc.nextLine();
        if(isValid(pass))System.out.println("your balance is:"+balance);
        else{
            System.out.println("invalid password");
        }
    }
    public void setBalance(){
        Scanner sc=new Scanner(System.in);
        System.out.println("enter password");
        String pass=sc.nextLine();
        if(isValid(pass)){
            System.out.println("enter \n 1.withdraw amount\n 2.deposit amount");
            int choice=sc.nextInt();
            if(choice==1){
                System.out.println("enter total sum that u want to withdraw");
                int withdraw=sc.nextInt();
                if(withdraw<=balance){
                    System.out.println("here take ur money");
                    balance-=withdraw;
                    System.out.println("remaining balance:"+balance);
                }
                else System.out.println("you don't have sufficient amount to withdraw");
            }
            else if(choice ==2){
                System.out.println("enter amount that u want to deposit");
                int deposit=sc.nextInt();
                balance+=deposit;
                System.out.println("Rs."+deposit+" deposited successfully");
                System.out.println("your balance is: "+balance);
            }
            else System.out.println("enter a valid choice either 1 or 2");
        }
        else{
            System.out.println("invalid password");

        }
    }
    private boolean isValid(String password){
        return password.equals("chinmayi") ;
    }
}
public class Account {
    public static void main(String[] args) {
        Accounts ac=new Accounts();
        Scanner sc=new Scanner(System.in);
        System.out.println("enter\n 1.get balance\n 2.perform transaction");
        int choice=sc.nextInt();
        if(choice==1){
            ac.getBalance();
        }
        else ac.setBalance();
    }
}
