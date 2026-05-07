import java.util.ArrayList;
import java.util.HashMap;

public class TopicPostList { ///should be a unique object, no copies, singleton

    private Topic topic;
    private ArrayList<Post> posts;
    private static HashMap<Topic, TopicPostList> record;

    private TopicPostList(Topic topic) {

        this.topic = topic;
        this.posts = new ArrayList<>();
    }
    private void fill_TopicPostList_record() {
        HashMap<Topic, TopicPostList> record = new HashMap<>();// make sure it's a singleton
        Topic[] topics = {Topic.TECH, Topic.HEALTH, Topic.BUSINESS, Topic.CREATIVE, Topic.BIOTECH,
          Topic.FINANCE, Topic.RESEARCH};
        for (Topic topic : topics) {
            TopicPostList tp = new TopicPostList(topic);
            record.put(topic, tp);

        }
        TopicPostList.record = record;
    } ///run this only once, within this class

    public TopicPostList get_TopicPostList(Topic t) {
        return TopicPostList.record.get(t);
    }

    public static void add_to_get_TopicPostList(TopicPostList tp, Post p) {
        assert tp.topic == p.topic;
        tp.posts.add(p);

    }

}
