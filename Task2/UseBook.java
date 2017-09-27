public class UseBook {
    public static void main(String[] args) {
        Fiction fictionBook = new Fiction("Fiction book title");
        NonFiction nonFictionBook = new NonFiction("Non fiction book title");

        fictionBook.setPrice();
        nonFictionBook.setPrice();

        System.out.println(fictionBook.getTitle() + " " + fictionBook.getPrice());
        System.out.println(nonFictionBook.getTitle() + " " + nonFictionBook.getPrice());
    }
}
