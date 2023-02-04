package exercise;


import classes.*;

public class House {

    public static int indexRest = 0;
    public static int indexBed = 0;

    public static final int MAX_REST = 10;
    public static final int MAX_BED = 10;

    private Kitchen kitchen;
    private DiningRoom diningRoom;
    private LivingRoom livingRoom;

    private RestRoom []restRooms = new RestRoom[MAX_REST];
    private BedRoom []bedRooms = new BedRoom[MAX_BED];
    private Yard yard;

    public void addRoom(BedRoom bedRoom) {
        if (indexBed < MAX_BED) {
            indexBed++;
            bedRooms[indexBed] = bedRoom;
        }
    }

    public void addRoom(RestRoom restRoom) {
        if (indexRest < MAX_REST) {
            indexRest++;
            restRooms[indexRest] = restRoom;
        }
    }

    public Kitchen getKitchen() {
        return kitchen;
    }

    public void setKitchen(Kitchen kitchen) {
        this.kitchen = kitchen;
    }

    public DiningRoom getDiningRoom() {
        return diningRoom;
    }

    public void setDiningRoom(DiningRoom diningRoom) {
        this.diningRoom = diningRoom;
    }

    public LivingRoom getLivingRoom() {
        return livingRoom;
    }

    public void setLivingRoom(LivingRoom livingRoom) {
        this.livingRoom = livingRoom;
    }

    public RestRoom[] getRestRooms() {
        return restRooms;
    }

    public void setRestRooms(RestRoom[] restRooms) {
        this.restRooms = restRooms;
    }

    public BedRoom[] getBedRooms() {
        return bedRooms;
    }

    public void setBedRooms(BedRoom[] bedRooms) {
        this.bedRooms = bedRooms;
    }

    public Yard getYard() {
        return yard;
    }

    public void setYard(Yard yard) {
        this.yard = yard;
    }
}
