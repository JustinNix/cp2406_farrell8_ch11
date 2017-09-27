/**
 * Created by jc428352 on 20/09/17.
 */
public abstract class Book {
    String title;
    double price;
    public Book(String t){
        title = t;
    }

    public String getTitle(){
        return title;
    }

    public double getPrice() {
        return price;
    }

    public abstract void setPrice();
}
