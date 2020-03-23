package Test;

import java.util.ArrayList;

import Exception.sizeAlreadyExceedException;
import bean.Complaint;
import bean.Feedback;
import service.ComplaintManagementSystem;

public class Tester {

	public static void main(String[] args) throws sizeAlreadyExceedException {
		// TODO Auto-generated method stub
		
		 ComplaintManagementSystem cms=new  ComplaintManagementSystem();
		 Complaint cobj1=new Complaint(100,"food","eatables","new","wghj");
		 Complaint cobj2=new Complaint(200,"food","eatables","resolved","wghj");
		 Complaint cobj3=new Complaint(300,"accomodation","eatables","resolved","wghj");
		 Complaint cobj4=new Complaint(400,"accomodation","eatables","resolved","wghj");
		 Complaint cobj5=new Complaint(500,"food","eatables","new","wghj");
		 
		 Feedback fobj1=new Feedback(101,121,"aaaa","bbbb");
		 Feedback fobj2=new Feedback(201,122,"cccc","dddd");
		 Feedback fobj3=new Feedback(301,123,"dddd","eeee");
		 Feedback fobj4=new Feedback(401,124,"eeee","ffff");
		 Feedback fobj5=new Feedback(501,125,"ffff","gggg");
		 
		 
		 cms.addComplaint(cobj1);
		 cms.addComplaint(cobj2);
		 cms.addComplaint(cobj3);
		 cms.addComplaint(cobj4);
		 cms.addComplaint(cobj5);
		 
		 boolean result1=cms.setFeedbacktoComplain(200,fobj1);
		 boolean result2=cms.setFeedbacktoComplain(300,fobj2);
		 
		 System.out.println("the result is: "+result1);
		 System.out.println("the result is: "+result2);
		 
		 ArrayList<Feedback> feed=new ArrayList<Feedback>();
		 feed=cms.getFeedbackofresolvedComplaint();
		 for(Feedback f:feed)
		 {
			 System.out.println("feedback id: "+f.getFeedbackId());
			 System.out.println("feedback rating: "+f.getRating());
			 System.out.println("feedback comments: "+f.getComments());
			 System.out.println("feedback suggestions: "+f.getSuggestion());
		 }
		 
		 Complaint c1=cms.getComplaintById(100);
		 
		System.out.println("complaint id: "+c1.getCompid());
		System.out.println("complaint description: "+c1.getCompDesc());
		System.out.println("complaint raise by: "+c1.getCompRaiseBy());
		System.out.println("complaint type: "+c1.getComType());
	
	}

}
