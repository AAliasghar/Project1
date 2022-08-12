import java.io.IOException;
import java.util.*;

public class Options extends FileHandling {
    private int choice;
    //private FileHandling fileHandling;
    private List<String> list = new ArrayList<>();
    Scanner scanner = new Scanner(System.in);

    public void option() throws IOException {
        do {
            try {
                System.out.println(" 1.Add File \n 2.Delete File \n 3.update \n 4.Display the list \n 5.Search \n 6.Exit  ");
               try{ System.out.println("Enter your Choice : ");
                choice = scanner.nextInt(); }
               catch (InputMismatchException ex){
                   System.out.println("Please enter an Integer");
               }

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
                        System.out.println("Thanks for using the application, see you soon.");
                        System.exit(0);
                        //exit();
                        break;
                    default:
                        System.out.println("Try again");
                        break;
                }

            } catch (InputMismatchException ex) {
                System.out.println("Please enter correct value type");
            }
        }
        while (choice > 0 && choice < 6);
    }

    public void add() throws IOException {
        String fileName = "";
        String data = "";

        try {
            System.out.println("Please add you file name \n");
            fileName = scanner.next();

        } catch (InputMismatchException ex) {
            System.out.println("Please enter");

        }

        try {
            System.out.println("Please add content of file \n");
            data = scanner.next();

        } catch (InputMismatchException ex) {
            System.out.println("Please enter");

        }
        list.add(fileName);
        
        createAndWriting(fileName, data);
        System.out.println(list.size());
        Collections.sort(list);
        System.out.println(list);
        System.out.println("========================");
    }


    public void displayList() {
        System.out.println("You have " + list.size() + " Items in your list");
        Collections.sort(list);
        for (int i = 0; i < list.size(); i++) {
            System.out.println((i + 1) + ". " + list.get(i));
        }
        System.out.println("========================");
    }

    public void search() {
        if (list.size() == 0) {
            System.out.println("List is empty no file to be searched \n");
            try {
                option();
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
        int index = 0;
        String fileName = null;
        try {
            System.out.println("You have " + list.size() + " Items in your list");
            fileName = scanner.next();
        } catch (InputMismatchException ex) {
            System.out.println("Please enter correct value type");
        }
        index = list.indexOf(fileName) + 1;
        boolean fileNameFound = false;
        for (int i = 0; i < list.size(); i++) {
            if (fileName.contains(list.get(i))) {
                fileNameFound = true;
            }
        }
        if (fileNameFound) {
            System.out.println("Item " + fileName + " has found in the list and is on index " + index + " .");
            displayList();
        } else {
            System.out.println("Item " + fileName + " is not in the list ");
        }
        System.out.println("========================");
    }

    public void remove() throws IOException {
        if (list.size() == 0) {
            System.out.println("List is empty no file to be deleted\n");
            option();
        }
        String fileName = null;
        int fileNameIndex = 0;
        try {
            System.out.println("You have " + list.size() + " Items in your list");
            System.out.println("Please type file Name of file name to be removed from the list \n");
            displayList();
            fileName = scanner.next();
            fileNameIndex = list.indexOf(fileName);
            System.out.println(fileNameIndex);
        } catch (InputMismatchException ex) {
            System.out.println("Please enter correct value type");

        }
        if (fileNameIndex > list.size() || fileNameIndex < 0) {
            System.out.println("Please enter in range number");
            displayList();
        } else {
            String fileNameRemoved = list.get(fileNameIndex);
            list.remove(fileNameIndex);
            deleteFile(fileName);
            Collections.sort(list);
            System.out.println("File name " + fileNameRemoved + " is removed from the list and list have " + list.size() + " items");
            displayList();
        }

        System.out.println("========================");
    }

    public void update() {
        displayList();
        int indexNum = 0;
        String filenNameUpdate = "";
        try {
            System.out.println("Please Enter Index number of the file which needs to be replace");
            indexNum = scanner.nextInt() - 1;
            System.out.println("Please Enter file name to update previous file name");
            filenNameUpdate = scanner.next();
        } catch (InputMismatchException ex) {
            System.out.println("Please enter correct value type");
        }
        list.set(indexNum, filenNameUpdate);
        Collections.sort(list);
        displayList();
        System.out.println("========================");
    }


}
