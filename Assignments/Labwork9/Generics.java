// Generic class
class Box<T> {
    private T value;

    public void setValue(T value) {
        this.value = value;
    }

    public T getValue() {
        return value;
    }
}

// Generic method
class GenericMethodDemo {
    public static <T> void printArray(T[] array) {
        for (T element : array) {
            System.out.print(element + " ");
        }
        System.out.println();
    }
}

// Bounded Type Parameter


public class Generics {
    public static void main(String[] args) {
        // Using generic class
        Box<String> stringBox = new Box<>();
        stringBox.setValue("Hello Generics");
        System.out.println("String value: " + stringBox.getValue());
        
        Box<Integer> intBox = new Box<>();
        intBox.setValue(10);
        System.out.println("Integer value: " + intBox.getValue());

        // Using generic method
        Integer[] intArray = {1, 2, 3, 4, 5};
        String[] strArray = {"A", "B", "C"};
        System.out.print("Integer Array: ");
        GenericMethodDemo.printArray(intArray);
        System.out.print("String Array: ");
        GenericMethodDemo.printArray(strArray);

    }
}
