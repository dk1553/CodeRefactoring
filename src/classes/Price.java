package classes;

abstract class Price {
    abstract int getPrice();

    abstract int getCharge(int daysRented);

    int getFrequentRenterPoints(int daysRented){
        return 1;
    }
}
