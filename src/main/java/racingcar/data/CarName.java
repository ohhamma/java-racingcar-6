package racingcar.data;

public class CarName {
    private final String name;
    private final int LIMIT = 5;
    private static final String LONGER_THAN_LIMIT = "CarName should be no longer than ";

    public CarName(String name) {
        this.name = name;
        validateCarName(name, LIMIT);
    }

    public static void validateCarName(String name, int limit) {
        if (name.length() > limit) {
            throw new IllegalArgumentException(LONGER_THAN_LIMIT + limit + ".");
        }
    }
}