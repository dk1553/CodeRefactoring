package classes;

class ChildrensPrice extends Price {
    int getPrice() {
        return Movie.CHILDRENS;
    }

    int getCharge(int daysRented){
        int result = 1;
        if (daysRented > 3)
            result += (daysRented - 3);
        return result;
    }

}