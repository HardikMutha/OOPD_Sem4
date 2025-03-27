import java.util.ArrayList;

public class Posts 
{
    private ArrayList<Post> posts;
    private int postCount;
    
    public Posts()
    {
        this.posts = new ArrayList<Post>();
        this.postCount = 0;
    }
    
    public void AddPost(Post p)
    {
        this.posts.add(p);
        this.postCount++;
    }
    
    public void RemovePost(Post p)
    {
        this.posts.remove(p);
        this.postCount--;
    }
    
    public int getPostCount()
    {
        return this.postCount;
    }

    public void getAllUserPosts(User u)
    {
        System.out.println("Showing Posts for user - "+u.getUsername());
        for(Post p : u.posts)
        {
            p.showPost();
        }
    }
    public void getTrendingPosts()
    {
        this.posts.sort((p1,p2)->(p2.getLikes()-p1.getLikes()));
    }

    public void getAllUserPosts()
    {
        for(Post p : this.posts)
        {
            p.showPost();
        }
    }
}
