public class BatchTest {
    public static void main(String[] args) {
        NumberToText n = new NumberToText();

        System.out.println(n.convert(999));
        System.out.println(n.convert(10999));
        System.out.println(n.convert(1000000));
        System.out.println(n.convert(6000000));
        System.out.println(n.convert(7896413));
        System.out.println(n.convert(4578921));
        System.out.println(n.convert(789456123));
        System.out.println(n.convert(123456789));


    }
}
