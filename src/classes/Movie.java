package classes;

import classes.ChildrensPrice;
import classes.NewReleasePrice;
import classes.Price;
import classes.RegularPrice;

public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private Price price;

    public Movie(String newTitle, int newPrice) {
        title = newTitle;
       setPrice(newPrice);
    }

    int getFrequentRenterPoints(int daysRented) {
        return price.getFrequentRenterPoints(daysRented);
    }

    public void setPrice(int newPrice) {

        switch (newPrice) {
            case REGULAR:
                price = new RegularPrice();
                break;
            case CHILDRENS:
                price = new ChildrensPrice();
                break;
            case NEW_RELEASE:
                price = new NewReleasePrice();
                break;
            default:
                throw new IllegalArgumentException("Incorrect Price Code");
        }

    }

    public String getTitle (){
        return title;
    };


    public int getCharge(int daysRented) {
        return price.getCharge(daysRented);
    }


}