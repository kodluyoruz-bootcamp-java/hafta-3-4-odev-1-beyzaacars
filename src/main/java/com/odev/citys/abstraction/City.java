package odev.citys.abstraction;

import odev.IClock;

import java.sql.Time;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.ZoneOffset;
import java.time.ZonedDateTime;
import java.time.format.DateTimeFormatter;


public abstract class City implements Comparable<City>, IClock {

    protected String name;
    protected String cityCode;
    protected Integer GMT;

    public City(String name, String cityCode, Integer GMT) {
        this.name = name;
        this.cityCode = cityCode;
        this.GMT = GMT;
    }

    @Override
    public String showTime() {
        return Clock(this.GMT).toString();

    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getCityCode() {
        return cityCode;
    }

    public void setCityCode(String cityCode) {
        this.cityCode = cityCode;
    }

    public Integer getGMT() {
        return GMT;
    }

    public void setGMT(Integer GMT) {
        this.GMT = GMT;
    }

    public LocalDateTime Clock(Integer gmt){
        String dateTime = "MM/dd/yyyy HH:mm:ss";

        LocalDateTime now = LocalDateTime.now(ZoneId.of("+0"));
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern(dateTime);

        Integer gmtPSTOffset = gmt;
        ZoneOffset offset = ZoneOffset.ofHours(gmtPSTOffset);

        // String to LocalDateTime
        LocalDateTime ldt = LocalDateTime.parse(now.format(formatter), DateTimeFormatter.ofPattern(dateTime));
        // Set the generated LocalDateTime's TimeZone. In this case I set it to UTC
        ZonedDateTime ldtUTC = ldt.atZone(ZoneOffset.UTC);
        LocalDateTime ldtPST = LocalDateTime.ofInstant(ldtUTC.toInstant(), offset);


    return ldtPST;
    }
    @Override
    public int compareTo(City o) {
        return this.name.compareTo(o.getName());
    }
}
