package builder;
/*
Now, fix it in a way you can remove all the parameters from the constructor and still get the House
instance you need from a single method. You can create new classes, you can write getters and setters
 in the Home class, but you can’t access them directly from the main program

 */
public class Main {
    public static void main(String[] args) {
        Home myHome;

        //esto no esta bien porque pueden darse errores al cargar datos
        //myHome = new Home("white", "wood", 2, 3, "white", "wood", 1, 4, true, false, false, "metallic", "pink", "stone", 3, true);
        //la idea no es solucionarla con setters asi uno por uno:
        /*
        myHome.setBedroomColor("white");
         */
        //sino buscar una forma mas ordenada de solucionar este constructor
        //pero sin llegar a la solucion con setters uno por uno
        Bedroom bedroom1 = new Bedroom("white", "wood", 2,3);
        //myHome = new Home(bedroom1, "white", "wood", 1, 4, true, false, false, "metallic", "pink", "stone", 3, true);

        myHome = new Home();

        HomeBuilder builder = new HomeBuilder();
        builder.makeGarage();
        builder.makeBedroom(bedroom1);
        builder.makeLiving("white", "wood", 2);
        //we don't add a kitchen and a fireplace
        myHome = builder.getInstance();
        System.out.println(myHome);

        //si quiero un monoambiente
        Home studio = Director.getStudioApartment();
        System.out.println(studio);

    }

}
