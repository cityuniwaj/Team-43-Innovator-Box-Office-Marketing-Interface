package abstractClasses;

import interfaces.SeatingConfiguration;
import java.time.LocalDateTime;
import java.util.List;
import java.util.ArrayList;

/**
 * Abstract class representing a seating configuration for an event venue.
 * Implements SeatingConfiguration interface.
 */
public abstract class AbstractSeatingConfiguration implements SeatingConfiguration {

    // Unique identifier for the venue
    private String venueID;

    // Unique identifier for the event
    private int eventID;

    // Total number of seats in the venue
    private int totalSeats;

    // Number of available seats
    private int seatsAvailable;

    // Expiration time for held seats
    private LocalDateTime seatHoldExpiration;

    // Reserved seats information
    private String reservedSeats;

    // List of seats with restricted views
    private List<String> restrictedViewSeats;

    // List of wheelchair-accessible seats
    private List<String> wheelchairSeats;

    // Details of accessibility changes made
    private String accessibilityChanges;

    // Timestamp of the last update to seating configuration
    private LocalDateTime lastUpdated;

    // Unique identifier for the event room
    private String eventRoomIDInfo;

    // Seating configuration details
    private String seatingConfig;

    /**
     * Constructor for AbstractSeatingConfiguration.
     * Initializes lists and default values.
     *
     * @param venueID Unique identifier for the venue
     * @param eventID Unique identifier for the event
     * @param totalSeats Total number of seats in the venue
     */
    public AbstractSeatingConfiguration(String venueID, int eventID, int totalSeats) {
        this.venueID = venueID;
        this.eventID = eventID;
        this.totalSeats = totalSeats;
        this.seatsAvailable = totalSeats; // Default: all seats available
        this.restrictedViewSeats = new ArrayList<>();
        this.wheelchairSeats = new ArrayList<>();
        this.accessibilityChanges = "No accessibility changes";
        this.lastUpdated = LocalDateTime.now();
        this.seatingConfig = "";
    }

    /**
     * Gets the venue ID.
     * @return Venue ID as a string
     */
    public String getVenueID() {
        return venueID;
    }

    /**
     * Gets the event ID.
     * @return Event ID as an integer
     */
    public int getEventID() {
        return eventID;
    }

    /**
     * Gets the total number of seats in the venue.
     * @return Total seats count
     */
    public int getTotalSeats() {
        return totalSeats;
    }

    /**
     * Gets the number of available seats.
     * @return Available seats count
     */
    public int getSeatsAvailable() {
        return seatsAvailable;
    }

    /**
     * Gets the seat hold expiration time.
     * @return Expiration time as LocalDateTime
     */
    public LocalDateTime getSeatHoldExpiration() {
        return seatHoldExpiration;
    }

    /**
     * Gets the list of restricted view seats.
     * @return List of restricted view seats
     */
    public List<String> getRestrictedViewSeats() {
        return restrictedViewSeats;
    }

    /**
     * Gets the list of wheelchair-accessible seats.
     * @return List of wheelchair-accessible seats
     */
    public List<String> getWheelchairSeats() {
        return wheelchairSeats;
    }

    /**
     * Gets the accessibility changes made to the seating configuration.
     * @return Accessibility changes as a string
     */
    public String getAccessibilityChanges() {
        return accessibilityChanges;
    }

    /**
     * Gets the last updated timestamp of the seating configuration.
     * @return Last updated time as LocalDateTime
     */
    public LocalDateTime getLastUpdated() {
        return lastUpdated;
    }

    /**
     * Gets the event room ID information.
     * @return Event room ID as a string
     */
    public String getEventRoomIDInfo() {
        return eventRoomIDInfo;
    }

    /**
     * Gets the seating configuration details.
     * @return Seating configuration as a string
     */
    public String getSeatingConfig() {
        return seatingConfig;
    }
}

