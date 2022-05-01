import java.util.Scanner;

public class Assignment3{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("please enter the names of your favourite artist: ");
        String input = sc.nextLine();
        int count = 0;

        String[] myArray = input.split(",");

        System.out.println("please enter the name you want to find: ");
        String search = sc.nextLine();

        for (int i = 0; i < myArray.length; i++) {
            if (myArray[i].contains(search)) {
                count +=1;
            }
        }
        if (count > 0) {System.out.println("yes " + count);}
        else {System.out.println("no");}




    }
}
