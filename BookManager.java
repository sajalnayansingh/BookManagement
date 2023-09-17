import java.util.HashMap;
import java.util.Map;

class BookManager {
    private Map<Integer, Book> bookMap;

    public BookManager() {
        bookMap = new HashMap<>();
    }

    public void addBook(Book book) {
        bookMap.put(book.getBookID(), book);
    }

    public Book getBookById(int bookID) {
        return bookMap.get(bookID);
    }

    public void updateBook(Book updatedBook) {
        if (bookMap.containsKey(updatedBook.getBookID())) {
            bookMap.put(updatedBook.getBookID(), updatedBook);
        } else {
            System.out.println("Book not found.");
        }
    }

    public void deleteBook(int bookID) {
        if (bookMap.containsKey(bookID)) {
            bookMap.remove(bookID);
        } else {
            System.out.println("Book not found.");
        }
    }
}

