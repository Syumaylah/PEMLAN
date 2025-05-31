package uap.interfaces;

public interface MassCalculable {  // interface untuk hitung massa
    int DENSITY = 8;  // konstanta massa jenis (g/cm³)
    double THICKNESS = 0.5;  // konstanta ketebalan (cm)
    
    double getMass();  // method untuk menghitung massa
}
