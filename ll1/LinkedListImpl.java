package linkedLists.ll1;

import java.util.Scanner;

public class LinkedListImpl implements LinkedListInterface{
    Scanner scan = new Scanner(System.in);

    Node head = null;

//    adding data to linked list at beggining
    public void addNodeAtBeginning(){

       System.out.println("inter the data to add in list");
       int data = scan.nextInt();

       Node newNode = new Node(data);

       if(head==null){
           head = newNode;
       } else {
           newNode.next=head;
           head = newNode;
       }
    }

//    add data to the linked list at last
    public void addNodeAtLast(){
        System.out.println("enter the data which you want add at last");
        int data = scan.nextInt();

        Node newNode = new Node(data);
        Node temp = head;

        if (head==null){
            head=newNode;
            return;
        }

        while (temp.next!=null){
            temp = temp.next;
        }

        temp.next = newNode;


    }

//    remove data from beginning
    public void removeFirstNode(){
        if(head == null){
            System.out.println("no data to remove from linked list");
            return;
        } else {
            head = head.next;
        }
    }

//    remove data from end
    public void deleteLastNode(){
        if(head==null){
            System.out.println("list is empty ");
            return;
        }

        Node temp = head;

        while (temp.next.next!=null){
            temp = temp.next;
        }

        temp.next = null;
    }

//    delete the node from a specific position

    public void deleteFromSpecific(){
        System.out.println("enter the position of data which you want to be remove");
        int position = scan.nextInt();

        Node temp = head;

        if (head==null){
            System.out.println("list is empty");
            return;
        }

        if (position==1){
            head = head.next;
            return;
        }

        for(int count = 2; count<position && temp.next!=null; count++){
            temp = temp.next;
        }
//
        if (temp.next==null){
            System.out.println("position is out of bound ");
            return;
        }

        temp.next = temp.next.next;

    }

//    display the linked list
    public void displayList(){
        if(head == null){
            System.out.println("list is empty,please enter the data to see ");
            return;
        }

        Node temp = head;
        while(temp!=null){
            if(temp.next==null){
                System.out.println(temp.data);
                return;
            }
            System.out.print(temp.data+" -> ");
            temp=temp.next;
        }
        System.out.println();
    }




}
