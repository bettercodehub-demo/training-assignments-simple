package eu.sig.training.ch03;

import java.awt.Color;
import java.util.Arrays;
import java.util.List;

public class FlagFactory {

    // tag::getFlag[]
    public List<Color> getFlagColors(Nationality nationality) {
        List<Color> result;
        switch (nationality) {
        case DUTCH:
            result = Arrays.asList(Color.RED, Color.WHITE, Color.BLUE);
            break;
        case GERMAN:
            result = Arrays.asList(Color.BLACK, Color.RED, Color.YELLOW);
            break;
        case UNCLASSIFIED:
        default:
            result = Arrays.asList(Color.GRAY);
            break;
        }
        return result;
    }
    // end::getFlag[]

}