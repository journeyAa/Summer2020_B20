package day23_Arrays;

public class FrequencyOfChars {
    public static void main(String[] args) {

        String str = "ABCDECAAR";  // A3B3R1
        String nonDup = "";
        String result = "";

        for (int i = 0; i <= str.length() - 1; i++) {
            String ch = "" + str.charAt(i); //

            // if(!nonDup.contains(ch)){
            //   nonDup+=ch;

            if (nonDup.contains(ch)) {
                continue;
            } else {
                nonDup += ch;
            }


        }
        System.out.println(nonDup);
        // str = "ABCDECCAAR  nonDup = AB


        for (int j = 0; j < nonDup.length() - 1; j++) {
            char ch = nonDup.charAt(0);
            int count = 0;
            for (int i = 0; i <= str.length() - 1; i++) {
                if (str.charAt(i) == ch) {
                    count += 1;
                }

            }
            result += "" + nonDup.charAt(0) + count;
        }

    }


}



















