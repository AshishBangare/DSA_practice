package stack.usingArray;

public class StackCreation {

     int maxSize;
     int[] stackArray;
     int top;

    public StackCreation(){

    }
    public StackCreation(int size){
        maxSize = size;
        stackArray = new int[maxSize];
        top = -1;       // no element initially
    }
}
