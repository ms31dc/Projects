package org.sai.rest.messenger.model;

import java.util.Date;

public class Comment {
	
	
	private long id;

	private String message;
	private Date created;
	private String author;
	
	
	
	
	
	public Comment() {
	 
		// TODO Auto-generated constructor stub
	}
	
	
	
	
	public Comment(String message, Date created, String author) {
		super();
		this.message = message;
		this.created = new Date();
		this.author = author;
	}


	public long getId() {
		return id;
	}




	public void setId(long id) {
		this.id = id;
	}

	public String getMessage() {
		return message;
	}
	public void setMessage(String message) {
		this.message = message;
	}
	public Date getCreated() {
		return created;
	}
	public void setCreated(Date created) {
		this.created = created;
	}
	public String getAuthor() {
		return author;
	}
	public void setAuthor(String author) {
		this.author = author;
	}
	
	
	
	
	
	
	 
	
	
	

}
