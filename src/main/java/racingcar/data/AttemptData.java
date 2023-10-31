package racingcar.data;

import java.util.ArrayList;
import java.util.List;

public class AttemptData {
    private final List<Attempt> attempts;
    private final AttemptNumber attemptNumber;

    public AttemptData(int attemptNumber) {
        this.attempts = new ArrayList<>();
        this.attemptNumber = new AttemptNumber(attemptNumber);
    }

    public void createAttempt() {
        Attempt newAttempt = new Attempt();
        attempts.add(newAttempt);
    }

    public void pickNewNumber() {
        attempts.get(0).initInputNumber();
    }
}