package tr.org.lyk.blog;

public class TextPost extends Post {

	private String summary;

	public TextPost(String title, String body, String category) {
		super(title, body, category);
		if (this.getBody().length() > 10) {
			this.summary = this.getBody().substring(0, 11);
		} else {
			this.summary = body;
		}
	}

	// Getter methods
	public String getSummary() {
		return this.summary;
	}

}
