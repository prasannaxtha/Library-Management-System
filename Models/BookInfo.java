package Models;

public class BookInfo {
    private String bookTitle;
    private String bookAuthor;
    private String bookInformation;
    private float bookPrice;
    private int bookQuantity;
    private boolean isBookInStock;
    private BookGenre bookGenre;

    public String getBookTitle() {
        return bookTitle;
    }

    public void setBookTitle(String bookTitle) {
        this.bookTitle = bookTitle;
    }

    public String getBookAuthor() {
        return bookAuthor;
    }

    public void setBookAuthor(String bookAuthor) {
        this.bookAuthor = bookAuthor;
    }

    public String getBookInformation() {
        return bookInformation;
    }

    public void setBookInformation(String bookInformation) {
        this.bookInformation = bookInformation;
    }

    public float getBookPrice() {
        return bookPrice;
    }

    public void setBookPrice(float bookPrice) {
        this.bookPrice = bookPrice;
    }

    public int getBookQuantity() {
        return bookQuantity;
    }

    public void setBookQuantity(int bookQuantity) {
        this.bookQuantity = bookQuantity;
    }

    public boolean isBookInStock() {
        return isBookInStock;
    }

    public void setBookInStock(boolean bookInStock) {
        isBookInStock = bookInStock;
    }

    public BookGenre getBookGenre() {
        return bookGenre;
    }

    public void setBookGenre(BookGenre bookGenre) {
        this.bookGenre = bookGenre;
    }

    public BookInfo(String bookTitle, String bookAuthor, String bookInformation, float bookPrice, int bookQuantity, boolean isBookInStock, BookGenre bookGenre) {
        this.bookTitle = bookTitle;
        this.bookAuthor = bookAuthor;
        this.bookInformation = bookInformation;
        this.bookPrice = bookPrice;
        this.bookQuantity = bookQuantity;
        this.isBookInStock = isBookInStock;
        this.bookGenre = bookGenre;


    }
}
