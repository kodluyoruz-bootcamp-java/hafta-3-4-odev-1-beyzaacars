package odev.citys;

import odev.citys.abstraction.City;

public class NewDelphi extends City {
    public NewDelphi() {
        super("NewDelphi","NED", 5);
    }

    @Override
    public String toString() {
        return "NewDelphi{" +
                "name='" + name + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", GMT=" + GMT +
                '}';
    }
}
