import java.util.regex.Matcher;
import java.util.regex.Pattern;

public class Main {


    public static void main(String[] args) {

        String stringTest = "\\bЛ[а-яА-Я]+\\b";
        String stringTest = "\\bЛ[а-яА-Я]+\\b";
        String stringTest = "\\bЛ[а-яА-Я]+\\b";
        String stringTest = "\\bЛ[а-яА-Я]+\\b";
        String stringTest = "\\bЛ[а-яА-Я]+\\b";
        String stringTest = "\\bЛ[а-яА-Я]+\\b";
        String text = "Рекс Лорд Лом Шарик Бобик Шалун";
        Pattern pattern = Pattern.compile(stringTest);
        Matcher matcher = pattern.matcher(text);
        while (matcher.find()) {
            System.out.println("Нашли слово" + " " + matcher.group());
        }
    }
}