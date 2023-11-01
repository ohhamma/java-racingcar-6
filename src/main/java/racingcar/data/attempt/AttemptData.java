package racingcar.data.attempt;

import java.util.List;

public class AttemptData {
    private final MoveAttempts moveAttempts;
    private final AttemptIndex attemptIndex;
    private static final String WINNER_DELIMITER = ", ";

    public AttemptData() {
        this.moveAttempts = new MoveAttempts();
        this.attemptIndex = new AttemptIndex();
    }

    public void initMoveAttempts(String racingCarNameData) {
        moveAttempts.createAttempt();
        moveAttempts.initBasicAttempt(racingCarNameData);
        attemptIndex.increase();
    }

    public void pickNewNumber() {
        moveAttempts.initNewAttempt(attemptIndex.toInt());
    }

    public void moveRacingCars() {
        moveAttempts.apply(attemptIndex.toInt());
    }

    public Attempt findLastAttemptByIndex() {
        return moveAttempts.findAttemptByIndex(attemptIndex.toInt());
    }

    public String findWinners() {
        List<String> Winners =  moveAttempts.findWinnersByIndex(attemptIndex.toInt());
        return String.join(WINNER_DELIMITER, Winners);
    }
}