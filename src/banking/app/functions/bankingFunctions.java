package banking.app.functions;

import java.util.Scanner;

import banking.app.details.BankingInfo;

public class bankingFunctions {
	Scanner sc = new Scanner(System.in);
	public BankingInfo openAccount() {  
		
		 BankingInfo bi = new BankingInfo();
        System.out.print("Enter Account No: ");  
        bi.setAccno(sc.next());
        System.out.print("Enter Account type: ");  
        bi.setAcc_type(sc.next());  
        System.out.print("Enter Name: ");  
        bi.setName(sc.next());  
        System.out.print("Enter Balance: ");  
        bi.setBalance(sc.nextLong());  
        return bi;
    }  
	public void showAccount(BankingInfo bank) {  
        System.out.println("Name of account holder: " + bank.getName());  
        System.out.println("Account no.: " + bank.getAccno());  
        System.out.println("Account type: " + bank.getAcc_type());  
        System.out.println("Balance: " + bank.getBalance());  
    }    
	public void deposit(BankingInfo bank) {  
        long amt;  
        System.out.println("Enter the amount you want to deposit: ");  
        amt = sc.nextLong();  
        bank.setBalance(bank.getBalance() + amt); 
        System.out.println("Balance after deposit: " + bank.getBalance()); 
        
	}   
    public void withdrawl(BankingInfo bank) {  
        long amt; 
        System.out.println("Enter the amount you want to withdraw: ");  
        amt = sc.nextLong();  
        if (bank.getBalance() >= amt) {  
            bank.setBalance(bank.getBalance()-amt); 
            System.out.println("Balance after withdrawal: " + bank.getBalance());  
      } 
      else {  
            System.out.println("Your balance is less than " + amt + "\tTransaction failed...!!" );  
        }  
    }  
    public boolean search( BankingInfo bank,String ac_no) {  
        if (bank.getAccno().equals(ac_no)) {  
            showAccount(bank);  
            return (true);  
        }  
        return (false);  
    }  	
	
	
}
