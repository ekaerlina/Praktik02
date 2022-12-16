package praktik02;
public class Rectangle {
    double panjang;
    double lebar;
    
    void cetakInfo() {
        System.out.println("====================");
        System.out.println("Panjang : "+panjang);
        System.out.println("Lebar   : "+lebar);
        System.out.println("====================");
    }
    
    double hitungLuas(){
        double luar;
        double luas = panjang*lebar;
        return luas;
    }
    
    void cetakLuas(){
        System.out.println("Luasnya adalah: "+rl.hitungLuas());
        rl.cetakLuas();
    }
}
