public class DeluxPizza extends Pizza{
    @Override
    public void addExtraChees() {}

    @Override
    public void addExtraToppings() {}

    public DeluxPizza(Boolean veg) {
        super(veg);
        super.addExtraChees();
        super.addExtraToppings();

    }
}
