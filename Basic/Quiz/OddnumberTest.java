public class Main {
    public static void main(String[] args) {

        int cnt = 0;
        for (int i = 2; i < 101; i++) {
            for (int j = 2; j < i; j++) {
                if (i % j == 0) {
                    cnt++;
                    break;
                }

            }
            if (cnt == 0) {
                System.out.print(i + " ");
            }
            cnt = 0;
        }
    }
}
