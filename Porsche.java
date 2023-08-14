public class Porsche extends Car{
    public Porsche(String model, String colour, double maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public String gas() {
        return "Porsche is accelerating.";
    }

    @Override
    public String brake() {
        return "Porsche is braking.";
    }
}
