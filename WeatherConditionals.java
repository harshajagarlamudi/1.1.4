public class WeatherConditionals
{   
    public static String getWeatherAdvice(int temperature, String description){
         
        boolean windy = false;
        boolean snow = false;
        if(description.indexOf("windy") > -1){windy = true;}
        if(windy == false && temperature > 30){
            System.out.println("It's safe to go outside, "+temperature+" degrees and "+description+".");
        }
        else{
            System.out.println("Too windy or cold! Enjoy watching the weather through the window.");
        }
        
        if(description.indexOf("snow") > -1){snow = true;}
        if(snow == true && temperature > 100){
            System.out.println("Unrealistic weather condition.");
        }
        System.out.println("Weather is normal");
        return null;
    }    
    
    public static String getHikingAdvice(int temperature, int windchill, int humidity, String description){
        if(temperature >=65 && description.toLowerCase() == "cloudy"){
            System.out.println("You're in San Jose.");
        }
        else if(description.toLowerCase() == "fair"){
            System.out.println("You're in Santa Fe.");
        }
        else if(humidity >=50){
            System.out.println("Wear a coat.");
        }
        else if(temperature <=0 && windchill <=0){
            System.out.println("Stay inside.");
        }
        else if(description.toLowerCase()=="cloudy" && temperature < 65){
            System.out.println("It's cold outside.");
        }
        else{
            System.out.println("Bring an Umbrella!");
        }
        return null;
    }
}