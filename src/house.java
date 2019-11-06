public class house {
    private String address;
    private int size;
    private int price;
    private int rooms;

    public house(String address, int size, int price, int rooms) {
        this.address = address;
        this.size = size;
        this.price = price;
        this.rooms = rooms;
    }

    public house() {
        this.address = "no address";
        this.size = 0;
        this.price = 0;
        this.rooms = 0;
    }

    public String getAddress() {
        return address;
    }

    public void setAddress(String address) {
        this.address = address;
    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public int getRooms() {
        return rooms;
    }

    public void setRooms(int rooms) {
        this.rooms = rooms;
    }
}
