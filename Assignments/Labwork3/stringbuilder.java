public class stringbuilder {
    public static void main(String[] args) {
        //implementing StringBuilder methods
        StringBuilder str = new StringBuilder("Hello World");
        System.out.println("Character at index 2: " + str.charAt(2));
        //append() method
        System.out.println("Append: " + str.append(" Java"));
        //insert() method
        System.out.println("Insert: " + str.insert(5, " Java"));
        //replace() method
        System.out.println("Replace: " + str.replace(5, 10, "Java"));
        //delete() method
        System.out.println("Delete: " + str.delete(5, 10));
        //reverse() method
        System.out.println("Reverse: " + str.reverse());
        //length() method
        System.out.println("Length of the string: " + str.length());
        //capacity() method
        System.out.println("Capacity of the string: " + str.capacity());
        //ensureCapacity() method
        str.ensureCapacity(50);
        System.out.println("New Capacity of the string: " + str.capacity());
        //setCharAt() method
        str.setCharAt(0, 'H');
        System.out.println("Set character at index 0: " + str);
        
    }
}