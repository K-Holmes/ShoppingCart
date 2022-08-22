import java.util.Scanner;

public class NameMaker {

    public static void main(String args[])
    {
        String fullName, firstName, middleName, lastName;
        Scanner scan = new Scanner(System.in);

        System.out.println("Enter your first name: ");
        firstName = scan.nextLine();
        System.out.println("Enter your middle name: ");
        middleName = scan.nextLine();
        System.out.println("Enter your last name: ");
        lastName = scan.nextLine();
        fullName = firstName + " " + middleName + " " + lastName;
        scan.close();
        System.out.println("Your full name is: " + fullName);

    }

}
