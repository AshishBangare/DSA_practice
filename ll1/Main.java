package linkedLists.ll1;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        LinkedListImpl llI = new LinkedListImpl();

        Scanner scan = new Scanner(System.in);

        int choice;
        do {

            System.out.println("select : 1 for adding data at beginning ");
            System.out.println("select : 2 for displaying the list");
            System.out.println("select : 3 for adding data at last ");
            System.out.println("select : 4 for removing data from first");
            System.out.println("select : 5 for removing data from last of list");
            System.out.println("select : 6 for removing data from specific position");
            System.out.println("select : 10 for exiting...");

            choice = scan.nextInt();

            switch (choice) {
                case 1:
                    llI.addNodeAtBeginning();
                    break;

                case 2:
                    llI.displayList();
                    break;
                case 3:
                    llI.addNodeAtLast();
                    break;

                case 4:
                    llI.removeFirstNode();
                    break;

                case 5:
                    llI.deleteLastNode();
                    break;

                case 6:
                    llI.deleteFromSpecific();
                    break;

                case 10:
                    System.out.println("yor successfully exited...");
                    break;

                default:
                    System.out.println("invalid choice");
            }
        } while (choice != 10);

    }
}
