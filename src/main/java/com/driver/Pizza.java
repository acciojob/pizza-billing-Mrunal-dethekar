package com.driver;

public class Pizza {

    private int price;
    private Boolean isVeg;
    private String bill;
    private boolean isCheeseAdded = false;
    private boolean isToppingAdded = false;
    private boolean isBagAdded = false;
    private int extraToppingPrice;

    public Pizza(Boolean isVeg) {
        this.isVeg = isVeg;
        // your code goes here
        if (isVeg) {
            this.price = 300;
            this.extraToppingPrice = 70;
        } else {
            this.price = 400;
            this.extraToppingPrice = 120;
        }
        this.bill = "Base Price Of The Pizza: " + this.price + "\n";
    }

    public int getPrice() {
        return this.price;
    }

    public void addExtraCheese() {
        // your code goes here
        if (isCheeseAdded == false) {
            this.price = this.price + 80;
            isCheeseAdded = true;
        }
    }

    public void addExtraToppings() {
        // your code goes here
        if (isToppingAdded == false) {
            isToppingAdded = true;
            this.price = this.price + this.extraToppingPrice;
        }
    }

    public void addTakeaway() {
        // your code goes here
        if (isBagAdded == false) {
            this.price = this.price + 20;
            this.isBagAdded = true;
        }
    }

    public String getBill() {
        // your code goes here

        if (this.isCheeseAdded) {
            this.bill = bill + "Extra Cheese Added: 80\n";
        }
        if (this.isToppingAdded) {
            this.bill = bill + "Extra Toppings Added: " + this.extraToppingPrice + "\n";
        }
        if (this.isBagAdded) {
            this.bill = this.bill + "Paperbag Added: 20" + "\n";
        }
        this.bill = this.bill + "Total Price: " + this.price + "\n";
        return this.bill;
    }
}
