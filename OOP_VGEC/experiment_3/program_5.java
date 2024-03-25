import java.util.Scanner;

class Time {
    private int hours;
    private int minutes;

    void setTime(int hours, int minutes) {
        this.hours = hours;
        this.minutes = minutes;
    }

    void displayTime() {
        System.out.println("Time : " + hours + " hours  " + minutes + " minutes");
    }

    void sum(Time t1, Time t2) {
        this.hours = t1.hours + t2.hours;
        this.minutes = t1.minutes + t2.minutes;

        if (this.minutes >= 60) {
            this.hours += this.minutes / 60;
            this.minutes = this.minutes % 60;
        }
    }
}

public class program_5 {
    public static void main(String[] args) {
        Time t1 = new Time();
        Time t2 = new Time();
        Time t3 = new Time();
        Scanner myObj = new Scanner(System.in);
        System.out.println("Enter first Hours & Minutes to sum : ");
        int h1 = myObj.nextInt();
        int m1 = myObj.nextInt();
        System.out.println("Enter second Hours & Minutes to sum : ");
        int h2 = myObj.nextInt();
        int m2 = myObj.nextInt();
        t1.setTime(h1, m1);
        t2.setTime(h2, m2);
        System.out.println("Initial time is : ");
        t1.displayTime();
        t2.displayTime();

        t3.sum(t1, t2);
        System.out.println("\nSum of time : ");
        t3.displayTime();
    }
}