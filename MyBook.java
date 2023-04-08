

public class MyBook {
    static String title;

    public void setTitle(String title) {
        this.title = title;
    }

    static String getTitle() {
        return title;
    }

    private static void MyBook(String title) {
        System.out.println("The title is: " + title);
    }

    public static void main(String[] args) {
        MyBook new_novel = new MyBook();
        new_novel.MyBook("A tale of two cities");
    }
}







