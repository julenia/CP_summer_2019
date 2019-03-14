public class Loops {
    public static void main(String[] args) {

        Integer a = 6;

        for (int i=0; i<5;i++) {
            System.out.println("i=" + i);
        }

        for (int j=10; j>0; j--){
            if (j==8) continue;
            System.out.println("j=" +j);
            if (j==6) break;
        }
    }
}
