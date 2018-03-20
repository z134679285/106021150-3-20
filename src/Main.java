public class Main {
    public static void main(String arg[]) {
        Invoice inv= new Invoice();
        Product prods[]= new Product[10];
        for(int i=0 ;i<10 ;i++){
            prods[i]= new Product(scn.next(),scn.nextFloat,scn.nextInt());
            prods[i].showInfo();
         }
      }
}