## Requirements
- Display all events based on the selected city.
- A Movie Cinema can have multiple screens
- A screen will display only one movie at a time
- A movie can be played many times in a day
- On selecting a movie, system should display the cinema running that movie
- User should be able to select the cinema and book the movie
- System should be able to redirect the user to sitting arrangement, and use should be able to select the seats
- System should be able to handle the concurrent booking and ensure seat availability is updated in real time
- User should be able to complete the payment and receive the tickets.
- System should allow the admins to add, update, and delete movies, shows and seating arrangements

## Assumptions
- A seat will be booked by only one user
- A user can cancel the booking 
- Seats should be distinguishable from booked and vacant

## Entities
- User (Customer/Admin/Frontdesk officer) - for the sake of simplicity we will take only User in our class
- City
- Cinema/Theater
- Screen
- MovieShow
- Seat
- SeatType
- Booking
- BookingStatus
- Ticket
- Payement
- MovieTicketBookingSystem - main class which will handle everything. It will use singleton pattern to ensure that only one instance of this class exists. This also provided methods to adding movies, theaters, and shows. Also for booking a ticket etc.


