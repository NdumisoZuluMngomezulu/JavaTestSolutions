public class Librarian extends User {

    public Librarian(String name) {
        super(name);
    }

    @Override
    public boolean borrow(Book book) {
        return super.borrow(book); // no limit
    }
}
