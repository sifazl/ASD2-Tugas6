package tugas6;
public class TumpukkanApp {
    public static void main(String[] args){
        Tumpukkan tumpukan=new Tumpukkan(10);
        tumpukan.push(50);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(100);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.pop();
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(60);
        tumpukan.baca();
        System.out.println(" ");
        tumpukan.push(80);
        tumpukan.baca();
        long nilai2=tumpukan.pop();
        
        System.out.println(" ");
        tumpukan.baca();
        System.out.println(" ");
        long nilai3=tumpukan.peek();
        System.out.println("nilai top  = " +nilai3);
        
      
    }
}

