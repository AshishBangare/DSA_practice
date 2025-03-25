package stack.usingArray;

import stack.usingArray.StackCreation;

import java.util.Scanner;

public class StackOperations {
    StackCreation stack = new StackCreation(4);

//    push operation
    public void push(int value){
        if(stack.top==stack.maxSize-1){
            System.out.println("stack overflow");
        } else {
            stack.stackArray[++stack.top] = value;
        }
    }


//    pop operation
    public int pop(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return -1;
        } else {
            return  stack.stackArray[stack.top--];
        }
    }


//    peek operation
    public void peek(){
        if (isEmpty()){
            System.out.println("stack is empty");
            return;
        } else {
            System.out.println(stack.stackArray[stack.top]);
        }
    }


//    check the stack is empty or not
    public boolean isEmpty(){
        return stack.top == -1;
    }

    public void execution(){
        Scanner scan = new Scanner(System.in);
        int choice;
        do {
            System.out.println("enter 1 : for the push operation");
            System.out.println("enter 2 : for the pop operation");
            System.out.println("enter 3 : for the peek operation");
            System.out.println("enter 4 : for the isEmpty operation");
            System.out.println("enter 5 : to exit");
            choice = scan.nextInt();

            switch (choice){
                case 1 :
                    System.out.println("enter the element to push");
                    int value = scan.nextInt();
                    push(value);
                break;

                case 2 :
                    System.out.println("popped elemnt is : "+pop());
                    break;

                case 3 :
                    peek();
                    break;

                case 4 :
                    System.out.println(isEmpty());
                    break;

                case 5:
                    System.out.println("exiting...");
                    break;

                default:
                    System.out.println("choice is invalid");

            }
        } while (choice!=5);
    }
}
