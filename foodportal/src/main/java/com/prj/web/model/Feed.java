package com.prj.web.model;

public class Feed {
	private int feedID;
	private long identity;
	private String feed;
	private String date;
	public int getFeedID() {
		return feedID;
	}
	public void setFeedID(int feedID) {
		this.feedID = feedID;
	}
	public long getIdentity() {
		return identity;
	}
	public void setIdentity(long identity) {
		this.identity = identity;
	}
	public String getFeed() {
		return feed;
	}
	public void setFeed(String feed) {
		this.feed = feed;
	}
	public String getDate() {
		return date;
	}
	public void setDate(String date) {
		this.date = date;
	}
	public Feed(int feedID, long identity, String feed, String date) {
		super();
		this.feedID = feedID;
		this.identity = identity;
		this.feed = feed;
		this.date = date;
	}
	@Override
	public String toString() {
		return "Feed [feedID=" + feedID + ", identity=" + identity + ", feed=" + feed + ", date=" + date + "]";
	}
	
	
}
