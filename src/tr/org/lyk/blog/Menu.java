package tr.org.lyk.blog;

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
		System.out.println(menu);
	}

	public static void printAddPageMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Page\n");
		menu.append("============\n");
		menu.append("You have to enter each one of these.(Title, Body, Category)\n");
	}

	public static void printAddPostMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Post\n");
		menu.append("============\n");
		menu.append("1-) Add Video Post\n");
		menu.append("2-) Add Text Post\n");
	}

	public static void printAddVideoPostMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Video Post\n");
		menu.append("============\n");
		menu.append("You have to enter each one of these.(Title, Body, Category, Url)\n");
	}

	public static void printAddTextPostMenu() {
		StringBuilder menu = new StringBuilder();

		menu.append("Add Video Post\n");
		menu.append("============\n");
		menu.append("You have to enter each one of these.(Title, Body, Category)\n");
	}

}
