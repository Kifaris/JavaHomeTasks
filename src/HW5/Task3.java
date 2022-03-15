package HW5;

public class Task3 {
    public static void main(String[] args) {
        String s = "В предложении все слова разной длины";
        String[] word = s.split(" ");
        int len = 0, count = 0;
        for (int i = 0; i < word.length; i++) {
            if (word[i].length() > len) {
                len = word[i].length();
                count = i;
            }
        }
        System.out.println("Самое длинное слово: " + word[count]);
    }
}
