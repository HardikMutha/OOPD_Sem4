package CAR_SHOWROOM;

public class Car {
    
    public enum BodyType{SEDAN,COUPE,HATCHBACK,SUV,TRUCK,VAN};

    private String make;
    private String model;
    private int productionYear;
    private double price;
    private BodyType bodyType;
    public static final int MIN_YEAR = 1900;
    public static final int MAX_YEAR = 2025;
    public static final double MIN_PRICE = 0;
    public static final double MAX_PRICE = 200000;
    
    
    public String getMake() {
        return this.make;
    }

    public void setMake(String make) throws IllegalArgumentException {
        if(make == null || make.isBlank())
            throw new IllegalArgumentException("Make cannot be null or blank");
        this.make = make;
    }

    public String getModel() {
        return this.model;
    }

    public void setModel(String model) {
        if(model==null || model.isBlank())
            throw new IllegalArgumentException("Model cannot be null or blank");
        this.model = model;
    }

    public BodyType getBodyType()
    {
        return this.bodyType;
    }
    
    public void setBodyType(BodyType bodyType)
    {
        this.bodyType = bodyType;
    }


    public int getProductionYear() {
        return this.productionYear;
    }

    public void setProductionYear(int productionYear) {
        if(productionYear<MIN_YEAR || productionYear>MAX_YEAR)
            throw  new IllegalArgumentException("Invalid Year of production");
        this.productionYear = productionYear;
    }

    public double getPrice() {
        return this.price;
    }

    public void setPrice(double price) {
        if(price<MIN_PRICE || price>MAX_PRICE)
            throw new IllegalArgumentException("Invalid price bro");
        this.price = price;
    }

    public Car(String make, String model, BodyType bodyType, int productionYear, double price)
    {
        setMake(make);
        setModel(model);
        setProductionYear(productionYear);
        setPrice(price);
        setBodyType(bodyType);
    }

    public Car(Car myCar)
    {
        this.make = myCar.make;
        this.model = myCar.model;
        this.productionYear = myCar.productionYear;
        this.price = myCar.price;
        this.bodyType = myCar.bodyType;
    }

}