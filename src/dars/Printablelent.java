package dars;

//public class Printablelent implements Printable{
//
//    @Override
//    public void print() {
//        System.out.println("Hello Interface");
//    }
//    // tepadagini implementni override qilish uchun alt + enter tugmasini bosib implementes bulimga
//    // utib override qilamiz
//
//
//    public static void main(String[] args) {
//        Printable draw = new Printablelent(); // obekt olish polimorfizmga kiradi
//        draw.print();
//    }
    public interface Printablelent extends Printable{
        void draw();
}
