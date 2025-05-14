public class MyProgram {
    public static void main(String[] args) {

        // Task 1
        Card card1 = new Card("1111 2222 3333 4444", "25.12.2025", 123, 4567);
        card1.printCardNumber();
        card1.checkPinCode(5123);
        card1.checkPinCode(4567);
        System.out.println("Данные вашей карты: " + "\n" +
                "\tНомер карты: " + card1.getNumberCard() + "\n" +
                "\tСрок действия карты: " + card1.getExpiryDateCard() + "\n" +
                "\tCVV карты: " + card1.getCvvCard() + "\n" +
                "\tПин код карты: " + card1.getPinCodeCard() + "\n");

        // Task 2
        Car car1 = new Car("White", 2_157_299.99);
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());
        car1.speedUp(25);
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());
        car1.breakSpeed();
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());
        car1.breakSpeed();
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());
        car1.breakSpeed();
        System.out.println("Текущая скорость: " + car1.getCurrentSpeed());

    }
}
