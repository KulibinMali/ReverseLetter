public class Main {
    public static void main(String[] args) {

        char[] chars = "J@va the be$t!123".toCharArray();
        int left = 0;
        int right = chars.length - 1;

        while (left < right) {
            if (Character.isLetter(chars[left])) {

                if (Character.isLetter(chars[right])) {
                    char tmp = chars[left];
                    chars[left] = chars[right];
                    chars[right] = tmp;
                    left++;
                }
                right--;
            } else {
                left++;
            }
        }

        System.out.println(new String(chars));
    }
}