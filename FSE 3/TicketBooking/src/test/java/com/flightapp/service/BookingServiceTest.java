/*package com.flightapp.service;


import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.InjectMocks;
import org.mockito.Mockito;
import org.mockito.junit.jupiter.MockitoExtension;
import org.springframework.boot.test.mock.mockito.MockBean;
import org.springframework.test.context.junit.jupiter.SpringExtension;

import static org.junit.jupiter.api.Assertions.*;
@ExtendWith(MockitoExtension.class)
@ExtendWith(SpringExtension.class)
class BookingServiceTest {

    @MockBean
    private BookingRepository repository;

    @InjectMocks
    private BookingService service;

    @Test
    void testCancelTicket() {
        Mockito.doNothing().when(repository).deleteById("PNR001");
        try {
            String value = service.cancelTicket("PNR001");
            assertTrue(value.contains("Successfully cancelled"));
        } catch (TicketBookingException e) {
            throw new RuntimeException(e);
        }
    }
    @Test
    void testCancelTicketFail() {
        Mockito.doThrow(new RuntimeException()).when(repository).deleteById("PNR002");
        try {
            service.cancelTicket("PNR002");
            fail();
        } catch (TicketBookingException e) {
            assertTrue(e.getMessage().contains("No Booking found with pnr"));
//            System.out.println("Tested here");
        }
    }
}*/