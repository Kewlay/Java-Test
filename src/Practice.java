void main() {
    /* Hey, this is a program that basically sees if an item is discounted
    and if it is it will apply a -2 discount on whatever item you're buying */
    String apple = "Apples";
    double price = 3.99;
    int amount_bought = 3;
    boolean is_discounted = true;
    double discounted_price = price - 2;
    if (is_discounted) {
        IO.println("Congratulations! Our discount applies to you! you just bought " + amount_bought + " " + apple + " for a total of " + (discounted_price * amount_bought));
    }
    else IO.println("You just bought " + amount_bought + " " + apple + " for a total of " + (price * amount_bought));
}