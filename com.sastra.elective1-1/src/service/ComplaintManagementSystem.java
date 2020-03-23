package service;

import java.util.ArrayList;

import Exception.sizeAlreadyExceedException;
import bean.Complaint;
import bean.Feedback;

public class ComplaintManagementSystem {

	int count=0;
	ArrayList<Complaint> co=new ArrayList<Complaint>();

	public ArrayList<Complaint> getCo() {
		return co;
	}

	public void setCo(ArrayList<Complaint> co) {
		this.co = co;
	}
	
	public void addComplaint(Complaint c) throws sizeAlreadyExceedException
	{
		count++;
		try
		{
			if(count>100)
			{
				throw new sizeAlreadyExceedException();
			}
			else
			{
				co.add(c);
			}
		}
		catch(sizeAlreadyExceedException e)
		{
			e.toString();
		}
	}
	public boolean setFeedbacktoComplain(int compid,Feedback feed)
	{
		Complaint c;
		int flag=0;
		for(Complaint i:co)
		{
			if(i.getCompid()==compid&&i.getStatus()=="resolved")
			{
				flag=1;
				i.setFeed(feed);
				break;
			}
		}
		if(flag==1)
			return true;
		else
			return false;
	}
	public ArrayList<Feedback> getFeedbackofresolvedComplaint()
	{
		ArrayList<Feedback> f=new ArrayList<Feedback>();
		for(Complaint i:co)
		{
			if(i.getStatus()=="resolved")
			{
				f.add(i.getFeed());
			}
		}
		return f;
	}
	public Complaint getComplaintById(int compid)
	{
		int flag=0;
		Complaint res=new Complaint(0," "," "," "," ");
		for(Complaint i:co)
		{
			if(i.getCompid()==compid&&i.getStatus()!="resolved")
			{
				res=i;
				flag=1;
				break;
			}
		}
			return res;
	}
	
}
