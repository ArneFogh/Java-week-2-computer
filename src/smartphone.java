public class smartphone extends computer{

    private String operationSystem;

    public smartphone(String brandName, int gbOfRam, int storage, String operationSystem) {
        super(brandName, gbOfRam, storage);
        this.operationSystem = operationSystem;

    }

    public void storageIsFull(){
        System.out.println("The smartphone is out of storage");
    }

    @Override
    public String toString() {
        return "smartphone{" +
                "operationSystem='" + operationSystem + '\'' +
                '}';
    }
}
