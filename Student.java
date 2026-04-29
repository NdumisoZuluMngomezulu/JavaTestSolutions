public class Student extends User {
    private static final int LIMIT = 3;

    public Student(String name) {
        super(name);
    }

    @Override
    public boolean borrow(Book book) {
        if (borrowedBooks.size() >= LIMIT) {
            return false;
        }
        return super.borrow(book);
    }
}
