public class GFG {

    static void printPermutn(String str, String ans)

  {
        if (str.length() == 0) {

            System.out.print(ans + " ");

            return;

        }
 

        for (int i = 0; i < str.length(); i++) {
 

            // ith character of str

            char ch = str.charAt(i);

            String ros = str.substring(0, i) +

                        str.substring(i + 1);
 

            // Recursive call

            printPermutn(ros, ans + ch);

        }

    }
 

    // Driver code

    public static void main(String[] args)

    {

        String s = "abb";

        printPermutn(s, "");

    }
  }
