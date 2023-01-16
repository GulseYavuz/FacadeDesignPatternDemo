public class KreditManager {
    private int value;
    public void krediKullanmaDurumu(double hesap, int value){
        if(hesap >= value){
            System.out.println("Kredi kullanbilir.");
        }else{
            System.out.println("Kredi kullanamaz.");
        }

    }
}
