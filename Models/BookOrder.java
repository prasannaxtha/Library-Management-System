package Models;

public class BookOrder {
    private BookInfo book;
    private int quantity;

    public BookInfo getBook() {
        return book;
    }

    public void setBook(BookInfo book) {
        this.book = book;
    }

    public int getQuantity() {
        return quantity;
    }

    public void setQuantity(int quantity) {
        this.quantity = quantity;
    }

    public BookOrder(BookInfo book, int quantity) {
        this.book = book;
        this.quantity = quantity;


    }
}
