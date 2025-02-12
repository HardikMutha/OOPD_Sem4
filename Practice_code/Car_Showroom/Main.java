import CAR_SHOWROOM.Car;
import CAR_SHOWROOM.Car.BodyType;
import CAR_SHOWROOM.Car_DealerShip;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        String make = promptForMake(scanner);
        String model = promptForModel(scanner);
        BodyType bodyType = promptForBodyType(scanner);
        int year = promptForYear(scanner);
        double price = promptForPrice(scanner);
        
        Car newCar = new Car(make, model, bodyType, year, price);
        
        Car_DealerShip dealership = new Car_DealerShip();  
        dealership.addCar(newCar);
        
        System.out.println("Car added to the dealership: " + newCar.getMake() + " " + newCar.getModel());
    
    }
    public static boolean isNullOrBlank(String input) {
        return (input==null || input.isBlank());
    }
    
    public static boolean invalidYear(int year) {
        return (year<Car.MIN_YEAR || year>Car.MAX_YEAR);
    }

    public static boolean invalidBodyType(String input)
    {
        String temp = input.toUpperCase();
        try
        {
            BodyType t1 = BodyType.valueOf(temp);
            System.out.println(t1);
            return false;
        }
        catch(IllegalArgumentException e)
        {
            System.out.println("Nice Bro");
            return true;
        }
    }

    public static BodyType promptForBodyType(Scanner scanner) 
    {
        while (true) 
        {
            System.out.print("\nPlease enter a valid car body type: ");
            String bodyType = scanner.nextLine();
            if(!invalidBodyType(bodyType))
                return BodyType.valueOf(bodyType.toUpperCase());   
        }
    }
    
    public static String promptForMake(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car make: ");
            String make = scanner.nextLine();
            if(!isNullOrBlank(make))
                return make;
        }
    }
    
    public static String promptForModel(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car model: ");
            String model = scanner.nextLine();
            if(!isNullOrBlank(model))
                return model;
        }
    }

    public static int promptForYear(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid production year: ");
            if(scanner.hasNextInt())
            {
                int year = scanner.nextInt();
                if(!invalidYear(year))
                    return year;
            }
        }
    }

    public static double promptForPrice(Scanner scanner) {
        while (true) {
            System.out.print("\nPlease enter a valid car price: ");
            if(scanner.hasNextDouble())
            {
                double price = scanner.nextDouble();
                if(price>=0.0 && price<=200000)
                    return price;
            }
        }
    }


}