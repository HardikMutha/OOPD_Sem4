
import java.util.ArrayList;

public class Stock {
  private String stockName;
  private double currentPrice;
  private double priceChange;
  @SuppressWarnings("FieldMayBeFinal")
  private double[] priceHistory;
  private int currentSize;
  private ArrayList<User> subscribedUsers;

  public Stock(String stockName,double currentPrice)
  {
    this.stockName = stockName;
    this.currentPrice = currentPrice;
    this.priceHistory = new double[32];
    this.currentSize = 0;
    subscribedUsers = new ArrayList<>();
  }
  
  public String getStockName() {
    return this.stockName;
  }
  
  public void setStockName(String stockName) {
    this.stockName = stockName;
  }

  public double getCurrentPrice() {
    return this.currentPrice;
  }

  public void setCurrentPrice(double currentPrice) {
    this.priceHistory[this.currentSize] = currentPrice;
    this.currentSize++;
    this.setPriceChange(this.currentPrice-currentPrice);
    this.currentPrice = currentPrice;
    for(int i=0;i<this.subscribedUsers.size();i++)
    {
      //Notify all the subscribers of the stock about the price change
      this.subscribedUsers.get(i).notify(this);
    }
  }

  public double getPriceChange() {
    return this.priceChange;
  }

  public void setPriceChange(double priceChange) {
    this.priceChange = priceChange;
  }

  public void updatePriceHistory(double newPrice)
  {
    priceHistory[this.currentSize] = newPrice;
    this.currentSize++; 
  }

  public void getStockInfo()
  {
    System.out.println("Stock Name - "+this.stockName+". The current Price = "+this.currentPrice);
  }

  public void addSubscriber(User u)
  {
    this.subscribedUsers.add(u);
    System.out.println("User "+u.getUserName()+" subscribed to stock "+this.stockName);
  }
  public void removeSubscriber(User u)
  {
    this.subscribedUsers.remove(u);
    System.out.println("Unsubscribed from "+this.stockName+" for user "+u.getUserName());
  }
  

}
