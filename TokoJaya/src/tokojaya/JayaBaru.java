package tokojaya;
public class JayaBaru {
   private int harga;
   private int diskon;
   private int total;
   public JayaBaru(int harga, int diskon, int total){
       this.harga = harga;
       this.diskon = diskon;
       this.total = total;
   }
   
   public void info(){
       System.out.println("harga "+this.harga);
       System.out.println("diskon "+this.diskon);
       System.out.println("total"+this.total);
   }
}
