package interfaces;

import java.time.LocalDateTime;
import java.util.List;

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
    int getEventInfo(String EventID);

    /**
     * Retrieves event name based on event name identifier
     * @param EventNameID unique identifier for event name
     * @return returns event name information as CSV string
     */
    int getEventName(String EventNameID);

    /**
     * Retrieves ticket details for a specific ticket
     * @param TicketID unique identifier for each ticket
     * @return returns ticket identifier information as CSV string
     */
    int getTicketID(String TicketID);

    /**
     * Retrieves total number of tickets sold for a show
     * @param EventID unique identifier for each show
     * @return returns total ticket count as integer
     */
    int getTotalTicketsSold(String EventID);

    /**
     * Calculates and retrieves total revenue for a specific show
     * @param EventID unique identifier for each show
     * @return returns total revenue as double
     */
    double getTotalRevenue(String EventID);

    /**
     * Retrieves number of group bookings for a show
     * @param EventID unique identifier for each show
     * @return returns group booking count as integer
     */
    int getGroupBookings(String EventID);

    /**
     * Retrieves detailed ticket information
     * @param TicketID unique identifier for each ticket
     * @return returns detailed ticket information as CSV string
     */
    String getTicketInfo(String TicketID);

    /**
     * Retrieves last update timestamp for show information
     * @param EventID unique identifier for each show
     * @return returns last update timestamp as string
     */
    String getLastUpdated(String EventID);

    /**
     * Retrieves historical sales trends based on parameters.
     * Implementations should analyze the provided sales data and return meaningful trends.
     *
     * @param startDate Start date of the trend analysis.
     * @param endDate End date of the trend analysis.
     * @param analysisType Type of analysis (e.g., "revenue", "ticket_count").
     * @param frequency Frequency of the analysis (e.g., "daily", "monthly").
     * @return List of analyzed sales trends as strings.
     */
    List<String> getSalesTrends(LocalDateTime startDate, LocalDateTime endDate, String analysisType, String frequency);
}
