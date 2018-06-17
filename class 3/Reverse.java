class Reverse{
       public static void main(String[] args) {
        int num = 63155, revNum = 0, tempNum, lastDigit;
        while (num != 0) {
            tempNum = num / 10;
            lastDigit = num % 10;
            revNum = revNum * 10 + lastDigit;
            num = tempNum;
        }

        System.out.println("The Reverse Of A Given Number Is " + revNum);
    }

}