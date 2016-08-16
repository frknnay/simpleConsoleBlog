package tr.org.lyk.blog;

import java.util.Scanner;

public class Application {
	static Scanner scanner = new Scanner(System.in);
	static int input = 0;

	public static void main(String[] args) {
		while (true) {
			Menu.printMainMenu();
			input = scanner.nextInt();
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
		input = scanner.nextInt();
		if (input == 0) {
			return;
		}
	}

	public static void navigateToAddCommentMenu() {
		Menu.printAddCommentMenu();
		input = scanner.nextInt();
		if (input == 0) {
			return;
		}
	}

	public static void navigateToShowPagesMenu() {
		Menu.printPages();
		scanner.nextLine();
		scanner.nextLine();// There was a bug that i couldn't figure out!
	}

	public static void navigateToAddPostsMenu() {
		Menu.printPosts();
		scanner.nextLine();
		scanner.nextLine();// There was a bug that i couldn't figure out!
	}

}
