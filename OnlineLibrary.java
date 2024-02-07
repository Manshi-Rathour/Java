class Library{
    String [] books;
    int no_of_books;

    Library(){
        this.books = new String[100];
        this.no_of_books = 0;
    }

    void addBook(String b){
        this.books[no_of_books] = b;
        no_of_books++;
        System.out.println(b + " has been added!");
    }

    void showAvailableBooks(){
        System.out.println("Available books are: ");
        for(String b : this.books){
            if (b == null){
                continue;
            }
            System.out.println("* " + b);
        }
    }

    void issueBook(String b){
        for(int i =0; i<this.books.length; i++){
            if (this.books[i].equals(b)){
                System.out.println(b + "-> This book has been issued!");
                this.books[i] = null;
                return;
            }
        }
        System.out.println("This book does not exist");
    }

    void returnBook(String b){
        addBook(b);
    }
}

public class OnlineLibrary {
    public static void main(String[] args) {
        Library centralLib = new Library();
        centralLib.addBook("Java");
        centralLib.addBook("Data Science");
        centralLib.addBook("Machine Learning");
        centralLib.addBook("AI");
        centralLib.showAvailableBooks();

        centralLib.issueBook("Java");
        centralLib.showAvailableBooks();

        centralLib.returnBook("C++");
        centralLib.showAvailableBooks();
    }
}
