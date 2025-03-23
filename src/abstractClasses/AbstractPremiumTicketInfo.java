package abstractClasses;

import interfaces.PremiumTicketInfo;

import java.time.LocalDateTime;

/**
 * Abstract class that provides a base structure for premium ticket information.
 * Defines common properties for premium seating including reservation details.
 */
public abstract class AbstractPremiumTicketInfo implements PremiumTicketInfo {

    // Unique identifier for each premium seat.
    private String seatId;

    // Indicates whether a seat is premium.
    private boolean isPremium;

    // Specifies if the seat is exclusively held for FOL members.
    private boolean reservedForFOL;

    // Time by which unclaimed premium seats should be released.
    private LocalDateTime reservedDeadline;

    /**
     * Constructor for AbstractPremiumTicketInfo.
     *
     * @param seatId Unique identifier for each premium seat.
     * @param isPremium Indicates if the seat is premium.
     * @param reservedForFOL Specifies if the seat is reserved for FOL members.
     * @param reservedDeadline Deadline for releasing unclaimed premium seats.
     */
    public AbstractPremiumTicketInfo(String seatId, boolean isPremium,
                                     boolean reservedForFOL, LocalDateTime
                                             reservedDeadline) {
        this.seatId = seatId;
        this.isPremium = isPremium;
        this.reservedForFOL = reservedForFOL;
        this.reservedDeadline = reservedDeadline;
    }

    /**
     * Gets the seat ID.
     * @return Seat ID as a string.
     */
    @Override
    public String getSeatId() {
        return seatId;
    }

    /**
     * Checks if the seat is premium.
     * @return True if premium, otherwise false.
     */
    @Override
    public boolean isPremium() {
        return isPremium;
    }

    /**
     * Checks if the seat is reserved for FOL members.
     * @return True if reserved for FOL, otherwise false.
     */
    @Override
    public boolean isReservedForFOL() {
        return reservedForFOL;
    }

    /**
     * Gets the reservation deadline for unclaimed premium seats.
     * @return Reserved deadline as LocalDateTime.
     */
    @Override
    public LocalDateTime getReservedDeadline() {
        return reservedDeadline;
    }
}

