package interfaces;

import java.time.LocalDateTime;

/**
 * Interface defining standard operations for premium ticket management.
 * Provides methods to retrieve and manage premium seating information,
 * including reservation details and seat classifications.
 */
public interface PremiumTicketInfo {

    /**
     * Retrieves the unique identifier for a premium seat.
     * @return Seat ID as a string.
     */
    String getSeatId();

    /**
     * Checks if the seat is classified as premium.
     * @return True if the seat is premium, otherwise false.
     */
    boolean isPremium();

    /**
     * Checks if the seat is reserved for FOL members.
     * @return True if the seat is reserved for FOL members, otherwise false.
     */
    boolean isReservedForFOL();

    /**
     * Retrieves the deadline for unclaimed premium seat reservations.
     * @return Reserved deadline as LocalDateTime.
     */
    LocalDateTime getReservedDeadline();
}
