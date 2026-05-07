import com.github.chen0040.rl.learning.qlearn.QAgent; //agent

import java.util.ArrayList;

public class Agent {
    private ArrayList<Topic> preference;

    public Agent(ArrayList<Topic> preference) {
        this.preference = preference;////will be able to access respective topic post list through topics in preference

    }

    /*
    public static void main(String[] args) {
        int stateCount = 100;
        int actionCount = 10;
        QAgent agent = new QAgent(stateCount, actionCount);
        int actionId = agent.selectAction().getIndex();
        System.out.println(actionId);
    }

     */
}

