public class LibraryManagementSystem {
    public static void main(String[] args) {
        Library library = new Library();

        Book book1 = new Book("Java Бағдарламалау", "Ержан Құдайберген", "123456");
        Book book2 = new Book("Деректер Құрылымдары", "Айжан Сейтқұл", "654321");

        library.addBook(book1);
        library.addBook(book2);

        LibraryMember member1 = new LibraryMember("Alice", 1);
        LibraryMember member2 = new LibraryMember("Bob", 2);

        library.addMember(member1);
        library.addMember(member2);

        library.displayBooks();
    }
}
