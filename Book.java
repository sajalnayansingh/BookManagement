class Book {
    private int bookID;
    private String bookName;
    private String ISBN;

    public Book(int bookID, String bookName, String ISBN) {
        this.bookID = bookID;
        this.bookName = bookName;
        this.ISBN = ISBN;
    }

    public int getBookID() {
        return bookID;
    }

    public void setBookID(int bookID) {
        this.bookID = bookID;
    }

    public String getBookName() {
        return bookName;
    }

    public void setBookName(String bookName) {
        this.bookName = bookName;
    }

    public String getISBN() {
        return ISBN;
    }

    public void setISBN(String ISBN) {
        this.ISBN = ISBN;
    }
}
