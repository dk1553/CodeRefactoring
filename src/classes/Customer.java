package classes;

import java.lang.*;
import java.util.*;

public class Customer {
    private String name;
    private Vector rentals = new Vector();

    public Customer (String newName){
        name = newName;
    };

    public void addRental(Rental rental) {
        rentals.addElement(rental);
    };

    public String getName (){
        return name;
    };

    public String statement() {
        Enumeration enum_rentals = rentals.elements();	    
        String result = "Rental Record for " + this.getName() + "\n";
        result += "\t" + "Title" + "\t" + "\t" + "Days" + "\t" + "Amount" + "\n";
        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            //show figures for this rental
            result += "\t" + each.getMovie().getTitle()+ "\t" + "\t" + each.getDaysRented() + "\t" + String.valueOf(each.getCharge()) + "\n";
        }
        //add footer lines
        result += "Amount owed is " + String.valueOf(getTotalCharge()) + "\n";
        result += "You earned " + String.valueOf(getTotalFrequentRenterPoints()) + " frequent renter points";
        return result;
    }

   public int getTotalCharge() {
        int result = 0;
        Enumeration enum_rentals = rentals.elements();
       while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            result += each.getCharge();
        }
        return result;
    }

    private int getTotalFrequentRenterPoints(){
        int result = 0;
        Enumeration enum_rentals = rentals.elements();
        while (enum_rentals.hasMoreElements()) {
            Rental each = (Rental) enum_rentals.nextElement();
            result += each.getFrequentRenterPoints();
        }
        return result;
    }
}
    