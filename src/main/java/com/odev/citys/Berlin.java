package odev.citys;

import odev.citys.abstraction.City;

public class Berlin extends City {
    public Berlin() {
        super("Berlin","BER",1);
    }

    @Override
    public String toString() {
        return "Berlin{" +
                "name='" + name + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", GMT=" + GMT +
                '}';
    }
}
