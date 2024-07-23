
    import java.util.*;
// ATM class 
class ATM_machine{
    
    Scanner sc= new Scanner(System.in);
    //creating an object of class userbankaccount
    UserBankAccount person1= new UserBankAccount(786786);
    //method to display user interface
    public void userinterface(){
        System.out.println();
        System.out.println("=================================");
        System.out.println("          ATM MACHINE            ");
        System.out.println("=================================");
        System.out.println(" 1. Withdraw Cash");
        System.out.println(" 2. Deposit Cash");
        System.out.println(" 3. Check Balance");
        System.out.println(" 4. Change pin");
        System.out.println(" 5. Exit");
        System.out.print("Enter choice :");
        
    }
    //Method to deposit money
    public void deposit(int money){
        //invokes method(depositmoney) of class userbankaccount
      person1.depositmoney(money);
        System.out.println("Amount successfully deposited in your account\n");
    }
    //Method to withdraw money
    public void withdraw(int withdraw_amt){
        person1.withdrawmoney(withdraw_amt);
        System.out.println("Amount successfully deducted from your account\n");
    }
    //Method to check balance
    public void check_balance(){
        person1.checkbalance();
    }
    
    public boolean checkpin(int pin){
        
        return (person1.checkpin(pin));
            
    }
    public void changepin(){
        System.out.println("Enter old pin number:");
        int oldpin= sc.nextInt();
        if(checkpin(oldpin)==true){
            System.out.print("Enter new pin :");
            int newpin= sc.nextInt();
            person1.setpin(newpin);
            System.out.println("pin changed successfully");
            }
        else{
            System.out.println("Incorrect pin");
        }
            
    }
}
    // user bank account class
class UserBankAccount{
    public int amount;
    private int pin;
UserBankAccount(int pin){
        amount=0;
    this.pin= pin;
}
    public void depositmoney(int money){
          amount = amount+money;
    }
    public void withdrawmoney(int withdraw_amt){
        if(amount<withdraw_amt)
            System.out.println("Insufficient Balance\n");
            else
                amount-=withdraw_amt;
    }
    public void checkbalance(){
         System.out.println("Your current balance is "+amount+"\n");
    }
    public boolean checkpin(int pin){
        return(this.pin==pin);
    }
    public void setpin(int pin){
        this.pin= pin;
    }
}
public class ATM_Interface {
    
    public static void main(String[] args) {
        int exit=0;
        Scanner sc= new Scanner(System.in);
       // UserBankAccount person1= new UserBankAccount();
        ATM_machine atm= new ATM_machine();
        while(exit!=1){
        atm.userinterface();
        int userchoice= sc.nextInt();
        switch(userchoice){
            
            case 1: {
                
                System.out.print("Enter a 6 digit pin :");
                int pin_no= sc.nextInt();
                if(atm.checkpin(pin_no)==true){
                System.out.print("Enter the amount you want to withdraw :");
            int withdrawamt= sc.nextInt();
            atm.withdraw(withdrawamt);}
                else{
                    System.out.println("Incorrect pin ");
                }
                break;
            }
            case 2: {
                System.out.print("Enter the amount you want to deposit :");
            int depositamt= sc.nextInt();
            atm.deposit(depositamt);
                }
            
                break;
            
            case 3:{
            System.out.print("Enter a 6 digit pin :");
                int pin_no= sc.nextInt();
                if(atm.checkpin(pin_no)==true){
            atm.check_balance();
                }
            else{
                System.out.println("Incorrct pin ");
            }
            break;}
            case 4:{
                atm.changepin();
                break;
            }
            case 5: exit=1;
            break;
            default:
            System.out.println("Invalid choice ");
            
        }
        }
        
    }
    }
    
    

