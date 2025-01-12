package view;

import exception.CarNameDuplicationException;

import java.util.List;

public class InputViewValidator {
    public static void validateCarNameDuplication(List<String> cars) {
        boolean duplicated = cars.stream()
                .distinct()
                .count() != cars.size();

        if(duplicated) {
            throw new CarNameDuplicationException();
        }
    }
}
