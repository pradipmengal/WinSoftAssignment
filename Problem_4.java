public class Problem_4 {
    public static void main(String[] args) {
        String text = "Welcomesffsdsdfssv";

        System.out.println("Duplicate characters in the string are:");
        findDuplicates(text);
    }

    public static void findDuplicates(String str) {
        str = str.toLowerCase();

        for (int i = 0; i < str.length(); i++) {
            char currentChar = str.charAt(i);

            if (Character.isLetter(currentChar) && str.indexOf(currentChar, i + 1) != -1) {
                if (str.indexOf(currentChar) == i) {
                    System.out.print(currentChar + " ");
                }
            }
        }
    }
}
