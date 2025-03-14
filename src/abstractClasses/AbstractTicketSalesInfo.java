package abstractClasses;

import interfaces.TicketSalesInfo;

import java.time.LocalDateTime;

/**
 * Abstract class that implements TicketSalesInfo interface to handle ticket sales data.
 * Provides base implementation for managing event tickets, sales tracking, and booking information.
 * Specific venue implementations should extend this class to provide venue-specific functionality.
 */

public abstract class AbstractTicketSalesInfo implements TicketSalesInfo {
    // Unique identifier for the event
    private int eventID;

    // Name identifier for the event stored as integer code
    private int eventName;

    // Unique identifier for individual tickets
    private int ticketID;

    // Display name of the show/event
    private String showName;

    // Counter for total number of tickets sold
    private int totalTicketsSold;

    // Total revenue from all ticket sales
    private double totalRevenue;

    // Number of group booking transactions
    private int groupBookings;

    // Stores ticket information in CSV format
    private String TicketInfo;

    // Timestamp of last modification in string format
    private String lastUpdated;

    /**
     * Constructor to initialize ticket sales information.
     *
     * @param eventID         Unique identifier for the event.
     * @param eventName       Name identifier for the event.
     * @param ticketID        Unique identifier for individual tickets.
     * @param showName        Display name of the show/event.
     * @param totalTicketsSold Total number of tickets sold.
     * @param totalRevenue    Total revenue from ticket sales.
     * @param groupBookings   Number of group bookings.
     * @param TicketInfo      Ticket information in CSV format.
     * @param lastUpdated     Last update timestamp.
     */
    public AbstractTicketSalesInfo(int eventID, int eventName, int ticketID,
                                   String showName, int totalTicketsSold, double totalRevenue,
                                   int groupBookings, String TicketInfo, String lastUpdated) {
        this.eventID = eventID;
        this.eventName = eventName;
        this.ticketID = ticketID;
        this.showName = showName;
        this.totalTicketsSold = totalTicketsSold;
        this.totalRevenue = totalRevenue;
        this.groupBookings = groupBookings;
        this.TicketInfo = TicketInfo;
        this.lastUpdated = lastUpdated;
    }



    /**
     * this will retrieve ticket information for a specific event when given its ID as a CSV
     * @param EventID this is a unique identifier for each event
     * @return this returns the event information as a csv string
     */
    @Override
    public int GetEventInfo(String EventID) {
        return eventID;
    }

    /**
     * this will retrieve the event name information when given its ID as a CSV
     * @param EventNameID this is a unique identifier for each event name
     * @return this returns the event name information as a csv string
     */
    @Override
    public int GetEventName(String EventNameID) {
        return eventName;
    }

    /**
     * this will retrieve all ticket information when given a ticket ID as a CSV
     * @param TicketID this is a unique identifier for each ticket
     * @return this returns the ticket information as a csv string
     */
    @Override
    public int GetTicketID(String TicketID) {
        return ticketID;
    }

    /**
     * this will retrieve show information when given a show ID as a CSV
     * @param ShowID this is a unique identifier for each show
     * @return this returns the show name information as a csv string
     */
    @Override
    public String GetShowName(String ShowID) {
        return showName;
    }

    /**
     * this will retrieve the total tickets sold for a show when given its ID as a CSV
     * @param ShowID this is a unique identifier for each show
     * @return this returns the total tickets sold as a csv string
     */
    @Override
    public int GetTotalTicketsSold(String ShowID) {
        return totalTicketsSold;
    }

    /**
     * this will retrieve the total revenue for a show when given its ID as a CSV
     * @param ShowID this is a unique identifier for each show
     * @return this returns the total revenue as a csv string
     */
    @Override
    public double GetTotalRevenue(String ShowID) {
        return totalRevenue;
    }

    /**
     * this will retrieve the number of group bookings for a show when given its ID as a CSV
     * @param ShowID this is a unique identifier for each show
     * @return this returns the number of group bookings as a csv string
     */
    @Override
    public int GetGroupBookings(String ShowID) {
        return groupBookings;
    }

    /**
     * this will retrieve detailed ticket information when given a ticket ID as a CSV
     * @param TicketID this is a unique identifier for each ticket
     * @return this returns detailed ticket information as a csv string
     */
    @Override
    public String GetTicketInfo(String TicketID) {
        return TicketInfo;
    }

    /**
     * this will retrieve the last update timestamp for a show when given its ID as a CSV
     * @param ShowID this is a unique identifier for each show
     * @return this returns the last update timestamp as a csv string
     */
    @Override
    public String GetLastUpdated(String ShowID) {
        return lastUpdated;
    }


}
