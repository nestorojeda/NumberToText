public class NumberToText {

    public String convert(int number){
        if(number == 0) return "zero";
        else if(number > 19 && number < 100){
            if (isMultipleOfTen(number)){
                return twoDigitAndGreaterThanTenConverter(number);
            }
            return twoDigitAndGreaterThanTenConverter(takeMultipleOfTen(number)) + "-" + specialNumberConverter(number - takeMultipleOfTen(number));
        } else if(number > 99 && number < 1000){
            return threeDigitConverter(number);
        } else if (number > 999 && number < 1000000){
            return fourDigitConverter(number);
        }else if(number>999999 && number < 1000000000) {
            return fiveDigitConverter(number);
        }
        return specialNumberConverter(number);
    }

    private String specialNumberConverter(int number) {

        if(number == 1) return "one";
        if(number == 2) return "two";
        if(number == 3) return "three";
        if(number == 4) return "four";
        if(number == 5) return "five";
        if(number == 6) return "six";
        if(number == 7) return "seven";
        if(number == 8) return "eight";
        if(number == 9) return "nine";

        if(number == 10) return "ten";
        if(number == 11) return "eleven";
        if(number == 12) return "twelve";
        if(number == 13) return "thirteen";
        if(number == 14) return "fourteen";
        if(number == 15) return "fifteen";
        if(number == 16) return "sixteen";
        if(number == 17) return "seventeen";
        if(number == 18) return "eighteen";
        if(number == 19) return "nineteen";
        return null;
    }

    private String twoDigitAndGreaterThanTenConverter(int number){

        if(number == 20) return "twenty";
        if(number == 30) return "thirty";
        if(number == 40) return "forty";
        if(number == 50) return "fifty";
        if(number == 60) return "sixty";
        if(number == 70) return "seventy";
        if(number == 80) return "eighty";
        else return "ninety";
    }
    
    private String threeDigitConverter(int number){

        int first_digit = number / 100;
        int left = number - first_digit*100;

        if (left == 0) return specialNumberConverter(first_digit) + " hundred";
        else return specialNumberConverter(first_digit) + " hundred and " + convert(left);

    }


    private String fourDigitConverter(int number){

        int thousands = number / 1000;
        int left = number - thousands*1000;

        if (left == 0) return specialNumberConverter(thousands) + " thousand";
        else return convert(thousands) + " thousand and " + convert(left);

    }

    private String fiveDigitConverter(int number){

        int millions = number / 1000000;
        int left = number - millions*1000000;

        if (left == 0) return specialNumberConverter(millions) + " million";
        else return convert(millions) + " million and " + convert(left);

    }

    private boolean isMultipleOfTen(int number){
        return (number % 10 == 0 ) && (number > 10);
    }

    private int takeMultipleOfTen(int num){
        return (num / 10) *10;
    }



}
