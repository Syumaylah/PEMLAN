package uap.bases;

public abstract class Shape {  // kelas abstrak untuk bentuk dasar
    private String name;  // variabel untuk menyimpan nama bentuk

    public Shape() {}  // konstruktor default

    public void setName(String inputName) {  // method untuk mengatur nama
        this.name = inputName;  // mengisi nilai name
    }

    public String getName() {  // method untuk mendapatkan nama
        return this.name;  // mengembalikan nilai name
    }

    public abstract void printInfo();  // method abstrak untuk mencetak info
}
