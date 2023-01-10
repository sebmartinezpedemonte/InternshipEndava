package builder;

public class Home {

    private Bedroom bedroom;
    private String KitchenWallColor;
    private String KitchenFloorType;
    private int KitchenWindowsNumber;
    private int KitchenHobNumber;
    private boolean HasGarage;
    private boolean HasBackyard;
    private boolean HasEnclosure;
    private String RoofType;
    private String LivingWallColor;
    private String LivingFloorType;
    private int LivingWindowsNumber;
    private boolean HasFireplace;

    public Home(Bedroom bedroom, String kitchenWallColor, String kitchenFloorType, int kitchenWindowsNumber, int kitchenHobNumber, boolean hasGarage, boolean hasBackyard, boolean hasEnclosure, String roofType, String livingWallColor, String livingFloorType, int livingWindowsNumber, boolean hasFireplace) {
        this.bedroom = bedroom;
        KitchenWallColor = kitchenWallColor;
        KitchenFloorType = kitchenFloorType;
        KitchenWindowsNumber = kitchenWindowsNumber;
        KitchenHobNumber = kitchenHobNumber;
        HasGarage = hasGarage;
        HasBackyard = hasBackyard;
        HasEnclosure = hasEnclosure;
        RoofType = roofType;
        LivingWallColor = livingWallColor;
        LivingFloorType = livingFloorType;
        LivingWindowsNumber = livingWindowsNumber;
        HasFireplace = hasFireplace;
    }

    public Home() {
        this.HasGarage = true;
    }
/* queremos evitar esto
    public Home(String bedroomWallColor, String bedroomFloorType, int bedroomWindowsNumber, int bedroomBedsNumber, String kitchenWallColor, String kitchenFloorType, int kitchenWindowsNumber, int kitchenHobNumber, boolean hasGarage, boolean hasBackyard, boolean hasEnclosure, String roofType, String livingWallColor, String livingFloorType, int livingWindowsNumber, boolean hasFireplace) {
        BedroomWallColor = bedroomWallColor;
        BedroomFloorType = bedroomFloorType;
        BedroomWindowsNumber = bedroomWindowsNumber;
        BedroomBedsNumber = bedroomBedsNumber;
        KitchenWallColor = kitchenWallColor;
        KitchenFloorType = kitchenFloorType;
        KitchenWindowsNumber = kitchenWindowsNumber;
        KitchenHobNumber = kitchenHobNumber;
        HasGarage = hasGarage;
        HasBackyard = hasBackyard;
        HasEnclosure = hasEnclosure;
        RoofType = roofType;
        LivingWallColor = livingWallColor;
        LivingFloorType = livingFloorType;
        LivingWindowsNumber = livingWindowsNumber;
        HasFireplace = hasFireplace;
    }
*/

    public Bedroom getBedroom() {
        return bedroom;
    }

    public void setBedroom(Bedroom bedroom) {
        this.bedroom = bedroom;
    }

    public String getKitchenWallColor() {
        return KitchenWallColor;
    }

    public void setKitchenWallColor(String kitchenWallColor) {
        KitchenWallColor = kitchenWallColor;
    }

    public String getKitchenFloorType() {
        return KitchenFloorType;
    }

    public void setKitchenFloorType(String kitchenFloorType) {
        KitchenFloorType = kitchenFloorType;
    }

    public int getKitchenWindowsNumber() {
        return KitchenWindowsNumber;
    }

    public void setKitchenWindowsNumber(int kitchenWindowsNumber) {
        KitchenWindowsNumber = kitchenWindowsNumber;
    }

    public int getKitchenHobNumber() {
        return KitchenHobNumber;
    }

    public void setKitchenHobNumber(int kitchenHobNumber) {
        KitchenHobNumber = kitchenHobNumber;
    }

    public boolean isHasGarage() {
        return HasGarage;
    }

    public void setHasGarage(boolean hasGarage) {
        HasGarage = hasGarage;
    }

    public boolean isHasBackyard() {
        return HasBackyard;
    }

    public void setHasBackyard(boolean hasBackyard) {
        HasBackyard = hasBackyard;
    }

    public boolean isHasEnclosure() {
        return HasEnclosure;
    }

    public void setHasEnclosure(boolean hasEnclosure) {
        HasEnclosure = hasEnclosure;
    }

    public String getRoofType() {
        return RoofType;
    }

    public void setRoofType(String roofType) {
        RoofType = roofType;
    }

    public String getLivingWallColor() {
        return LivingWallColor;
    }

    public void setLivingWallColor(String livingWallColor) {
        LivingWallColor = livingWallColor;
    }

    public String getLivingFloorType() {
        return LivingFloorType;
    }

    public void setLivingFloorType(String livingFloorType) {
        LivingFloorType = livingFloorType;
    }

    public int getLivingWindowsNumber() {
        return LivingWindowsNumber;
    }

    public void setLivingWindowsNumber(int livingWindowsNumber) {
        LivingWindowsNumber = livingWindowsNumber;
    }

    public boolean isHasFireplace() {
        return HasFireplace;
    }

    public void setHasFireplace(boolean hasFireplace) {
        HasFireplace = hasFireplace;
    }

    @Override
    public String toString() {
        return "Home{" +
                "bedroom=" + bedroom +
                ", KitchenWallColor='" + KitchenWallColor + '\'' +
                ", KitchenFloorType='" + KitchenFloorType + '\'' +
                ", KitchenWindowsNumber=" + KitchenWindowsNumber +
                ", KitchenHobNumber=" + KitchenHobNumber +
                ", HasGarage=" + HasGarage +
                ", HasBackyard=" + HasBackyard +
                ", HasEnclosure=" + HasEnclosure +
                ", RoofType='" + RoofType + '\'' +
                ", LivingWallColor='" + LivingWallColor + '\'' +
                ", LivingFloorType='" + LivingFloorType + '\'' +
                ", LivingWindowsNumber=" + LivingWindowsNumber +
                ", HasFireplace=" + HasFireplace +
                '}';
    }
}
