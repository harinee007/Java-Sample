package junit;
import java.util.ArrayList;
import bean.Complaint;
import bean.Feedback;

import service.ComplaintManagementSystem;

public class Tester1 {
	
	ComplaintManagementSystem o1=new ComplaintManagementSystem();
	public void test()
	{
		ArrayList<Feedback> f1=new ArrayList<Feedback>();
		String str="feedback id: 201\nfeedback rating: 122\nfeedback comments:cccc\nfeedback suggestions:dddd\nfeedback id:301\nfeedback rating: 123\nfeedback comments:dddd\nfeedback suggestions:eeee\n";
		AssertEquals("tested",str,o1.getFeedbackofresolvedComplaint());
	}

}
