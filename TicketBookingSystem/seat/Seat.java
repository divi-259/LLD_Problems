package TicketBookingSystem.seat;

public class Seat {

    private final String id;
    private final int row;
    private final int column;
    private final SeatType type;
    private SeatStatus status;
    private final Double price;

    public Seat(String id, int row, int column, SeatType type, double price, SeatStatus status) {
        this.id = id;
        this.row = row;
        this.column = column;
        this.type = type;
        this.price = price;
        this.status = status;
    }
    
    public void setStatus(SeatStatus status) {
        this.status = status;
    }

    public String getId() {
        return id;
    }
    public int getRow() {
        return row;
    }
    public int getCol() {
        return column;
    }
    public Double getPrice() {
        return price;
    }
    public SeatType getType() {
        return type;
    }
    public SeatStatus getStatus() {
        return status;
    }

}