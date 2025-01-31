
import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String,City> cityPopulation;

    public CityPopulationTracker() {
        cityPopulation = new HashMap<>();
    }

    public City getCity(String cityName)
    {
        return new City(cityPopulation.get(cityName));
    }

    public void setCity(City myCity)
    {
        City tempCity = new City(myCity);
        cityPopulation.put(tempCity.getName(), tempCity);
    }
    public void addCity(City myCity)
    {
        City tempCity = new City(myCity);
        cityPopulation.put(tempCity.getName(), myCity);
    }
    public void printMap()
    {
        System.out.println(this.cityPopulation);
    }
    
}