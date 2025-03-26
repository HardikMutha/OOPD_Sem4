import java.util.ArrayList;

public class Stocks {
    private ArrayList<Stock> AllStocks;
    public Stocks()
    {
        AllStocks = new ArrayList<>();
        Stock s1 = new Stock("Zomato",200.34);
        AllStocks.add(s1);
        s1 = new Stock("Reliance Industries",1285.45);
        AllStocks.add(s1);
        s1 = new Stock("Bharti Airtel",1730.50);
        AllStocks.add(s1);
        s1 = new Stock("ICICI",495.24);
        AllStocks.add(s1);
        s1 = new Stock("Adani Cement",842.53);
        AllStocks.add(s1);
        s1 = new Stock("ITC",409.25);
        AllStocks.add(s1);
        s1 = new Stock("HCL Tech",1624.90);
        AllStocks.add(s1);
    }
    public void getListOfStock()
    {
        for(int i=0;i<this.AllStocks.size();i++)
        {
            this.AllStocks.get(i).getStockInfo();
        }
    }
    public ArrayList<Stock> getAllStocks()
    {
        return this.AllStocks;
    }
}
