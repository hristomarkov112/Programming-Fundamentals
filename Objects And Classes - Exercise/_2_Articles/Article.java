package _2_Articles;

public class Article {

    //полета характеристики(заглавие, съдържание, автор)
    private String title;
    private String content;
    private String author;

    //конструктор -> метод, чрез който създаваме обекти от класа
    //автоматично генериране на коснтуктор (Alt + Insert или десен бутон -> Generate -> Constructor)


    public Article(String title, String content, String author) {
        this.title = title;
        this.content = content;
        this.author = author;
    }

    //методи -> действия със статия
    //1. edit -> заменя съдържанието с ново

    public void edit(String newContent) {
        this.content = newContent;
    }

    //1. edit -> заменя автора с нов
    public void changeAuthor (String newAuthor) {
        this.author = newAuthor;
    }

    //1. edit -> заменя заглавието с ново
    public void rename(String newTitle) {
        this.title = newTitle;
    }

    public String getTitle() {
        return this.title;
    }

    public String getContent() {
        return this.content;
    }

    public String getAuthor() {
        return this.author;
    }
}
