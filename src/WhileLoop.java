public class WhileLoop {
    public static void main(String[] args) {

        int i = 0;
        while (i < 5) {
            System.out.println("i=" +i);
            if (i==3) break;
            i++;
        }

        int j = 0;
        do {
            System.out.println("j=" +j);
            j++;
        } while (j<5);

    }
}
