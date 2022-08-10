import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Options {
    private int choice;
    private List<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void option() {
        do {
            System.out.println(" 1.Add File \n 2.Delete File \n 3.update \n 4.Display the list \n 5.Search \n 6.Exit  ");
            System.out.println("Enter your Choice :\n ");
            choice = scanner.nextInt();
            switch (choice) {
                case 1:
                    System.out.println("Getting ready to Add File to the File List ");
                     add();
                    break;

                case 2:
                    System.out.println("Getting ready to Delete File from File List ");

                    remove();
                    break;

                case 3:
                    System.out.println("Getting ready to Update a Record ");
                    update();
                    break;

                case 4:
                    System.out.println("Here is your record ");
                    displayList();
                    break;

                case 5:
                    System.out.println("Please enter file name to search from the list.");
                    search();
                    break;
                case 6:
                    System.out.println("Out we go.");
                    System.exit(0);
                    //exit();
                    break;
                default:
                    System.out.println("Try again");
                    break;
            }

        } while (choice > 0 && choice < 6);
    }

    public void add() {
        System.out.println("Please add you file name \n");
        String fileName = scanner.next();
        list.add(fileName);
        System.out.println(list);
        System.out.println(list.size());
        System.out.println("========================");
    }


    public void remove() {
        displayList();
        System.out.println("Please type index number of file name to be removed from the list \n");
        int fileNameIndex = scanner.nextInt();
        if (fileNameIndex > list.size() + 1 || fileNameIndex < 1) {
            System.out.println("Please enter in range number");
            displayList();
        } else {
            String fileNameRemoved = list.get(fileNameIndex - 1);
            list.remove(fileNameIndex - 1);
            System.out.println("File name " + fileNameRemoved + " is removed from the list ");
        }
        System.out.println("========================");
    }

    public void displayList() {
        System.out.println("You have " + list.size() + " Items in your list");
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.println("========================");
    }

    public void search() {
        System.out.println("You have " + list.size() + " Items in your list");
        String fileName = scanner.next();
        boolean fileNameFound = false;
        for (int i = 0; i < list.size(); i++) {
            if (fileName == list.get(i)) {
                fileNameFound = true;
            }
        }
        if (fileNameFound) {
            System.out.println("Item " + fileName + " has found in ");
        } else {
            System.out.println("Item " + fileName + " is not in the list ");
        }
        System.out.println("========================");
    }

    public void update() {
        displayList();
        System.out.println("Please Enter Index number of the file which needs to be replace");
        int indexNum = scanner.nextInt() - 1;
        System.out.println("Please Enter file name to update previous file name");
        String filenNameUpdate = scanner.next();
        list.set(indexNum, filenNameUpdate);
        System.out.println("========================");
    }

//    private ArrayList<String> updateList(){
//    displayList();
//        System.out.println();
//
//    }
  /*  List<String> list = new ArrayList<>();
        System.out.println("\n==========================Please enter your file name \n");
    String list1 = scanner.next();
    ///need to loop
            list.add(list1);
            System.out.println(list);

        System.out.println("Do you want to add more file to the list?\n Please Type 'y' for Yes or 'n' for not willing to add more ");
        String answer = scanner.nextLine();*/
    //while (loop); //needs here

    // needs to ask if user wants to add more file

    //System.out.println("Please enter your file name \n");

    /*public void remove() {
        System.out.println("Please type index number of file name to be removed from the list \n");
        int fileNameIndex = scanner.nextLine();
        boolean approver = false;
        for (int i = 0; i < list.size(); i++) {
            if (list.get(i) == fileName) {
                approver = true;
                list.remove(fileName);
            }
        }
        if (approver) {
            System.out.println("Item is removed from the list");
        } else {
            System.out.println("file name you have type is not part of the list");
        }
    }*/

}
