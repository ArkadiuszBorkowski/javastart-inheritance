package wholesaler;

class MotoShop {
    public static void main(String[] args) {
        Tires tire = new Tires(123, "SuperTire", "ProContact", "Winter pro", 17, 225);
        tire.printInfo();

        ExhaustPart exhaustPart = new ExhaustPart(987, "Noisy Parts", "Turbo Brum", "Noisy Exhaust", true);
        exhaustPart.printInfo();
    }
}
