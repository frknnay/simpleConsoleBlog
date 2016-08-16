package tr.org.lyk.blog;

import java.time.LocalDate;

public class Comment {

	private String author;
	private String text;
	private LocalDate date;
	
	public Comment(String author,String text){
		this.author = author;
		this.text = text;
		this.date = LocalDate.now();
	}
	
	// Getter methods
	public String getAuthor(){
		return this.author;
	}
	
	public String getText()
	{
		return this.text;
	}
	
	public LocalDate getDate(){
		return this.date;
	}
	
	// Setter methods
	public void setAuthor(String author)
	{
		this.author = author;
	}
	
	public void setText(String text)
	{
		this.text = text;
	}
	
}
