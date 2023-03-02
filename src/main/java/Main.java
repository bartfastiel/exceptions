class Main {
    public static void main(String[] args) {
        System.out.println("Home-Office: Hunger!");
        String pizza = orderPizzaFromRestaurant();
        System.out.println("Home-Office: Ich esse " + pizza);
    }

    static String orderPizzaFromRestaurant() {
        System.out.println("Restaurant: Bestellung erhalten");
        String flour = getFlourOutOfFlourSack();
        System.out.println("Restaurant: " + flour + " geholt");
        return "Salami-Pizza aus " + flour;
    }

    static String getFlourOutOfFlourSack() {
        throw new MausException();
    }
}
