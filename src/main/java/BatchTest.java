public class BatchTest {
    public static void main(String[] args) {
        NumberToText n = new NumberToText();
        for (int i = 0; i < 1000 ; i++) {
            System.out.println(i + " -> " + n.convert(i));
        }
    }
}
