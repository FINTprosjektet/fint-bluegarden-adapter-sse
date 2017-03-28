package no.fint.provider.bluegarden;

import java.util.Arrays;
import java.util.List;

public enum Action {
    HEALTH,
    GET_ALL_RELATIONS,
    GET_ALL_PERSON,
    GET_ALL_PERSONALRESSURS,
    GET_ALL_ARBEIDSFORHOLD;

    public static List<String> getActions() {
        return Arrays.asList(
                Arrays.stream(Action.class.getEnumConstants()).map(Enum::name).toArray(String[]::new)
        );
    }
}
