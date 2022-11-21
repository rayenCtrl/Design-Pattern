public class TartePrunes extends Tarte {

    public void preparer() {
        System.out.println("Préparation de la tarte aux pommes");
    }
    //call cuire function from Tarte class
    public void cuire() {
        System.out.println("Cuisson de la tarte aux pommes");
    }
    //call emballer function from Tarte class
    public void emballer() {
        System.out.println("Emballage de la tarte aux pommes");
    }
}
