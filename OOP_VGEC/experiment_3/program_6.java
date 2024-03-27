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

public class program_6 {
    public static void main(String[] args) {
        Scanner myObj = new Scanner(System.in);

        Account a[] = new Account[5];
        a[0] = new Account(101, 10000, "Het");
        a[1] = new Account(102, 5000, "Karan");
        a[2] = new Account(103, 6000, "Harendra");
        a[3] = new Account(104, 18000, "Nachiket");
        a[4] = new Account(105, 40000, "Rajkumar");

        System.out.print("Enter account number : ");
        int acc_no = myObj.nextInt();
        boolean user = false;

        for (int i = 0; i < 5; i++) {
            if (a[i].getID() == acc_no) {
                a[i].putData();
                user = true;
            }
        }

        if (!user) {
            System.out.println("User not found");
        }
        myObj.close();
    }
}