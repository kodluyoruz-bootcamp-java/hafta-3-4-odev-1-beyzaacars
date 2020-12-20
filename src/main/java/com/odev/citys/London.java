package odev.citys;

import odev.citys.abstraction.City;


public class London extends City {
    public London() {
        super("London","LON",1);
    }

    @Override
    public String toString() {
        return "London{" +
                "name='" + name + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", GMT=" + GMT +
                '}';
    }


}
