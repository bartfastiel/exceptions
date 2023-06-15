class Main {
    public static void main(String[] args) {
        System.out.println("Home-Office: Hunger!");
        String pizza = orderPizzaFromRestaurant();
        System.out.println("Home-Office: Ich esse " + pizza);
    }

    static String orderPizzaFromRestaurant() {
        System.out.println("Restaurant: Bestellung erhalten");
        String flour = null;
        try {
            getFlourOutOfFlourSack();
        } catch (MausException e) {
            flour = "Mehl aus der Box, weil im Sack eine Maus mit "+e.getNumberOfEyes()+" Augen saß";
        } catch (IllegalArgumentException e) {
            flour = "Mehl aus der Box, weil "+e.getClass()+" auftrat";
        }
        System.out.println("Restaurant: " + flour + " geholt");
        return "Salami-Pizza aus " + flour;
    }

    static String getFlourOutOfFlourSack() {
        throw new MausException(1);
    }
}




