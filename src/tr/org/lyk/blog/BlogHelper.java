package tr.org.lyk.blog;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

public class BlogHelper {

	private static List<Page> pages = new ArrayList<>();
	private static List<Post> posts = new ArrayList<>();

	public static void addPage(Page page) {
		pages.add(page);
	}

	public static void addPost(Post post) {
		posts.add(post);
	}

	public static void addComment(int postIndex, Comment comment) {
		posts.get(postIndex).addComment(comment);
	}

	public Iterator<Page> getPages() {
		return pages.iterator();
	}

	public Iterator<Post> getPosts() {
		return posts.iterator();
	}

}
