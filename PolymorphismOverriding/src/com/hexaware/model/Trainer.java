package com.hexaware.model;

public class Trainer {
	private String domain;
	private String feedBack;
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
		return "Trainer details: \nDomain=" + domain + "\nFeedBack=" + feedBack;
	}


}
