public class Main {
    public static  void main (String [] args) {
//        Pizza basePizza = new Pizza(true);
//        basePizza.addExtraChees();
//        basePizza.addExtraToppings();
//        basePizza.addTakeAway();
//        basePizza.getBill();

        DeluxPizza dp = new DeluxPizza(false);
        dp.addExtraChees();
        dp.addExtraToppings();
        dp.addTakeAway();
        dp.getBill();
    }
}