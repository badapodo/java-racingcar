package util;

import java.util.List;

public class Converter {

    public static List<String> splitNames(String input) {
        return List.of(input.split(","));
    }
}
