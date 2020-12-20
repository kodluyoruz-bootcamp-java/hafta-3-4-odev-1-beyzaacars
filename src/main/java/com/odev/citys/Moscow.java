package odev.citys;

import odev.citys.abstraction.City;

public class Moscow extends City {
     public Moscow(){
         super("Moscow","MOW", 3);
     }

    @Override
    public String toString() {
        return "Moscow{" +
                "name='" + name + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", GMT=" + GMT +
                '}';
    }
}
