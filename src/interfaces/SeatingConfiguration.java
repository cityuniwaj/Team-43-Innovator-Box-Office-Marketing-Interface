package interfaces;

import java.time.LocalDateTime;
import java.util.List;

/**
 * Interface defining standard operations for managing seating configurations in a venue.
 * Provides methods to retrieve and manage seat availability, restricted seating,
 * wheelchair-accessible seating, and other accessibility features.
 */
public interface SeatingConfiguration {

    /**
     * Retrieves the total number of seats available in a venue.
     * @return Total seats count as an integer.
     */
    int getTotalSeats();

    /**
     * Retrieves the number of seats currently available for booking.
     * @return Available seats count as an integer.
     */
    int getSeatsAvailable();

    /**
     * Retrieves a list of seats that have a restricted view.
     * @return List of restricted view seats.
     */
    List<String> getRestrictedViewSeats();

    /**
     * Retrieves a list of wheelchair-accessible seats.
     * @return List of wheelchair-accessible seats.
     */
    List<String> getWheelchairSeats();

    /**
     * Retrieves any accessibility modifications made to the seating arrangement.
     * @return Accessibility changes as a string.
     */
    String getAccessibilityChanges();

    /**
     * Retrieves the last updated timestamp for the seating configuration.
     * @return Last updated time as LocalDateTime.
     */
    LocalDateTime getLastUpdated();

    /**
     * Retrieves the unique identifier for the venue.
     * @return Venue ID as a string.
     */
    String getVenueID();

    /**
     * Retrieves the unique identifier for the event.
     * @return Event ID as an integer.
     */
    int getEventID();

    /**
     * Retrieves seating configuration details.
     * @return Seating configuration as a string.
     */
    String getSeatingConfig();

    /**
     * Retrieves event room identifier information.
     * @return Event room ID as a string.
     */
    String getEventRoomIDInfo();
    
        /**
     * Retrieves the expiration time for a seat hold.
     * @return The expiration time as a LocalDateTime object.
     */
    LocalDateTime getSeatHoldExpiration();

    /**
     * Retrieves the reserved seats as a formatted string.
     * @return A string representing the reserved seats.
     */
    String getReservedSeats();
}