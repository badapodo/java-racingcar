package view;

import util.Converter;

import java.util.List;

import static camp.nextstep.edu.missionutils.Console.readLine;

public class InputView {

    private final OutputView outputView;

    public InputView(OutputView outputView) {
        this.outputView = outputView;
    }

    public List<String> readNames() {
        outputView.println("경주할 자동차 이름을 입력하세요.(이름은 쉼표(,) 기준으로 구분");

        List<String> names = Converter.splitNames(readLine());
        InputViewValidator.validateCarNameDuplication(names);
        return names;
    }

    public int readTryCount() {
        outputView.println("시도할 횟수는 몇 회인가요?");

        return Converter.parseInt(readLine());
    }
}
