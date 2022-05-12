package classes;

class NewReleasePrice extends Price {
    int getPrice() {
        return Movie.NEW_RELEASE;
    }

    int getCharge(int daysRented){
        return daysRented * 3;
    }

    int getFrequentRenterPoints(int daysRented) {
        return (daysRented > 1) ? 2: 1;
    }
}
