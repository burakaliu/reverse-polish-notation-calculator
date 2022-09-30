/*
Read a file called "polish.txt" which will be a Reverse Polish Notation calculation with tokens seperated by spaces. While reading the file, apply the Reverse Polish Notation algorithm to it to calculate the answer. This program does NOT have to account for errors or incorrect input. This program can do all calculations with integers. This program only needs to do the 4 usual functions of a calculator (+ - * /).

Example Input:
12 200 + 18 7 * -
Output:
86

RPN Algoirthm:
If we see a number, push it onto the stack
If we see an operation, pop 2 numbers and perform it on those numbers (where the 2nd popped number is the first operand) and push the answer on the stack
Stack contains the answer at the end
 */
import java.io.*;
import java.util.Scanner;
        '
public class Main {
    public static void main(String args[]) throws Exception{
        Stack stack = new Stack();

        Scanner file = new Scanner(new File("src/file.txt"));


        
    }
}
