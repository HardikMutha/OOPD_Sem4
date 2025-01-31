
import java.util.Scanner;

public class Main {
    public static boolean isNullorBlank(String s)
    {
        return (s==null || s.isBlank());
    }
    public static boolean incorrectIssueNumber(int issueNumber) {
        return (issueNumber<=0);
    }
    public static boolean incorrectPublicationYear(int publicationYear) {
        return publicationYear<=0;
    }

    public static String promptForTitle(Scanner sc)
    {
        while (true) { 
            System.out.println("Please Enter a valid title");
            String title = sc.nextLine();
            if(!isNullorBlank(title))
                return title;
        }
    }
    public static String promptForPublisher(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publisher: ");
            String publisher = scanner.nextLine();
            if(!isNullorBlank(publisher))
                return publisher;
        }
        // String publisher = scanner.nextLine();
        // return publisher;
    }

    public static int promptForIssueNumber(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid issue number (greater than 0): ");
            if(!scanner.hasNextInt())
            {
                scanner.next();
                continue;
            }
            int issueNumber = scanner.nextInt();
            return issueNumber;
        }
    }
    public static int promptForPublicationYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid publication year (greater than 0): ");
            if(!scanner.hasNextInt())
            {
                scanner.next();
                continue;
            }
            int publicationYear = scanner.nextInt();
            return publicationYear;
        }
    }

    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        String title = promptForTitle(sc);
        String publisher = promptForPublisher(sc);
        int issueNumber = promptForIssueNumber(sc);
        int publicationYear = promptForPublicationYear(sc);
        Magazine newMagazine = new Magazine(title,publisher,issueNumber,publicationYear);
        MagazineLibrary library = new MagazineLibrary();
        library.addMagazine(newMagazine);
        System.out.println("Magazine added to the library : "+ newMagazine.getTitle());
    }
}