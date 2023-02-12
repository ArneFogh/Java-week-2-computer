public class main {
    public static void main(String[] args) {
        laptop laptop1 = new laptop("Apple", 16, 512,14.2);
        smartphone smartphone1 = new smartphone("Apple", 8, 256, "IOS");
        computer computer1 = new computer("HP", 32, 1000);

        computer1.powerOn();
        smartphone1.storageIsFull();
        laptop1.outOfBattery();

    }
}
