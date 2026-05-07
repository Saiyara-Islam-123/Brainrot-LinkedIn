
import java.util.ArrayList;

public class Client { /// both recruiter and applicants are clients
    private ArrayList<Post> own_posts;
    private ArrayList<Post> accepted_posts;
                                        /// agent has same preference as Client
                                        ///agent is updated after creating or accepting post
    private ArrayList<Topic> preference; ///agent pdates preference; preference affects feed

    private ArrayList<Post> feed;
    private Agent agent;
    public Client (ArrayList<Topic> preference) {
        own_posts = new ArrayList<>();
        accepted_posts = new ArrayList<>();
        this.preference = preference;
        this.feed = new ArrayList<>();

    }
    /*

    String password;
    String username;
    ArrayList<Post> saved;



    public void swipe() {
    }

     */

    public Post create_post(String content, Topic topic) {
        Post p = new Post(content, topic);
        this.own_posts.add(p);
        return p;

    }

    public void accept_post(Post p) {
        this.accepted_posts.add(p);

    }
    public void add_to_preference(Topic t) {
        this.preference.add(t);
    }
    public void remove_preference(Topic t) {
        this.preference.remove(t);
    }

    public void add_to_feed(Post p) {
        this.feed.add(p);

    }
}

