import org.junit.Test;

import static org.assertj.core.api.Assertions.assertThat;

public class TestNumberToText {

    @Test
    public void given_numbers_with_an_special_name(){
        assertThat((new NumberToText().convert(0))).isEqualTo("zero");
        assertThat((new NumberToText().convert(1))).isEqualTo("one");
        assertThat((new NumberToText().convert(2))).isEqualTo("two");
        assertThat((new NumberToText().convert(3))).isEqualTo("three");
        assertThat((new NumberToText().convert(4))).isEqualTo("four");
        assertThat((new NumberToText().convert(5))).isEqualTo("five");
        assertThat((new NumberToText().convert(6))).isEqualTo("six");
        assertThat((new NumberToText().convert(7))).isEqualTo("seven");
        assertThat((new NumberToText().convert(8))).isEqualTo("eight");
        assertThat((new NumberToText().convert(9))).isEqualTo("nine");
        assertThat((new NumberToText().convert(10))).isEqualTo("ten");
        assertThat((new NumberToText().convert(11))).isEqualTo("eleven");
        assertThat((new NumberToText().convert(12))).isEqualTo("twelve");
        assertThat((new NumberToText().convert(13))).isEqualTo("thirteen");
        assertThat((new NumberToText().convert(14))).isEqualTo("fourteen");
        assertThat((new NumberToText().convert(15))).isEqualTo("fifteen");
        assertThat((new NumberToText().convert(16))).isEqualTo("sixteen");
        assertThat((new NumberToText().convert(17))).isEqualTo("seventeen");
        assertThat((new NumberToText().convert(18))).isEqualTo("eighteen");
        assertThat((new NumberToText().convert(19))).isEqualTo("nineteen");
    }

    @Test
    public void given_a_multiple_of_ten_with_two_digits() {
        assertThat((new NumberToText().convert(20))).isEqualTo("twenty");
        assertThat((new NumberToText().convert(30))).isEqualTo("thirty");
        assertThat((new NumberToText().convert(40))).isEqualTo("forty");
        assertThat((new NumberToText().convert(60))).isEqualTo("sixty");
        assertThat((new NumberToText().convert(90))).isEqualTo("ninety");
    }


    @Test
    public void given_21_should_return_twenty_one() {
        assertThat((new NumberToText().convert(21))).isEqualTo("twenty-one");
    }

    @Test
    public void given_25_should_return_twenty_five() {
        assertThat((new NumberToText().convert(25))).isEqualTo("twenty-five");
    }

    @Test
    public void given_29_should_return_twenty_nine() {
        assertThat((new NumberToText().convert(29))).isEqualTo("twenty-nine");
    }

    @Test
    public void given_31_should_return_thirty_one() {
        assertThat((new NumberToText().convert(31))).isEqualTo("thirty-one");
    }

    @Test
    public void given_41_should_return_forty_one() {
        assertThat((new NumberToText().convert(41))).isEqualTo("forty-one");
    }

    @Test
    public void given_99_should_return_ninety_one() {
        assertThat((new NumberToText().convert(91))).isEqualTo("ninety-one");
    }

    @Test
    public void given_100_should_return_one_hundred() {
        assertThat((new NumberToText().convert(100))).isEqualTo("one hundred");
    }

    @Test
    public void given_numbers_greater_than_101_and_lesser_than_110() {
        assertThat((new NumberToText().convert(101))).isEqualTo("one hundred and one");
        assertThat((new NumberToText().convert(103))).isEqualTo("one hundred and three");
        assertThat((new NumberToText().convert(106))).isEqualTo("one hundred and six");
        assertThat((new NumberToText().convert(109))).isEqualTo("one hundred and nine");
    }

    @Test
    public void given_110_should_return_one_hundred_and_ten() {
        assertThat((new NumberToText().convert(110))).isEqualTo("one hundred and ten");
    }

    public void given_999_should_return_nine_hundred_and_ninety_nine() {
        assertThat((new NumberToText().convert(110))).isEqualTo("nine hundred and ninety-nine");
    }
}