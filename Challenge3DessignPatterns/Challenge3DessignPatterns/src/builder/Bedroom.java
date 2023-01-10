package builder;

public class Bedroom {
    private String WallColor;
    private String FloorType;
    private int Beds;
    private int Windows;

    public Bedroom(String wallColor, String floorType, int beds, int windows) {
        WallColor = wallColor;
        FloorType = floorType;
        Beds = beds;
        Windows = windows;
    }

    @Override
    public String toString() {
        return "Bedroom{" +
                "WallColor='" + WallColor + '\'' +
                ", FloorType='" + FloorType + '\'' +
                ", Beds=" + Beds +
                ", Windows=" + Windows +
                '}';
    }
}
