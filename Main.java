public class Main {
    public static void main(String[] args) {

        Tesla tesla = new Tesla("Tesla S", "White", 250.0);
        Porsche porsche = new Porsche("Porsche", "Red", 300.0);
        System.out.println("----------------------------------------");
        System.out.println("Tesla Details:");
        System.out.println("----------------------------------------");
        System.out.println("Model: " + tesla.getModel());
        System.out.println("Colour: " + tesla.getColour());
        System.out.println("Max Speed: " + tesla.getMaxSpeed());
        System.out.println("Gas: " + tesla.gas());
        System.out.println("Brake: " + tesla.brake());

        System.out.println("----------------------------------------");
        System.out.println("Porsche Details:");
        System.out.println("----------------------------------------");
        System.out.println("Model: " + porsche.getModel());
        System.out.println("Colour: " + porsche.getColour());
        System.out.println("Max Speed: " + porsche.getMaxSpeed());
        System.out.println("Gas: " + porsche.gas());
        System.out.println("Brake: " + porsche.brake());

    }
}
