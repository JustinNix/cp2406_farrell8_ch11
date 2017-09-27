/**
 * Created by jc428352 on 20/09/17.
 */
public class NonFiction extends Book {


    public NonFiction(String t) {
        super(t);
    }

    @Override
    public void setPrice() {
        price = 37.99;
    }
}
