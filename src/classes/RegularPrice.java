package classes;

class RegularPrice extends Price {
    int getPrice() {
        return Movie.REGULAR;
    }

    int getCharge(int daysRented){
       int result = 2;
        if (daysRented > 2)
            result += (daysRented - 2) * 2;
        return result;
    }
}