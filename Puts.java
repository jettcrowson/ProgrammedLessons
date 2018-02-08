public class Puts{
    public static void puts(String x){
        System.out.println(x);
    }
    public static void puts(int x){
        System.out.println(x);
    }
    public static void puts(int[] x){
        String toPrint = "[";
        for(int i = 0; i < x.length; i++){
            if(i < x.length - 1){
                toPrint += x[i] + ", ";
            }else{
                toPrint += x[i];
            }
        }
        toPrint += "]";
        puts(toPrint);
    }
    public static void puts(boolean x){
        System.out.println(x);
    }
}