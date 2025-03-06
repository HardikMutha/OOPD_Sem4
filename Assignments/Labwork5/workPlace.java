public abstract class workPlace
{ 
  abstract void work(String empName);
  public String deptName;
  public int id;
  public workPlace(String deptName,int id)
  {
    this.deptName = deptName;
    this.id = id;
  }
}

