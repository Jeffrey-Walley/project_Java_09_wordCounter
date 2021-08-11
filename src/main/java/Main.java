// project 09 Word Counter                    from Get Coding Fast   https://www.youtube.com/watch?v=_y7gvwch2r0&list=PLtQo0sxRN7JKKla3_GAF05dySjyy3nINa&index=9
/*
  1. get string input from user
  2. count number of words in string
      a. count window of width 2?
      b. search for '_' patterns
      c. add 1 for the first word of trimmed string (to account for 0 indexing)
 */
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        System.out.println("If you will be kind enough to please enter a phrase, sentence, or paragraph: ");
        Scanner scannyString = new Scanner(System.in);
        String inputString = scannyString.nextLine();
        scannyString.close();
        inputString = inputString.trim();
        int stringCount = 0;
        if (inputString.length() == 0) {
            stringCount = 0;
        } else {
            // count the first work because of window count 'approach'
            stringCount++;
          for (int i = 0; i < inputString.length(); i++) {
              if (inputString.charAt(i) == ' '
                  && inputString.charAt(i + 1) != ' ') {
                    stringCount++;
              }

            }
        }
        System.out.println("here is your final word count: " + stringCount);


    }
}
