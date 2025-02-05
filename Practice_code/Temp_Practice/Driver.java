public class Driver {
    private String name;
    private int age;
    public final int MIN_AGE = 18;
    public final int MAX_AGE = 65;
    public enum color { WHITE,RED,BLUE,GREEN };

    public Driver(String name,int age) {
        System.out.println(color.RED);
        this.name = name;
        this.age = age;
    }

    public String getName() {
        return this.name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return this.age;
    }

    public void setAge(int age) {
        this.age = age;
    }
    public int getMIN_AGE()
    {
        return MIN_AGE;
    }

}