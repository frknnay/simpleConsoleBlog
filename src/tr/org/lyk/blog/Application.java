package tr.org.lyk.blog;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Application {
	static Scanner scanner = new Scanner(System.in);
	static int input = 0;

	public static void main(String[] args) {
		while (true) {
			Menu.printMainMenu();
			try {
				input = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: You have to enter a number!");
				scanner.nextLine();
				continue;
			}

			switch (input) {
			case 0:
				System.out.println("Exiting...");
				System.exit(0);
				break;
			case 1:
				navigateToAddPageMenu();
				break;
			case 2:
				navigateToAddPostMenu();
				break;
			case 3:
				navigateToAddCommentMenu();
				break;
			case 4:
				navigateToShowPagesMenu();
				break;
			case 5:
				navigateToAddPostsMenu();
				break;

			default:
				System.out.println("Error: There is no such menu!");
				break;
			}
		}

	}

	public static void navigateToAddPageMenu() {
		Menu.printAddPageMenu();
		String title = "";
		String body = "";
		String category = "";
		System.out.println("Title: ");
		scanner.nextLine();
		title = scanner.nextLine();
		System.out.println("Body: ");
		body = scanner.nextLine();
		System.out.println("Category: ");
		category = scanner.nextLine();

		Page page = new Page(title, body, category);
		BlogHelper.addPage(page);
	}

	public static void navigateToAddPostMenu() {
		Menu.printAddPostMenu();
		try {
			input = scanner.nextInt();
		} catch (InputMismatchException e) {
			System.out.println("Error: You have to enter a number!");
			return;
		}
		if (input == 1) {
			Menu.printAddVideoPostMenu();
			String title = "";
			String body = "";
			String category = "";
			String url = "";
			System.out.println("Title: ");
			scanner.nextLine();
			title = scanner.nextLine();
			System.out.println("Body: ");
			body = scanner.nextLine();
			System.out.println("Category: ");
			category = scanner.nextLine();
			System.out.println("Url: ");
			url = scanner.nextLine();

			VideoPost vPost = new VideoPost(title, body, category, url);
			BlogHelper.addPost(vPost);
		} else if (input == 2) {
			Menu.printAddTextPostMenu();
			String title = "";
			String body = "";
			String category = "";
			System.out.println("Title: ");
			scanner.nextLine();
			title = scanner.nextLine();
			System.out.println("Body: ");
			body = scanner.nextLine();
			System.out.println("Category: ");
			category = scanner.nextLine();

			TextPost tPost = new TextPost(title, body, category);
			BlogHelper.addPost(tPost);
		}
		else{
			System.out.println("Error: There is no such post type!");
		}
	}

	public static void navigateToAddCommentMenu() {
		Menu.printAddCommentMenu();
		int postIndex = 0;
		String author = "";
		String text = "";
		if (BlogHelper.hasPosts()) {
			System.out.println("Choose a post to comment.");
			try {
				postIndex = scanner.nextInt();
			} catch (InputMismatchException e) {
				System.out.println("Error: Index has to be a number");
				return;
			}
			System.out.println("Author: ");
			scanner.nextLine();
			author = scanner.nextLine();
			System.out.println("Text: ");
			text = scanner.nextLine();
			Comment comment = new Comment(author, text);
			BlogHelper.addComment(postIndex - 1, comment);
		} else {
			System.out.println("Press enter to go back.");
			scanner.nextLine();// To make user press enter
			scanner.nextLine();
		}
	}

	public static void navigateToShowPagesMenu() {
		Menu.printPages();
		System.out.println("Press enter to go back.");
		scanner.nextLine();
		scanner.nextLine();// There was a bug that i couldn't figure out!
	}

	public static void navigateToAddPostsMenu() {
		Menu.printPosts();
		System.out.println("Press enter to go back.");
		scanner.nextLine();
		scanner.nextLine();// There was a bug that i couldn't figure out!
	}

}
