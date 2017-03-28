package no.fint.provider.bluegarden.utilities;

public enum ArbeidsforholSystemIdUtility {

    ;

    public static String getSystemId(String ansattnummer, String stillingsnummer) {
        return String.format("hfk.no:%s:%s", ansattnummer, stillingsnummer);
    }
}
