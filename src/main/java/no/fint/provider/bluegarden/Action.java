package no.fint.provider.bluegarden;

import java.util.Arrays;
import java.util.List;

public enum Action {
    HEALTH,
    GET_ALL_EMPLOYEES;

    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(Action.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }
}
