public class FacadeClass {
    private Customer customer;
    private Banka banka;
    private KreditManager kreditManager;
    private MerkezBanka merkezBanka;

    public FacadeClass(){
        customer = new Customer();
        banka = new Banka();
        kreditManager = new KreditManager();
        merkezBanka = new MerkezBanka();
    }
    public void krediKullan(String customer, double hesap, int value ){
        if(hesap >= value & merkezBanka.blokeKontrol()==false){
            
        }else{
            System.out.println("kredi kullanamaz");
        }
        banka.krediyiKullan();
        
    }

}
