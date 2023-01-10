package builder;

public class HomeBuilder {

    private Home instance;

    public HomeBuilder() {
        reset();
    }

    public void reset(){
        this.instance = new Home();
    }

    public Home getInstance(){
        return this.instance;
    }

    public void makeGarage(){
        this.instance.setHasGarage(true);
    }

    public void makeBedroom(Bedroom bedroom) {
        this.instance.setBedroom(bedroom);
    }

    public void makeLiving(String wall, String floor, int windows){
        this.instance.setLivingFloorType(floor);
        this.instance.setLivingWallColor(wall);
        this.instance.setLivingWindowsNumber(windows);
    }

    public void makeKitchen(String wall, String floor, int windows, int hobs){
        this.getInstance().setKitchenFloorType(floor);
        this.getInstance().setKitchenHobNumber(hobs);
        this.getInstance().setKitchenWallColor(wall);
        this.getInstance().setKitchenWindowsNumber(windows);
    }

    public void makeFireplace(boolean fireplace){
        this.getInstance().setHasFireplace(fireplace);
    }

    @Override
    public String toString() {
        return "HomeBuilder{" +
                "instance=" + instance +
                '}';
    }
}
