public class Main {
    public static void getList (Book book[]) {

        for (int i = 0; i < book.length; i++) {
            if (book.length > 0 && book[i] != null) {
                System.out.println("Название: " + book[i].getBookName());
                System.out.println("Автор: " + book[i].getName() + " ");
                System.out.println("Год издат-ва: " + book[i].getPublishingYear());
                System.out.println();
            }
        }
        System.out.println("____________________________");
    }
    public static void addNew (Book book[], String name, int publishing, String authorName) {
        for (int i = 0; i < book.length; i++) {
            if (book[i] == null) {
                book [i] = new Book(name, publishing, authorName);
                break;
            }
        }
    }
    public static void main(String[] args) {
        System.out.println("Hello world!");
        Book [] booksList = new Book[8];

        booksList [0] = new Book("A Tale of Two Cities", 1859, "Charles Dickens");

        booksList [1] = new Book("The Little Prince", 1943, "Antoine de Saint-Exupéry");

        booksList [2] = new Book("Harry Potter and the Philosopher's Stone", 1997, "Joanne Rowling");

        booksList [3] = new Book("And Then There Were None", 1939, "Agatha Christie");

        booksList [4] = new Book("Dream of the Red Chamber", 1791, "Cao Xueqin");

        booksList [5] = new Book("The Hobbit", 1936, "John Tolkien");

        //System.out.println("Автор: " + j.getName() + " " + j.getSurname());
        getList(booksList);

        booksList[5].setPublishingYear(1937);

        getList(booksList);

        addNew(booksList, "The Da Vinci Code" , 2003, "Dan Brown");
        addNew(booksList, "Black Beauty" , 1877, "Anna Sewell");

        getList(booksList);
    }
}
