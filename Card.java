public class Card {
    private String numberCard;
    private String expiryDateCard;
    private int cvvCard;
    private int pinCodeCard;

    public Card(String numberCard, String expiryDateCard, int cvvCard, int pinCodeCard) {
        this.numberCard = numberCard;
        this.expiryDateCard = expiryDateCard;
        this.cvvCard = cvvCard;
        this.pinCodeCard = pinCodeCard;
    }

    public String getNumberCard() {
        return numberCard;
    }

    public String getExpiryDateCard() {
        return expiryDateCard;
    }

    public int getCvvCard() {
        return cvvCard;
    }

    public int getPinCodeCard() {
        return pinCodeCard;
    }

    public void printCardNumber() {
        String subString = this.numberCard.replace(" ", "").substring(12, 16);
        System.out.println("Ваша карта: **** **** **** " + subString);
    }

    public void checkPinCode(int pinCodeCard) {
        if (this.pinCodeCard == pinCodeCard) System.out.println("Ваша карта: " + this.numberCard);
        else System.out.println("Пин код не совпал!");
    }
}
