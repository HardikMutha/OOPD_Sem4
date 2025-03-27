public class Post {
    private String postContent;
    private int Likes;
    private int Dislikes;
    private int postId;
    private User PostOwner;

    public Post(String PostContent,int postId,User postOwner)
    {
        this.PostOwner = postOwner;
        this.postContent = PostContent;
        this.postId = postId;
        this.Likes = 0;
        this.Dislikes = 0;
    }

    public String getPostContent() {
        return this.postContent;
    }

    public void setPostContent(String postContent) {
        this.postContent = postContent;
    }

    public int getLikes() {
        return this.Likes;
    }

    public void setLikes(int Likes) {
        this.Likes = Likes;
    }

    public int getDislikes() {
        return this.Dislikes;
    }

    public void setDislikes(int Dislikes) {
        this.Dislikes = Dislikes;
    }    
    public void setPostId(int postId) {
        this.postId = postId;
    }
    public int getPostId()
    {
        return this.postId;
    }
    public void showPost()
    {
        System.out.print("Post ID: "+this.postId+" ");
        System.out.print("Post Content: "+this.postContent+" ");
        System.out.print("Likes: "+this.Likes+" ");
        System.out.println("Dislikes: "+this.Dislikes+" ");
    }
}