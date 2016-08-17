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

	public static Iterator<Page> getPages() {
		return pages.iterator();
	}

	public static Iterator<Post> getPosts() {
		return posts.iterator();
	}

	public static boolean hasPosts() {
		if (posts.size() > 0) {
			return true;
		} else {
			return false;
		}
	}

}
