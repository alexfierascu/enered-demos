package dependency.injection.hard;

import lombok.Data;

import java.util.Scanner;

@Data
public class ServiceB {

    public String showInfo() {
        return "ServiceB info";
    }

    public void faSumaA2NR() {
        Scanner keyboard = new Scanner(System.in);
        System.out.println("Enter 1st integer");
        int a = keyboard.nextInt();
        System.out.println("Enter 2nd integer");
        int b = keyboard.nextInt();
        System.out.println("The sum of the 2 numbers is " + (a + b));
    }
}
