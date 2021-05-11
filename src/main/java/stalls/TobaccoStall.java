package stalls;

import behaviours.IReviewed;
import people.Visitor;

public class TobaccoStall extends Stall implements IReviewed {

    public TobaccoStall(String name, String ownerName, ParkingSpot parkingSpot) {
        super(name, ownerName, parkingSpot);
    }

    public boolean isAllowedTo(Visitor visitor){
        if (visitor.getAge() >= 18) {
            return true;
        }
        return false;
    }

    public int getRating() {
        return 0;
    }
}
