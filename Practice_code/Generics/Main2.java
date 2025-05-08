
class Box<T,V>
{
  private T var1;
  private V var2;
  public Box(T param1,V param2)
  {
    this.var1 = param1;
    this.var2 = param2;
  }

  public T getVar()
  {
    return this.var1;
  }

  public V getVar2()
  {
    return this.var2;
  }
}

public class Main2 
{
  public static void main(String[] args) 
  {
    Box<String,Integer> b1 = new Box("String",12);
    System.out.println(b1.getVar());
    System.out.println(b1.getVar2());
  }
}
