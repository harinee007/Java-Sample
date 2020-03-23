package bean;

public class Complaint {
	private int compid;
	private String comType;
	private String compDesc;
	private String status;
	private String compRaiseBy;
	Feedback feed=new Feedback(0,0," "," ");
	public Complaint(int compid, String comType, String compDesc, String status, String compRaiseBy) {
		this.compid = compid;
		this.comType = comType;
		this.compDesc = compDesc;
		this.status = status;
		this.compRaiseBy = compRaiseBy;
	}

	public int getCompid() {
		return compid;
	}

	public void setCompid(int compid) {
		this.compid = compid;
	}

	public String getComType() {
		return comType;
	}

	public void setComType(String comType) {
		this.comType = comType;
	}

	public String getCompDesc() {
		return compDesc;
	}

	public void setCompDesc(String compDesc) {
		this.compDesc = compDesc;
	}

	public String getStatus() {
		return status;
	}

	public void setStatus(String status) {
		this.status = status;
	}

	public String getCompRaiseBy() {
		return compRaiseBy;
	}

	public void setCompRaiseBy(String compRaiseBy) {
		this.compRaiseBy = compRaiseBy;
	}

	public Feedback getFeed() {
		return feed;
	}

	public void setFeed(Feedback feed) {
		this.feed = feed;
	}
	
}
