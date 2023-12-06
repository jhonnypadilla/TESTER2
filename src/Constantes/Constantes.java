package Constantes;

import java.util.ArrayList;

public class Constantes {

    public static final String GILBARCO = "GILBARCO";
    public static final String WAYNE = "WAYNE";
    public static final String BLUE_SKY = "BLUE SKY";
    public static final String RESPUESTA_BLUE_SKY = "respondiendo blueskay";
    public static final String RESPUESTA_GILBARCO = "respondiendo gilbarco";
    public static final String RESPUESTA_WAYNE = "respondiendo wayne";

    public static ArrayList<String> obtenerProtocolos() {
        ArrayList<String> protocolos = new ArrayList();
        protocolos.add(GILBARCO);
        protocolos.add(WAYNE);
        protocolos.add(BLUE_SKY);
        return protocolos;
    }

}
