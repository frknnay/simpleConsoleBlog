package tr.org.lyk.blog;

import java.util.Iterator;

public class Menu {

	public static void printMainMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Console Blog\n");
		menu.append("============\n");
		menu.append("1-) Add Page\n");
		menu.append("2-) Add Post\n");
		menu.append("3-) Add Comment\n");
		menu.append("4-) Show Pages\n");
		menu.append("5-) Show Posts\n");
		menu.append("0-) Exit\n");
		System.out.println(menu);
	}

	public static void printAddPageMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Page\n");
		menu.append("============\n");
		menu.append("You have to enter each one of these.(Title, Body, Category)\n");
		System.out.println(menu);
	}

	public static void printAddPostMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Post\n");
		menu.append("============\n");
		menu.append("1-) Add Video Post\n");
		menu.append("2-) Add Text Post\n");
		menu.append("0-) Previous menu\n");
		System.out.println(menu);
	}

	public static void printAddVideoPostMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Video Post\n");
		menu.append("============\n");
		menu.append("You have to enter each one of these.(Title, Body, Category, Url)\n");
		System.out.println(menu);
	}

	public static void printAddTextPostMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Video Post\n");
		menu.append("============\n");
		menu.append("You have to enter each one of these.(Title, Body, Category)\n");
		System.out.println(menu);
	}

	public static void printAddCommentMenu() {
		// StringBuilder menu = new StringBuilder();
		//
		// menu.append("Add Video Post\n");
		// menu.append("============\n");
		// menu.append("You have to enter each one of these.(Title, Body,
		// Category)\n");

	}

	public static void printPages() {
		StringBuilder menu = new StringBuilder();
		Iterator<Page> itPages = BlogHelper.getPages();
		int index = 1;

		menu.append("Pages\n");
		menu.append("============\n");
		while (itPages.hasNext()) {
			Page currentPage = itPages.next();
			menu.append(index++);
			menu.append("-) ");
			menu.append(currentPage.getTitle());
			menu.append(" - Category: ");
			menu.append(currentPage.getCategory());
			menu.append(" - ");
			menu.append(currentPage.getDate());
			menu.append("\n");
			menu.append(currentPage.getBody());
			menu.append("\n---------------------\n");
		}
		menu.append("Press enter to go back.");
		System.out.println(menu);

	}

	public static void printPosts() {
		StringBuilder menu = new StringBuilder();
		Iterator<Post> itPosts = BlogHelper.getPosts();
		int index = 1;

		menu.append("Posts\n");
		menu.append("============\n");
		while (itPosts.hasNext()) {
			Post currentPost = itPosts.next();
			menu.append(index++);
			menu.append("-) ");
			menu.append(currentPost.getTitle());
			menu.append(" - Category: ");
			menu.append(currentPost.getCategory());
			menu.append(" - ");
			menu.append(currentPost.getDate());
			menu.append("\n");
			menu.append(currentPost.getBody());
			menu.append("\n************\n");
			menu.append("Comments: \n");
			Iterator<Comment> itComments = currentPost.getComments();
			while (itComments.hasNext()) {
				Comment currentComment = itComments.next();
				menu.append("• ");
				menu.append(currentComment.getAuthor());
				menu.append(" - ");
				menu.append(currentComment.getDate());
				menu.append("\n");
				menu.append(currentComment.getText());
				menu.append("\n----------------\n");
			}
			menu.append("\n---------------------\n");
		}
		menu.append("Press enter to go back.");
		System.out.println(menu);

	}

}
