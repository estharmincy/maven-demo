public class OutfitZone {

    public String recommendOutfit(String weather) {

        if (weather.equalsIgnoreCase("hot")) {
            return "Wear cotton shirt and sunglasses";
        } 
        else if (weather.equalsIgnoreCase("cold")) {
            return "Wear jacket and warm clothes";
        } 
        else if (weather.equalsIgnoreCase("rainy")) {
            return "Take umbrella and wear raincoat";
        } 
        else {
            return "Wear normal casual dress";
        }
    }
}