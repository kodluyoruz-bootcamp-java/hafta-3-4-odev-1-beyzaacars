package odev.citys;

import odev.citys.abstraction.City;



public class Newyork extends City {
    public Newyork() {
        super("Newyork","NYC",-5);
    }


    @Override
    public String toString() {
        return "Newyork{" +
                "name='" + name + '\'' +
                ", cityCode='" + cityCode + '\'' +
                ", GMT=" + GMT +
                '}';
    }
}
