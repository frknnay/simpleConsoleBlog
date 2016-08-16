package tr.org.lyk.blog;

public class VideoPost extends Post{

	private String url;
	
	public VideoPost(String title, String body, String category,String url) {
		super(title, body, category);
		this.url = url;
	}
	
	// Getter methods
	public String getUrl(){
		return this.url;
	}
	
	// Setter methods
	public void setUrl(String url)
	{
		this.url = url;
	}

}
