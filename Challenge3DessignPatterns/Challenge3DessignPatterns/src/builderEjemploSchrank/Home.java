package builderEjemploSchrank;

public class Home {

    private String BedroomWallColor;
    private String BedroomFloorType;
    private int BedroomBedsNumber;
    private int BedroomWindowsNumber;
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

    public Home() {
    }

    public Home(String bedroomWallColor, String bedroomFloorType, int bedroomBedsNumber, int bedroomWindowsNumber, String kitchenWallColor, String kitchenFloorType, int kitchenWindowsNumber, int kitchenHobNumber, boolean hasGarage, boolean hasBackyard, boolean hasEnclosure, String roofType, String livingWallColor, String livingFloorType, int livingWindowsNumber, boolean hasFireplace) {
        BedroomWallColor = bedroomWallColor;
        BedroomFloorType = bedroomFloorType;
        BedroomBedsNumber = bedroomBedsNumber;
        BedroomWindowsNumber = bedroomWindowsNumber;
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

    public String getBedroomWallColor() {
        return BedroomWallColor;
    }

    public void setBedroomWallColor(String bedroomWallColor) {
        BedroomWallColor = bedroomWallColor;
    }

    public String getBedroomFloorType() {
        return BedroomFloorType;
    }

    public void setBedroomFloorType(String bedroomFloorType) {
        BedroomFloorType = bedroomFloorType;
    }

    public int getBedroomBedsNumber() {
        return BedroomBedsNumber;
    }

    public void setBedroomBedsNumber(int bedroomBedsNumber) {
        BedroomBedsNumber = bedroomBedsNumber;
    }

    public int getBedroomWindowsNumber() {
        return BedroomWindowsNumber;
    }

    public void setBedroomWindowsNumber(int bedroomWindowsNumber) {
        BedroomWindowsNumber = bedroomWindowsNumber;
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
                "BedroomWallColor='" + BedroomWallColor + '\'' +
                ", BedroomFloorType='" + BedroomFloorType + '\'' +
                ", BedroomBedsNumber=" + BedroomBedsNumber +
                ", BedroomWindowsNumber=" + BedroomWindowsNumber +
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
