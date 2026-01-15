// create a program to input name of the person and respond with "welcome _____ to KG Coding"

package variables_datatypes_inputs;

import java.util.Scanner;

public class Welcome {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter your name: ");
        String showWelcomeMessage = input.nextLine();

        input.close();

        System.out.printf("Welcome %s to KG Coding!",showWelcomeMessage);
    }
}
