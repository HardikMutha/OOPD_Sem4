import java.util.Vector;
public class vectors {
    public static void main(String[] args) 
    {
        Vector<String> v1 = new Vector<>();
        v1.add("Alice");
        v1.add("Bob");
        //add() method
        v1.add(1, "Charlie");
        System.out.println("Vector 1: " + v1);
        //remove() method
        v1.remove(1);
        System.out.println("Vector 1: " + v1);
        //size() method
        System.out.println("Size of vector 1: " + v1.size());
        //get() method
        System.out.println("Element at index 1: " + v1.get(1));
        //set() method
        v1.set(1, "David");
        //isEmpty() method
        System.out.println("Is vector 1 empty? " + v1.isEmpty());
        //contains() method
        System.out.println("Does vector 1 contain David? " + v1.contains("David"));
        //clear() method
        v1.clear();
        System.out.println("Vector 1: " + v1);
    }
}