package odev;

import odev.citys.*;
import odev.citys.abstraction.City;

import java.util.*;
import java.util.stream.Collectors;

public class Main {
    public static void main(String[] args) {

        London london = new London();
        Berlin berlin = new Berlin();
        Newyork newyork = new Newyork();
        Moscow moscow = new Moscow();
        NewDelphi newDelphi = new NewDelphi();



        Map<String, City> cityMap=new HashMap<>();
        cityMap.put(london.getCityCode(),london);
        cityMap.put(newDelphi.getCityCode(),newDelphi);
        cityMap.put(moscow.getCityCode(),moscow);
        cityMap.put(berlin.getCityCode(),berlin);
        cityMap.put(newyork.getCityCode(),newyork);


        TreeMap<String, City> sorted = new TreeMap<>(cityMap);

        System.out.println(sorted);


    }
}


