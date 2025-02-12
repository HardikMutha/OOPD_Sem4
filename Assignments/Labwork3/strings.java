public class strings {
    public static void main(String[] args) 
    {
        String str = "Hello World";
        // Use all the possible string functions
        
        System.out.println("Character at index 2: " + str.charAt(2));
        System.out.println("Code point at index 0: " + str.codePointAt(0));
        System.out.println("Code point before index 1: " + str.codePointBefore(1));
        
        System.out.println("Code point count from index 0 to 5: " + str.codePointCount(0, 5));
        
        System.out.println("Comparison with 'Hello World': " + str.compareTo("Hello World"));
        System.out.println("Comparison with 'hello world' (ignore case): " + str.compareToIgnoreCase("hello world"));
        System.out.println("Concatenation with 'Java': " + str.concat(" Java"));
        System.out.println("Contains 'Hello': " + str.contains("Hello"));
        System.out.println("Content equals 'Hello World': " + str.contentEquals("Hello World"));
        char[] arr1 = {'H', 'e', 'l', 'l', 'o'};
        System.out.println("Copy value of char array: " + String.copyValueOf(arr1));
        System.out.println("Ends with 'World': " + str.endsWith("World"));
        System.out.println("Equals 'Hello World': " + str.equals("Hello World"));
        System.out.println("Equals 'hello world' (ignore case): " + str.equalsIgnoreCase("hello world"));
        System.out.println("Formatted string: " + String.format("Hello %s", "World"));
        
        byte[] byteArray = str.getBytes();
        //getChars() method
        char[] charArray = new char[10];
        str.getChars(0, 5, charArray, 0);
        
        System.out.println("Hash code: " + str.hashCode());
        System.out.println("Index of character 'o': " + str.indexOf('o'));
        
        String s = new String("Hello");
        System.out.println("Interned string: " + s.intern());
        
        System.out.println("Is empty: " + str.isEmpty());
        
        String joinString1 = String.join("-", "welcome", "to", "javatpoint");
        System.out.println("Joined string: " + joinString1);
        
        System.out.println("Last index of 'o': " + str.lastIndexOf("o"));

        System.out.println("Length of the string: " + str.length());
        
        System.out.println("Matches 'Hello.*': " + str.matches("Hello.*"));
        
        System.out.println("Offset by code points (0, 5): " + str.offsetByCodePoints(0, 5));
        
        System.out.println("Region matches 'Hello': " + str.regionMatches(0, "Hello", 0, 5));

        System.out.println("Replace 'World' with 'Java': " + str.replace("World", "Java"));
        
        String s1 = "My name is Khan. My name is Bob. My name is Sonoo.";
        String replaceString = s1.replaceAll("is", "was");//replaces all occurrences of "is" to "was"
        System.out.println("Replace all 'is' with 'was': " + replaceString);
        
        String replaceString1 = s1.replaceFirst("is", "was");//replaces first occurrence of "is" to "was"
        System.out.println("Replace first 'is' with 'was': " + replaceString1);

        System.out.println("Split by space: ");
        String[] arr = str.split(" ");
        for (String t1 : arr) {
            System.out.println(t1);
        }
        
        System.out.println("Starts with 'Hello': " + str.startsWith("Hello"));
        
        CharSequence cs = str.subSequence(0, 5);
        System.out.println("Substring: " + cs);

        System.out.println("Substring from index 2 to 5: " + str.substring(2, 5));
        
        char[] charArray1 = str.toCharArray();
        System.out.println("Value of charArray: ");
        for(char a:charArray1)
            System.out.print(a+" ");
        System.out.println();

        System.out.println("Lowercase: " + str.toLowerCase());
        
        System.out.println("toString method: " + str.toString());
        
        System.out.println("Uppercase: " + str.toUpperCase());

        System.out.println("Trim: " + str.trim());
        
        int value = 30;
        String valueOf = String.valueOf(value);
        System.out.println("Int converted to String: " + valueOf);
    }
}