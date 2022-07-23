package ru.job4j.map;

import java.util.*;

public class Weather {

    public static List<Info> editData(List<Info> list) {
        Map<String, Integer> rainfallToCities = new LinkedHashMap<>();
        for (Info info : list) {
            rainfallToCities.computeIfPresent(info.getCity(), (k, v) -> v + info.getRainfall());
            rainfallToCities.putIfAbsent(info.getCity(), info.getRainfall());
        }
        List<Info> rsl = new ArrayList<>();
        for (Map.Entry<String, Integer> item : rainfallToCities.entrySet()) {
            rsl.add(new Info(item.getKey(), item.getValue()));
        }
        rsl.sort((i1, i2) -> Integer.compare(i2.getRainfall(), i1.getRainfall()));
        return rsl;
    }

    public static class Info {

        private String city;
        private int rainfall;

        public Info(String city, int rainfall) {
            this.city = city;
            this.rainfall = rainfall;
        }

        public String getCity() {
            return city;
        }

        public int getRainfall() {
            return rainfall;
        }

        @Override
        public String toString() {
            return "Info [city=" + city + ", rainfall=" + rainfall + "]";
        }

        @Override
        public boolean equals(Object o) {
            if (this == o) {
                return true;
            }
            if (o == null || getClass() != o.getClass()) {
                return false;
            }
            Info info = (Info) o;
            return rainfall == info.rainfall && Objects.equals(city, info.city);
        }

        @Override
        public int hashCode() {
            return Objects.hash(city, rainfall);
        }
    }
}