/*
Read a file called "polish.txt" which will be a Reverse Polish Notation calculation with tokens seperated by spaces.
 While reading the file, apply the Reverse Polish Notation algorithm to it to calculate the answer.
 This program does NOT have to account for errors or incorrect input. This program can do all calculations with integers.
 This program only needs to do the 4 usual functions of a calculator (+ - * /).

Example Input:
12 200 + 18 7 * -
Output:
86

RPN Algoirthm:
If we see a number, push it onto the stack
If we see an operation, pop 2 numbers and perform it on those numbers (where the 2nd popped number is the first operand) and push the answer on the stack
Stack contains the answer at the end
 */
import javax.swing.plaf.synth.SynthTextAreaUI;
import java.io.*;
import java.util.Scanner;

public class Main {
    public static void main(String args[]) throws Exception{
        Stack stack = new Stack();

        Scanner file = new Scanner(new File("polish.txt"));


        //hello is the commit thingy working test
        while (file.hasNext()){
            if (file.hasNextInt()){
                stack.push(String.valueOf(file.nextInt()));
            }else{
                String operation = file.next();
                int num2 = Integer.parseInt(stack.pop());
                int num1 = Integer.parseInt(stack.pop());
                int out = 0;

                //I first did this with if statements and it did not work i have no idea why i spent too much time trying
                //to figure it out but it works now so yay
                switch (operation){
                    case "*":
                        out = num1 * num2;
                        System.out.println("multilied");
                        break;
                    case "/":
                        out = num1 / num2;
                        System.out.println("divided");
                        break;
                    case "+":
                        out = num1 + num2;
                        System.out.println("added");
                        break;
                    case "-":
                        out = num1 - num2;
                        System.out.println("subtracted");
                        break;
                }

                stack.push(String.valueOf(out));
                //i accidentaly deleted this line while removing the print statements
                //i almost shat myself out of frustration when it gave me an error
                //then i realized how stupid i am and added it back

            }
        }

        System.out.println("The solution is: " + stack.peek());

    }
    public static void printstack(Stack stack){
        //i used this for debugging ignore this if i forget to remove it
        while (stack.peek() != null){
            System.out.println(stack.pop());
        }
    }
}
