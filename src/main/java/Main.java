public class Main {

//    public static void main(String[] args) {
//        System.out.println("Ручной вызов метода: " + reverseLetter("123 !@#"));
//    }

    public static String reverseLetter(String valueRL) {

        if (valueRL == null) {
            return "Не удалось обработать текст: он не должен быть пустым.\n" +
                    "Проверьте ввод и попробуйте снова.";
        }

        char[] chars = valueRL.toCharArray();
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

//        System.out.println(new String(chars));
        return new String(chars);
    }
}