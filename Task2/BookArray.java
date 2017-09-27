public class BookArray {
    public static void main(String[] args) {
        Book[] books = new Book[10];

        for(int i = 0; i<5; i++){
            Fiction newBook = new Fiction("Fiction Book " + i);
            newBook.setPrice();
            books[i] = newBook;
        }
        for(int i = 5; i<10; i++){
            NonFiction newBook = new NonFiction("NonFiction Book " + i);
            newBook.setPrice();
            books[i] = newBook;
        }

        for(int i=0; i<books.length; i++){
            System.out.println(books[i].title + " " + books[i].price);
        }
    }
}
