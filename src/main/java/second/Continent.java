package second;

public enum Continent {
    AFRYKA(30.4),
    AMERYKA_POŁUDNIOWA(17.8),
    AMERYKA_PÓŁNOCNA(24.2),
    ANTARKTYDA(13.2),
    AUSTRALIA(7.7),
    EUROPA(10.2),
    AZJA(44.6);

    private final double area;

    Continent(double area) {
        this.area = area;
    }

    public double getArea() {
        return area;
    }

    public static Continent BiggestContinent() {
        return Continent.valueOf(String.valueOf(AZJA));
    }

    public static Continent SmallestContinent() {
        return Continent.valueOf(String.valueOf(AUSTRALIA));
    }
}
