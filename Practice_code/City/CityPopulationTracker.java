
import java.util.HashMap;

public class CityPopulationTracker {
    private HashMap<String,City> cityPopulation;

    public CityPopulationTracker() {
        cityPopulation = new HashMap<>();
    }

    public City getCity(String cityName)
    {
      int x;
      for(int i=0;i<10;i++)
        System.out.println(x);
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
