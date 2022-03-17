package com.kodilla.testing.weather.stub;
import java.util.*;

public class WeatherForecast {

    private Temperatures temperatures;

    public WeatherForecast(Temperatures temperatures) {
        this.temperatures = temperatures;
    }

    public Map<String, Double> calculateForecast() {

        Map<String, Double> resultMap = new HashMap<>();
        for (Map.Entry<String, Double> temperature : temperatures.getTemperatures().entrySet()) {
            resultMap.put(temperature.getKey(), temperature.getValue() + 1.0); // [1]
            //System.out.println(temperature);
        }
        return resultMap;
    }

    public double averageTemperature(Temperatures temp) {
        int j = 0;
        double sum = 0;
        for (Map.Entry<String, Double> temperature : temp.getTemperatures().entrySet()) {

            sum += temperature.getValue();
            j++;

        }

        return sum / j;
    }


    public double medianTemperature(Temperatures temp) {

        double mediana =0;
        int j = 0;
        double sum = 0;
        ArrayList<Double> resultMap = new ArrayList<Double>();
        for (Map.Entry<String, Double> temperature : temp.getTemperatures().entrySet()) {
            resultMap.add(temperature.getValue());
        }
        Collections.sort(resultMap);
        int i=resultMap.size();
        double k=i/2;
        double a=Math.round(k);
        int p=(int)a;
        if(p%2==0) {
            return resultMap.get(p);
        }
        else
        {
           // int i=resultMap.get(p);

            //int p =resultMap.get(p+1);
            double suma= (resultMap.get(p)+resultMap.get(p+1));
            return  suma/2;
        }
    }

}

