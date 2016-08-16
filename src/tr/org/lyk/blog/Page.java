package tr.org.lyk.blog;

import java.util.List;
import java.time.LocalDate;
import java.util.ArrayList;
import java.util.Iterator;

public class Page {

	private String title;
	private String body;
	private LocalDate date;
	private String category;
	private List<Comment> comments = new ArrayList<>();

	public Page(String title, String body, String category) {
		this.title = title;
		this.body = body;
		this.date = LocalDate.now();
		this.category = category;
	}

	// Getter methods
	public String getTitle() {
		return this.title;
	}

	public String getBody() {
		return this.body;
	}

	public LocalDate getDate() {
		return this.date;
	}

	public String getCategory() {
		return this.category;
	}
	
	public Iterator<Comment> getComments()
	{
		return this.comments.iterator();
	}

	// Setter methods
	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}
	
	public void setCategory(String category){
		this.category = category;
	}

}
