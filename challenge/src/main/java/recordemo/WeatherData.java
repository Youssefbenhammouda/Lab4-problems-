package recordemo;

public record WeatherData(double temperatureCelsius, String conditions) {

    // Instance method to convert Celsius to Fahrenheit
    public double temperatureFahrenheit() {
        return (temperatureCelsius*9/5+32);
    }

    // Instance method to get a formatted summary string
    public String getSummary() {
        return "Current weather: "+temperatureCelsius+"°C ("+temperatureFahrenheit()+"°F) and "+conditions;
    }

    // Static factory method to create a WeatherData record from Fahrenheit
    public static WeatherData fromFahrenheit(double tempFahrenheit, String conditions) {
       return new WeatherData((tempFahrenheit-32)*5/9,conditions);
    }

    public static void main(String[] args) {

        WeatherData w1 = new WeatherData(25.0,"Sunny");
        System.out.println(w1.getSummary());

        WeatherData w2 = WeatherData.fromFahrenheit(50.0, "Cloudy");
        System.out.println(w2.getSummary());


    }
}

