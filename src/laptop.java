public class laptop extends computer{
    private double screenSize;

    public laptop(String brandName, int gbOfRam, int storage, double screenSize) {
        super(brandName, gbOfRam, storage);
        this.screenSize = screenSize;
    }

    public void outOfBattery(){
        System.out.println("The laptop is out of battery");
    }

    @Override
    public String toString() {
        return "laptop{" +
                "screenSize=" + screenSize +
                '}';
    }
}
