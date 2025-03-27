
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Set;

public class User {
    private String username;
    public ArrayList<Post> posts;
    public Set<User> followers;
    private int numberOfFollowers;

    public User(String username) {
        this.username = username;
        this.posts = new ArrayList<>();
        this.followers = new HashSet<>();
        this.numberOfFollowers = 0;
    }

    public String getUsername() {
        return this.username;
    }
    
    public int numberOfFollowers()
    {
        return this.numberOfFollowers;
    }
    
    public void addFollower(User follower)
    {
        this.followers.add(follower);
        this.numberOfFollowers++;
    }
    
    public void removeFollower(User follower)
    {
        if(this.followers.remove(follower))
        {
            this.numberOfFollowers--;
            System.out.println("Follower Removed Successfully");
        }
        else
        {
            System.out.println("Follower Not Found");
        }
    }
    
    public void addPost(Post post)
    {
        this.posts.add(post);
    }
    
    public void removePost(Post post)
    {
        if(this.posts.remove(post))
        {
            System.out.println("Post Removed Successfully");
        }
        else
        {
            System.out.println("Post Not Found");
        }
    }
    
}
