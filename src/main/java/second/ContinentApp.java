package second;

public class ContinentApp {
    public static void main(String[] args) {
        Continent biggestContinent = Continent.BiggestContinent();
        System.out.println(biggestContinent);

        Continent smallestContinent = Continent.SmallestContinent();
        System.out.println(smallestContinent);

    }
}
