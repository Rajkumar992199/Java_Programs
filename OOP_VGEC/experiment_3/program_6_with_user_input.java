import java.util.Scanner;

class Account {
    private int accNo;
    private int balance;
    private String name;

    Account(int accNo, int balance, String name) {
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
    }

    void setData(int accNo, int balance, String name) {
        this.accNo = accNo;
        this.balance = balance;
        this.name = name;
    }

    void putData() {
        System.out.println("Account Number : " + this.accNo + "\nBalance : " + this.balance
                + "\nName of holder : " + this.name);
    }

    int getID() {
        return this.accNo;
    }
}

public class program_6_with_user_input {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);
        System.out.println("Wanted to Enter new account press 1\t Wanted to find account press 2 : ");
        int choice = myObj.nextInt(); 
        Account a[] = new Account[10];
        a[0] = new Account(101, 10000, "Het");
        a[1] = new Account(102, 5000, "Karan");
        a[2] = new Account(103, 6000, "Harendra");
        a[3] = new Account(104, 18000, "Nachiket");
        a[4] = new Account(105, 40000, "Rajkumar");
        if(choice == 1){
            System.out.print("Enter number of account you want to Enter(0-5) : ");
            int no = myObj.nextInt();
            for (int i =0;i<no;i++){
                System.out.println("Enter new account detail: ");
                System.out.println("Enter Account number : ");
                int acc = myObj.nextInt();
                System.out.println("Enter balance : ");
                int b = myObj.nextInt();
                System.out.println("Enter name : ");
                myObj.nextLine();
                String n = myObj.nextLine();
                a[5+i] = new Account(acc , b, n);
                a[5+i].putData();
            }
            System.out.println("for exit press 1\t Wanted to find account press 2 : ");
            choice = myObj.nextInt();
        }
        if(choice == 1){
            System.out.print("Thanks for visiting :) ");
        }
        if (choice == 2){
            System.out.print("Enter account number : ");
            int acc_no = myObj.nextInt();
            boolean user = false;
    
            for (int i = 0; i < 6; i++) {
                if (a[i].getID() == acc_no) {
                    a[i].putData();
                    user = true;
                }
            }
    
            if (!user) {
                System.out.println("User not found");
            }
            System.out.print("Thanks for visiting :) ");
        }
        else if(choice != 1 && choice !=2){
            System.out.println("Enter valid number ");
        }
       
        myObj.close();
    }
}