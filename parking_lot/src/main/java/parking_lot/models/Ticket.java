package parking_lot.models;

import java.util.Date;

import parking_lot.enums.TicketStatus;

public class Ticket {
    private String ticketNumber;
    private Date issuedAt;
    private Date payedAt;
    private double payedAmount;
    private TicketStatus status;

}
