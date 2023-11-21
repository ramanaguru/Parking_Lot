package org.example.Models;

import java.util.List;

public class ParkingFloor {
    private Long floor_number;
    private List<ParkingSpot>parkingSpots;

    public Long getFloor_number() {
        return floor_number;
    }

    public void setFloor_number(Long floor_number) {
        this.floor_number = floor_number;
    }

    public List<ParkingSpot> getParkingSpots() {
        return parkingSpots;
    }

    public void setParkingSpots(List<ParkingSpot> parkingSpots) {
        this.parkingSpots = parkingSpots;
    }
}
