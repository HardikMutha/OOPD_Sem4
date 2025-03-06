// package Assignments.Labwork5;

/**
 * Main
 */
class Devlopers extends workPlace{
  public Devlopers(String deptName,int id)
  {
    super(deptName, id);
  }
  @Override
  void work(String name)
  {
    System.out.println("I am a developer named - "+name);
  }
}

class Managers extends workPlace
{
  public Managers(String deptName,int id)
  {
    super(deptName,id);
  }
  @Override
  void work(String name)
  {
    System.out.println("I am a Manager named - "+name);
  }
}

class Interns extends workPlace
{
  public Interns(String deptName,int id)
  {
    super(deptName, id);
  }
  @Override
  void work(String name)
  {
    System.out.println("I am an"+this.deptName+"Named - "+name);
  }
}

final class HR extends workPlace
{
  public HR(String deptName,int id)
  {
    super(deptName, id);
  }
  @Override
  void work(String name)
  {
    System.out.println("I am HR and my name is - "+name);
  }
}

public class Main {
  public static void main(String[] args) 
  {
    Devlopers d1 = new Devlopers("Devloper",101);
    d1.work("Hardik");
    Managers m1 = new Managers("Mananger",102);
    m1.work("Tanmay");
    Interns i1 = new Interns("Intern",103);
    i1.work("Suswan");
    HR h1 = new HR("HR",104);
    h1.work("Alhad");
    h1 = null;
    i1 = null;
    System.gc();
  }
}
