package tr.org.lyk.blog;

import java.time.LocalDate;

public class Page {

	private String title;
	private String body;
	private LocalDate date;
	private String category;

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

	// Setter methods
	public void setTitle(String title) {
		this.title = title;
	}

	public void setBody(String body) {
		this.body = body;
	}

	public void setCategory(String category) {
		this.category = category;
	}
	
	

}
