package org.example.Controllers;

import org.example.Models.Ticket;
import org.example.Services.TicketService;
import org.example.dto.IssueTicketRequestDTO;
import org.example.dto.IssueTicketResponseDTO;
import org.example.dto.ResponseStatus;

public class TicketController {
    /*
           what I have done after creating TicketController
           1) create a method called issue-ticket()
           2) Think what issueTicket should call .... it will have some parameters like vehicle, gate, entryTime...

            public issueTicket(Vehicle vehicle, Gate gate,....){


            }

           3) so  wrap the parameters in a wrap -->DTO's (Data Transfer Objects)
           4) after creating DTO --> 1. RequestDTO  2. ResponseDTO
           5) comeBack to the TicketController change the parameter

            public issueTicketRESPONSE_DTO issueTicket(issueTicketREQUEST_DTO){

                return null;    afterwards come and change return type ,because now it will show error
            }


     */
    public IssueTicketResponseDTO issueTicket (IssueTicketRequestDTO issueTicketRequestDTO){
        TicketService ticketService = null;



        IssueTicketResponseDTO response = new IssueTicketResponseDTO(); //issueTicketResponseDTO


        Ticket ticket;
        try {
            ticket = ticketService.issueTicket(
                    issueTicketRequestDTO.getVehicleType(),
                    issueTicketRequestDTO.getVehicleNumber(),
                    issueTicketRequestDTO.getGateId()
            );

        }
        catch(Exception ex){
                response.setResponseStatus(ResponseStatus.FAILURE);
                response.setFailureReason(ex.getMessage());
            return response;

        }


        response.setResponseStatus(ResponseStatus.SUCCESS);
        response.setTicket(ticket);
        return response;







    }


}
