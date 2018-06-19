public class Vowels_Removal {

    public static void main(String args[]) {

        String str1 = "hey world! this is Vidhi Sinha";

        char ch2[] = new char[str1.length()];
        int j = 0, k = 0;
        for (int i = 0; i < str1.length(); i++) {
            char temp = str1.charAt(j);
            if (temp == 'a' || temp == 'e' || temp == 'i' || temp == 'o' || temp == 'u') {
                j++;
            } else {
                ch2[k] = str1.charAt(j);
                j++;
                k++;
            }
        }
        String str2 = new String(ch2);

        System.out.println("String without vowel is " + str2);

    }
}