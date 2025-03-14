package interfaces;

import java.time.LocalDateTime;

/**
 * Interface defining standard operations for ticket sales management.
 * Provides methods to retrieve and manage ticket sales information,
 * including event details, revenue tracking, and booking statistics.
 * Implementations should handle specific venue or event type requirements.
 */
public interface TicketSalesInfo {

    /**
     * Retrieves event information for a specific event ID
     * @param EventID unique identifier for each event
     * @return returns event information as CSV string
     */
    int GetEventInfo(String EventID);

    /**
     * Retrieves event name based on event name identifier
     * @param EventNameID unique identifier for event name
     * @return returns event name information as CSV string
     */
    int GetEventName(String EventNameID);

    /**
     * Retrieves ticket details for a specific ticket
     * @param TicketID unique identifier for each ticket
     * @return returns ticket identifier information as CSV string
     */
    int GetTicketID(String TicketID);

    /**
     * Retrieves show name information for a specific show
     * @param ShowID unique identifier for each show
     * @return returns show name as CSV string
     */
    String GetShowName(String ShowID);

    /**
     * Retrieves total number of tickets sold for a show
     * @param ShowID unique identifier for each show
     * @return returns total ticket count as integer
     */
    int GetTotalTicketsSold(String ShowID);

    /**
     * Calculates and retrieves total revenue for a specific show
     * @param ShowID unique identifier for each show
     * @return returns total revenue as double
     */
    double GetTotalRevenue(String ShowID);

    /**
     * Retrieves number of group bookings for a show
     * @param ShowID unique identifier for each show
     * @return returns group booking count as integer
     */
    int GetGroupBookings(String ShowID);

    /**
     * Retrieves detailed ticket information
     * @param TicketID unique identifier for each ticket
     * @return returns detailed ticket information as CSV string
     */
    String GetTicketInfo(String TicketID);

    /**
     * Retrieves last update timestamp for show information
     * @param ShowID unique identifier for each show
     * @return returns last update timestamp as string
     */
    String GetLastUpdated(String ShowID);
}
