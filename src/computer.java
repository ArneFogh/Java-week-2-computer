public class computer {

    //Properties
    private String brandName;
    private int gbOfRam;
    private int storage;

    //Contructor
    public computer(String brandName, int gbOfRam, int storage){
        this.brandName = brandName;
        this.gbOfRam = gbOfRam;
        this.storage = storage;
    }

    public void openCalculator(){
        System.out.println("Opening the calculator");
    }

    public void powerOn(){
        System.out.println("The computer is powering on");
    }

    @Override
    public String toString() {
        return "computer{" +
                "brandName='" + brandName + '\'' +
                ", gbOfRam=" + gbOfRam +
                ", storage=" + storage +
                '}';
    }
}
