package com.hexaware.model;

public class Developer extends Trainer{
	private String feedBack;
	private String domain;
	
	

	public String getDomain() {
		return domain;
	}

	public void setDomain(String domain) {
		this.domain = domain;
	}

	public String getFeedBack() {
		return feedBack;
	}

	public void setFeedBack(String feedBack) {
		this.feedBack = feedBack;
	}

	@Override
	public String toString() {
		return "Developer details:\nDomain=" + domain + "\nFeedBack=" + feedBack;
	}
	

}
