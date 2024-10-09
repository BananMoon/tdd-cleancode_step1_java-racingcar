package carracing;

import carracing.domain.carracing.CarRacing;
import carracing.view.InputView;
import carracing.view.ResultView;

public class CarRacingInterface {
    public static void start() {
        String[] carNames = InputView.carNamesFromUser();
        int moveTryCount = InputView.moveTryCountFromUser();
        CarRacing carRacing = new CarRacing(carNames, moveTryCount);

        carRacing.start();

        ResultView.printCarRacingResult(carRacing.getCarsMoveStatusHistory());
        ResultView.printCarRacingWinners(carRacing.winnersNames());
    }

    public static void main(String[] args) {
        CarRacingInterface.start();
    }
}
