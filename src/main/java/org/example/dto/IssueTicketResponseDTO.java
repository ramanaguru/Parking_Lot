package org.example.dto;

import org.example.Models.Ticket;

public class IssueTicketResponseDTO {
    private Ticket ticket  ;    // step -1   go back to controller , do the changes...

    private ResponseStatus responseStatus;

    public Ticket getTicket() {
        return ticket;
    }

    public void setTicket(Ticket ticket) {
        this.ticket = ticket;
    }

    public ResponseStatus getResponseStatus() {
        return responseStatus;
    }

    public void setResponseStatus(ResponseStatus responseStatus) {
        this.responseStatus = responseStatus;
    }
}
