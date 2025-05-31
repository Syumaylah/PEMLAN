package uap.interfaces;

public interface ShippingCostCalculator {  // interface biaya pengiriman
    int PRICE_PER_KG = 2000;  // harga per kilogram (Rp)

    double calculateCost();  // method hitung biaya
}
