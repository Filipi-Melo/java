public class vetor {
    private static void println(String a) {System.out.println(a);}
    public static void main(String[] args) {
        int x = 101;
        int v1[]= new int[x];
        for(int y=1;y<x;y++){ 
            for(int z=1;z<x;z++){
                v1[z]=z;
                println(v1[z]+"");
            }
        }
    }
}