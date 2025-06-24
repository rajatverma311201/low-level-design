package parking_lot.models.parking_spots;

import parking_lot.enums.ParkingSpotType;

public class CompactSpot extends ParkingSpot {
    private final ParkingSpotType type = ParkingSpotType.COMPACT;

    public ParkingSpotType getType() {
        return type;
    }
}
