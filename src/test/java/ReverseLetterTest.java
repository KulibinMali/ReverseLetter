import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;

class ReverseLetterTest {

    private final Main revers = new Main();

    //Обычный случай — пример из условия: "J@va the be$t!123" → "t@eb eht av$J!123"
    @Test
    void returnDefaultRevers() {
        String result = revers.reverseLetter("J@va the be$t!123");
        assertEquals("t@eb eht av$J!123", result);
    }

    //Пустая строка "" — результат тоже пустая строка.
    @Test
    void returnEmptyString() {
        String result = revers.reverseLetter("");
        assertEquals("", result);
    }

    //Одна буква "a" — остаётся как есть.
    @Test
    void returnOneLetter() {
        String result = revers.reverseLetter("a");
        assertEquals("a", result);
    }

    //Строка без букв "123 !@#" — ничего не меняется
    @Test
    void returnNoLetters() {
        String result = revers.reverseLetter("123 !@#");
        assertEquals("123 !@#", result);
    }

    //Только буквы "abcd" → "dcba" (обычный разворот).
    @Test
    void returnReverseOnlyLetters() {
        String result = revers.reverseLetter("abcd");
        assertEquals("dcba", result);
    }

    //Небуквенные символы по краям и в середине — проверьте, что они остались на своих позициях.
    @Test
    void returnStaticSymbolsPositions() {
        String result = revers.reverseLetter("!ab7cd?");
        assertEquals("!dc7ba?", result);
    }

    //Регистр — буквы меняются местами вместе со своим регистром (заглавная едет туда, куда едет буква).
    @Test
    void returnStaticUppLowCase() {
        String result = revers.reverseLetter("!Ab7cD?");
        assertEquals("!Dc7bA?", result);
    }

    //Подумайте, как ваш метод должен вести себя на null, и при необходимости добавьте тест и на этот случай.
    @Test
    void returnExpectNull() {
        String result = revers.reverseLetter(null);
        assertEquals("Не удалось обработать текст: он не должен быть пустым.\n" +
                "Проверьте ввод и попробуйте снова.", result);
    }

}







