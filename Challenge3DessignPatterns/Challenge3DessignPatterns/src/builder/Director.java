package builder;

public class Director {
    public static Home getStudioApartment(){
        HomeBuilder builder = new HomeBuilder();
        builder.makeBedroom(new Bedroom("white", "wood", 2,3));
        return builder.getInstance();
    }

    public static Home getTwoRoomApartment(String colorWallLiving){
        HomeBuilder builder = new HomeBuilder();
        builder.makeBedroom(new Bedroom("white", "wood", 2,3));
        builder.makeLiving(colorWallLiving, "wood", 2);
        return builder.getInstance();
    }

}
