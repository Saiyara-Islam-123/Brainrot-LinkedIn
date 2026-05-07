import java.util.ArrayList;
import java.util.Arrays;

public class Main {

    public static void main(String[] args) {
        ArrayList<Topic> preference = new ArrayList<>();
        preference.add(Topic.HEALTH);
        Recruiter recruiter = new Recruiter(preference);
        Applicant applicant = new Applicant(preference);

        Post job_post = recruiter.create_post("We're hiring scientists!", Topic.HEALTH);
        applicant.accept_post(job_post);
        Post application = applicant.create_post("I have a PhD in biology", Topic.HEALTH);
        recruiter.accept_post(application);

    }

}
