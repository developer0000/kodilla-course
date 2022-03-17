package com.kodilla.testing.weather.mock;
import com.kodilla.testing.weather.stub.Temperatures;                         // [2]
import com.kodilla.testing.weather.stub.WeatherForecast;                      // [3]
import org.junit.jupiter.api.Assertions;                                      // [4]
import org.junit.jupiter.api.DisplayName;
import org.junit.jupiter.api.Test;                                            // [5]
import org.mockito.Mock;
import java.util.*;
import static org.mockito.Mockito.*;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.junit.jupiter.MockitoExtension;

    @ExtendWith(MockitoExtension.class)

  public class WeatherForecastTestSuite {


    @DisplayName("Fotecast")
    @Test
        // [8]
    void testCalculateForecastWithMock() {                                     // [9]
        //Given
        Temperatures temperaturesMock = mock(Temperatures.class);
        Map<String, Double> temperaturesMap = new HashMap<>();                   // [14]

        temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
        temperaturesMap.put("Krakow", 26.2);                                       // [16]
        temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
        temperaturesMap.put("Warszawa", 25.2);                                     // [18]
        temperaturesMap.put("Gdansk", 26.1);                                       // [19]

        when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]
        WeatherForecast weatherForecast = new WeatherForecast(temperaturesMock);   // [21]

        //When
        int quantityOfSensors = weatherForecast.calculateForecast().size();     // [12]

        //Then
        Assertions.assertEquals(5, quantityOfSensors);                          // [13]

    }
        @DisplayName("AverageTemp")
        @Test
        void testTempAverage() {

            Temperatures temperaturesMock = mock(Temperatures.class);
            Map<String, Double> temperaturesMap = new HashMap<>();                   // [14]

            temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
            temperaturesMap.put("Krakow", 26.2);                                       // [16]
            temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
            temperaturesMap.put("Warszawa", 25.2);                                     // [18]
            temperaturesMap.put("Gdansk", 26.1);                                       // [19]
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]


            WeatherForecast weatherForecast2 = new WeatherForecast(temperaturesMock);
            double d = weatherForecast2.averageTemperature(temperaturesMock);
            double test = 25.56;
            Assertions.assertEquals(test, d);
        }

        @DisplayName("MedianTemp")
        @Test
        void testMedianTemp() {

            Temperatures temperaturesMock = mock(Temperatures.class);
            Map<String, Double> temperaturesMap = new HashMap<>();                   // [14]

            temperaturesMap.put("Rzeszow", 25.5);                                      // [15]
            temperaturesMap.put("Krakow", 26.2);                                       // [16]
            temperaturesMap.put("Wroclaw", 24.8);                                      // [17]
            temperaturesMap.put("Warszawa", 25.2);                                     // [18]
            temperaturesMap.put("Gdansk", 26.1);                                       // [19]
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]


            WeatherForecast weatherForecast2 = new WeatherForecast(temperaturesMock);
            double d = weatherForecast2.medianTemperature(temperaturesMock);
            //System.out.println(d);
            double test = 25.5;
            Assertions.assertEquals(test, d);

        }

        @DisplayName("MedianTempEven")
        @Test
        void testMedianTempEven() {

            Temperatures temperaturesMock = mock(Temperatures.class);
            Map<String, Double> temperaturesMap = new HashMap<>();                   // [14]

            temperaturesMap.put("Rzeszow", 1.0);                                      // [15]
            temperaturesMap.put("Krakow", 2.0);                                       // [16]
            temperaturesMap.put("Wroclaw", 3.0);                                      // [17]
           //temperaturesMap.put("Warszawa", 25.2);                                     // [18]
            temperaturesMap.put("Gdansk", 4.0);                                       // [19]
            when(temperaturesMock.getTemperatures()).thenReturn(temperaturesMap);      // [20]


            WeatherForecast weatherForecast2 = new WeatherForecast(temperaturesMock);
            double d = weatherForecast2.medianTemperature(temperaturesMock);
            //System.out.println(d);
            double test = 2.5;
            Assertions.assertEquals(test, d);

        }





    }
