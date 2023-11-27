public class Pizza {
    private int price;
    private Boolean veg;
    private int addExtraChees = 100;
    private int addExtraToppings = 150;
    private int addbackPack = 20;
    private  boolean isExtraCheesAdded = true;
    private  boolean isExtraToppingAdded = true;
    private boolean isOptedAdded = true;

   // private int billGenerator;



    public Pizza (Boolean veg) {
        this.veg = veg;

        if(this.veg) {
            this.price = 300;
        } else {
            this.price = 400;
        }
    }

    public void addExtraChees() {
        isExtraCheesAdded = true;
        //System.out.println("Extra Chees Added");
        this.price += addExtraChees;
    }

    public void addExtraToppings() {
        isExtraToppingAdded = true;
        //System.out.println("Extra Toppings Added");
        this.price += addExtraToppings;

    }
    public void addTakeAway() {
        isOptedAdded = true;
        //System.out.println("Confirm Take Away");
        this.price += addbackPack;

    }

    public void getBill() {
        String bill = " ";
        System.out.println("The Total Bill is:" + " " + this.price);

        if (isExtraCheesAdded) {
            bill += "Extra Chees Added: " +addExtraChees+ "\n";
        }

        if (isExtraToppingAdded) {
            bill += " Extra Topping Added: " +addExtraToppings+ "\n";
        }

        if (isOptedAdded) {
            bill += " Extra Opted Added: " +addbackPack+ "\n";
        }

        bill += " Bill : " + this.price + "\n";
        System.out.println(bill);
    }

}
