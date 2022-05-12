public class Movie {

    public static final int CHILDRENS = 2;
    public static final int REGULAR = 0;
    public static final int NEW_RELEASE = 1;
    private String title;
    private int price;

    public Movie(String newTitle, int newPrice) {
        title = newTitle;
        price = newPrice;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int newPrice) {
        price = newPrice;
    }

    public String getTitle (){
        return title;
    };
}