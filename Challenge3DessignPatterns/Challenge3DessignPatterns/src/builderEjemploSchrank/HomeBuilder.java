package builderEjemploSchrank;

public class HomeBuilder {

    private Home instance;

    public Home getHome(String bedroomWallColor, String bedroomFloorType, int bedroomBedsNumber, int bedroomWindowsNumber, String kitchenWallColor, String kitchenFloorType, int kitchenWindowsNumber, int kitchenHobNumber, boolean hasGarage, boolean hasBackyard, boolean hasEnclosure, String roofType, String livingWallColor, String livingFloorType, int livingWindowsNumber, boolean hasFireplace){
        Home product = new Home(bedroomWallColor, bedroomFloorType, bedroomBedsNumber, bedroomWindowsNumber, kitchenWallColor, kitchenFloorType, kitchenWindowsNumber, kitchenHobNumber, hasGarage, hasBackyard,  hasEnclosure, roofType, livingWallColor, livingFloorType, livingWindowsNumber,  hasFireplace);

        return product;
    }



    public HomeBuilder() {
        reset();
    }

    public HomeBuilder reset(){
        this.instance = new Home();
        return this;
    }

    public Home getInstance(){
        return this.instance;
    }

    public HomeBuilder paintHome(String colorBedroom, String colorKitchen, String colorLiving){
        this.getInstance().setBedroomWallColor(colorBedroom);
        this.getInstance().setKitchenWallColor(colorKitchen);
        this.getInstance().setLivingWallColor(colorLiving);
        return this;
    }

    public HomeBuilder makeFloor(String floorBedroom, String floorKitchen, String floorLiving){
        this.getInstance().setBedroomFloorType(floorBedroom);
        this.getInstance().setKitchenFloorType(floorKitchen);
        this.getInstance().setLivingFloorType(floorLiving);
        return this;
    }

    public HomeBuilder makeRoof(String roofType){
        this.getInstance().setRoofType(roofType);
        return this;
    }

    public HomeBuilder makeWindows(int bedroom, int kitchen, int living){
        this.getInstance().setBedroomWindowsNumber(bedroom);
        this.getInstance().setKitchenWindowsNumber(kitchen);
        this.getInstance().setLivingWindowsNumber(living);
        return this;
    }

    public HomeBuilder buyBeds(int beds){
        this.getInstance().setBedroomBedsNumber(beds);
        return this;
    }

    public HomeBuilder buyHobs(int hobs){
        this.getInstance().setKitchenHobNumber(hobs);
        return this;
    }

    public HomeBuilder makeGarage(boolean garage){
        this.getInstance().setHasGarage(garage);
        return this;
    }


    public HomeBuilder makeGarage(){
        this.instance.setHasGarage(true);
        return this;
    }

    public HomeBuilder makeFireplace(boolean fireplace){
        this.getInstance().setHasFireplace(fireplace);
        return this;
    }

    @Override
    public String toString() {
        return "HomeBuilder{" +
                "instance=" + instance +
                '}';
    }
}
