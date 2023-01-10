package builderEjemploSchrank;

/*
Now, fix it in a way you can remove all the parameters from the constructor and still get the House
instance you need from a single method. You can create new classes, you can write getters and setters
 in the Home class, but you can’t access them directly from the main program

 */
public class Main {
    public static void main(String[] args) {

        HomeBuilder homeBuilder = new HomeBuilder();
        homeBuilder.makeWindows(1,2,3)
                .makeFloor("wood", "ceramics", "woood")
                .paintHome("blue", "white", "pink");

        System.out.println(homeBuilder);

    }

}
