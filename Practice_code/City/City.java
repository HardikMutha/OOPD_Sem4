public class City
{
    private String name;
    private String country;
    private long population;

    public String getName() {
        return this.name;
    }

    public void setName(String name) throws IllegalArgumentException {
        if(name == null || name.isBlank())
            throw new IllegalArgumentException("Name cannot be null or blank");
        else 
            this.name = name;
    }

    public String getCountry() {
        return this.country;
    }

    public void setCountry(String country) throws  IllegalArgumentException {
        if(country == null || country.isBlank())
            throw new IllegalArgumentException("Country cannot be null or blank");
        else
            this.country = country;
    }

    public long getPopulation() {
        return this.population;
    }

    public void setPopulation(long population) throws IllegalArgumentException {
        if(population<=0)
            throw new IllegalArgumentException("Population must be greater than 0");
        this.population = population;
    }
    public City(String name,String country, long population)
    {
        try {
            setCountry(country);
        } catch (Exception e) {
            setCountry("Pune");
        }
        setName(name);
        setPopulation(population);
    }
    public City(City myCity)
    {
        this.name = myCity.name;
        this.country = myCity.country;
        this.population = myCity.population;
    }

}