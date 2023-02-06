package object;

public class Book {

    private String title;
    private int publishingYear;
    private Autor autor;

    public Book(String title, int publishingYear, Autor autor) {
        this.title = title;
        this.publishingYear = publishingYear;
        this.autor = autor;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public int getPublishingYear() {
        return publishingYear;
    }

    public void setPublishingYear(int publishingYear) {
        this.publishingYear = publishingYear;
    }

    public Autor getAutor() {
        return autor;
    }

    public void setAutor(Autor autor) {
        this.autor = autor;
    }

    public void printInfo() {
        System.out.println("Название книги: " + getTitle() + ", год издания: " + getPublishingYear() + ", автор: " + getAutor().getName() + " " + getAutor().getSurname());

}
}