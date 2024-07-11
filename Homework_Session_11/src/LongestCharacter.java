public class LongestCharacter {
    public static void main(String[] args) {
        String text = "the longest word";
        System.out.println("The longest word is " + findLongestWord(text));
    }

    public static String findLongestWord(String text) {
        if (text == null || text.isEmpty()) {
            return "";
        }

        String[] words = text.split("\\s+");
        String longestWord = "";

        for (String word : words) {
            if (word.length() > longestWord.length()) {
                longestWord = word;
            }
        }

        return longestWord;
    }
}

