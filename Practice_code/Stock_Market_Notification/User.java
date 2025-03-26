
import java.util.ArrayList;

interface Subscriber{
    void notify(Stock s1);
}

public class User implements Subscriber {
    private String username;
    private ArrayList<Stock> subscribedStocks;
    public User(String username)
    {
        this.username = username;
        subscribedStocks = new ArrayList<>();
    }
    public void getsubscribedStocks()
    {
        if(this.subscribedStocks.isEmpty())
        {
            System.out.println("Not subscribed to Any Stock");
        }
        else
        {
            System.out.println("The Stocks subscribed are ");
            for(int i=0;i<this.subscribedStocks.size();i++)
            {
                this.subscribedStocks.get(i).getStockInfo();
            }
        }
    }
    public String getUserName()
    {
        return this.username;
    }
    public void setUsername(String newUsername)
    {
        this.username = newUsername;
    }
    @Override
    public void notify(Stock s1)
    {
        System.out.print("Notification Sent to user "+username+" The Notification is - ");
        System.out.println("The price of stock "+s1.getStockName()+" changed by amount "+s1.getPriceChange());
    }

    public void setSubscribedStocks(ArrayList<Stock> subscribedStocks) {
        this.subscribedStocks = subscribedStocks;
    }

}


