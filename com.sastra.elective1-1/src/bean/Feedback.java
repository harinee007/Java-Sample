package bean;

public class Feedback {
	
	private int feedbackId;
	private int rating;
	private String comments;
	private String suggestion;
	
	public Feedback(int feedbackId, int rating, String comments, String suggestion) {
		this.feedbackId = feedbackId;
		this.rating = rating;
		this.comments = comments;
		this.suggestion = suggestion;
	}

	public int getFeedbackId() {
		return feedbackId;
	}

	public void setFeedbackId(int feedbackId) {
		this.feedbackId = feedbackId;
	}

	public int getRating() {
		return rating;
	}

	public void setRating(int rating) {
		this.rating = rating;
	}

	public String getComments() {
		return comments;
	}

	public void setComments(String comments) {
		this.comments = comments;
	}

	public String getSuggestion() {
		return suggestion;
	}

	public void setSuggestion(String suggestion) {
		this.suggestion = suggestion;
	}
}
