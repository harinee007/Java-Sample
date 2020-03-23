package dao;

import bean.Complaint;

public class complaintDaoDemo {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		complaintDao obj=new complaintDao();
		Complaint c=obj.getComaplintWithFeedback(100);
		System.out.println("complaint id: "+c.getCompid());
		System.out.println("complaint decription: "+c.getCompDesc());
		System.out.println("complaint raise by: "+c.getCompRaiseBy());
		System.out.println("complaint type: "+c.getComType());
		System.out.println("omplaint status: "+c.getStatus());
		
		obj.updatesComplaintStatus(200,"resolved");
		System.out.println("AFTER UPDATION:");
		Complaint c2=obj.getComaplintWithFeedback(100);
		System.out.println("complaint id: "+c.getCompid());
		System.out.println("complaint decription: "+c.getCompDesc());
		System.out.println("complaint raise by: "+c.getCompRaiseBy());
		System.out.println("complaint type: "+c.getComType());
		System.out.println("omplaint status: "+c.getStatus());
		
	}

}
