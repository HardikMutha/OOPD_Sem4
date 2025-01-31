
import java.util.Scanner;

public class Main {
    public static void main(String[] args) 
    {
        Scanner scanner = new Scanner(System.in);

        String cityName = promptForCityName(scanner);
 
        String country = promptForCountry(scanner);
 
        int population = promptForPopulation(scanner);
 
        City newCity = new City(cityName, country, population);
 
        CityPopulationTracker tracker = new CityPopulationTracker();
        
        tracker.addCity(newCity); 
 
        System.out.println("City added to the tracker: " + newCity.getName());       
    }
    public static boolean isNullorBlank(String s)
    {
        return (s==null || s.isBlank());
    }
    public static boolean incorrectPopulation(long population)
    {
        return (population<=0);
    }
    public static String promptForCityName(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid city name: ");
            String cityName = scanner.nextLine();
            if(!isNullorBlank(cityName))
                return  cityName;
        }
    }
    public static String promptForCountry(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid country: ");
            String country = scanner.nextLine();
            if(!isNullorBlank(country))
                return country;
        }
    }
    public static int promptForPopulation(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid population (greater than 0): ");
            if(scanner.hasNextInt())
            {
                int population = scanner.nextInt();
                if(!incorrectPopulation(population))
                    return population;
            }
            scanner.nextLine();
        }
    }
}
