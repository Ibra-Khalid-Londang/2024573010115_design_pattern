package modul_5.praktikum_2.dengan_ocp;

public class RegulerDiscount implements Discount{
    public double applyDiscount(double price){
        return price * 0.1;
    }
}
