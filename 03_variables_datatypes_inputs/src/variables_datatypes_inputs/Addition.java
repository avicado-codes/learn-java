// create a program to add 2 numbers

package variables_datatypes_inputs;

import java.util.Scanner;

public class Addition {
    public static void main(String[] args){
        Scanner input = new Scanner(System.in);

        System.out.print("Enter two numbers separated by space: ");

        float num1 = input.nextFloat();
        float num2 = input.nextFloat();

        System.out.println(num1+num2);
    }
}
