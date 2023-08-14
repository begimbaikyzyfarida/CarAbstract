public class Tesla extends Car{
    public Tesla(String model, String colour, double maxSpeed) {
        super(model, colour, maxSpeed);
    }

    @Override
    public String gas() {
        return "Tesla is accelerating.";
    }

    @Override
    public String brake() {
        return "Tesla is braking.";
    }

}
