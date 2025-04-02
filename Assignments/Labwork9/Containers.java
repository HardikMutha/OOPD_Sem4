import java.util.*;

public class Containers {
  public static void main(String[] args)
  {
    demonstrateArrayList();
    demonstrateLinkedList();
    demonstrateHashSet();
    demonstrateTreeSet();
    demonstrateTreeMap();
    demonstrateHashmap();
    demonstrateDeque();
    demonstrateQueue();
  }
  public static void demonstrateArrayList()
  {
    System.out.println("\n -------ArrayList Demonstration------ ");
    List<String> l1 = new ArrayList<>();
    l1.add("Banana");
    l1.add("Apple");
    l1.add("Pineapple");
    l1.add("Cherry");
    System.out.println("The elements after addition -> "+l1);

    System.out.println("Element at position 1");
    System.out.println(l1.get(0));

    l1.remove("Banana");
    System.out.println("The list after removing Banana "+l1);
    System.out.println("Contains 'Apple'? " + l1.contains("Apple"));
  }

  public static void demonstrateLinkedList()
  {
    System.out.println("\n------------Linked List Demonstration---------- \n");
    List<String> l1 = new LinkedList<>();
    l1.add("Dog");
    l1.add("Cat");
    l1.add("Cow");
    l1.add("Monkey");
    System.out.println("The LinkedList after addition = "+l1);

    l1.addFirst("Lion");
    l1.addLast("Tiger");
    System.out.println("The LinkedList after First and Last Addition - "+l1);

    l1.removeLast();
    System.out.println("After Last Removal - "+l1);

    l1.removeFirst();
    System.out.println("After First Removal - "+l1);
  }

  public static void demonstrateHashSet()
  {
    System.out.println("\n ---------Demonstration of HashSet---------- \n");
    Set<String> s1 = new HashSet<>();
    s1.add("Red");
    s1.add("Blue");
    s1.add("Green");
    s1.add("Pink");
    System.out.println("The value of Set -> "+s1);
    s1.remove("Pink");
    s1.add("Red");
    System.out.println("The value of Set after addition and removal-> "+s1);
  }

  public static void demonstrateTreeSet()
  {
    System.out.println("\n -----------Demonstration of Tree Set------------- \n");
    Set<Integer> s1 = new TreeSet<>();
    s1.add(2);
    s1.add(21);
    s1.add(22);
    s1.add(21);
    s1.add(5);
    System.out.println("The Data in Tree Set -> "+s1);
    s1.remove(21);
    s1.add(5);
    s1.add(10);
    System.out.println("The value after modifications -> "+s1);
  }

  public static void demonstrateHashmap()
  {
    System.out.println("Hashmap Demonstration -----> ");
    Map<Integer, String> hashMap = new HashMap<>();
        
        hashMap.put(1, "One");
        hashMap.put(2, "Two");
        hashMap.put(3, "Three");
        System.out.println("HashMap elements: " + hashMap);
        
        System.out.println("Value for key 2: " + hashMap.get(2));
        
        System.out.println("Contains key 4? " + hashMap.containsKey(4));
        System.out.println("Contains value 'One'? " + hashMap.containsValue("One"));
        
        hashMap.remove(2);
        System.out.println("After removing key 2: " + hashMap);
        
        System.out.println("Iterating through entries:");
        for (Map.Entry<Integer, String> entry : hashMap.entrySet()) {
            System.out.println(entry.getKey() + " => " + entry.getValue());
        }
    }

    private static void demonstrateTreeMap() {
        System.out.println("\n----- TreeMap Demonstration -----");
        TreeMap<String, Integer> treeMap = new TreeMap<>();
        
        treeMap.put("Apple", 10);
        treeMap.put("Banana", 5);
        treeMap.put("Cherry", 15);
        System.out.println("TreeMap elements (sorted by keys): " + treeMap);
        
        System.out.println("First key: " + treeMap.firstKey());
        System.out.println("Last key: " + treeMap.lastKey());
        System.out.println("Lower entry than 'Blueberry': " + treeMap.lowerEntry("Blueberry"));
        System.out.println("Higher entry than 'Blueberry': " + treeMap.higherEntry("Blueberry"));
        
        // SubMap operations
        System.out.println("SubMap from 'Apple' to 'Cherry': " + 
                treeMap.subMap("Apple", true, "Cherry", true));
    }
    
    private static void demonstrateQueue() {
        System.out.println("\n----- Queue Demonstration -----");
        Queue<String> queue = new LinkedList<>();
        
        // Adding elements
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");
        System.out.println("Queue elements: " + queue);
        
        // Peeking at the head of the queue
        System.out.println("Head of queue: " + queue.peek());
        
        // Removing elements (FIFO order)
        System.out.println("Removed: " + queue.poll());
        System.out.println("After removal: " + queue);
    }
    
    private static void demonstrateDeque() {
        System.out.println("\n----- Deque Demonstration -----");
        Deque<String> deque = new ArrayDeque<>();
        
        deque.offerFirst("First");
        deque.offerLast("Last");
        deque.offerFirst("New First");
        deque.offerLast("New Last");
        System.out.println("Deque elements: " + deque);
        
        System.out.println("First element: " + deque.peekFirst());
        System.out.println("Last element: " + deque.peekLast());
        
        System.out.println("Removed first: " + deque.pollFirst());
        System.out.println("Removed last: " + deque.pollLast());
        System.out.println("After removals: " + deque);
    }


}
