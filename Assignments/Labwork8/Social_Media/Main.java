import java.util.*;

public class Main {
    public static void main(String[] args) {
        Random random = new Random();
        
        User user1 = new User("Alice");
        User user2 = new User("Bob");
        User user3 = new User("Charlie");
        User user4 = new User("David");
                
        Post post1 = new Post("Hello, world!", 1, user1);
        Post post2 = new Post("Java is awesome!", 2, user2);
        Post post3 = new Post("Coding every day!", 3, user3);
        Post post4 = new Post("Follow me for more updates.", 4, user4);
        
        user1.addPost(post1);
        user2.addPost(post2);
        user3.addPost(post3);
        user4.addPost(post4);
        
        user1.addFollower(user2);
        user1.addFollower(user3);
        user2.addFollower(user1);
        user3.addFollower(user4);
        user4.addFollower(user1);
        
        Posts postsCollection = new Posts();
        postsCollection.AddPost(post1);
        postsCollection.AddPost(post2);
        postsCollection.AddPost(post3);
        postsCollection.AddPost(post4);
        
        for (Post post : Arrays.asList(post1, post2, post3, post4)) {
            post.setLikes(random.nextInt(100));
            post.setDislikes(random.nextInt(50));
        }
        
        System.out.println("All Posts:");
        postsCollection.getAllUserPosts();
        
        System.out.println("\nTrending Posts:");
        postsCollection.getTrendingPosts();
        postsCollection.getAllUserPosts();
    }
}
