import java.util.*;

public class Task_3 {
    //Дана строка содержащая только символы '(', ')', '{', '}', '[' и ']', определите,
// является ли входная строка логически правильной.
// Входная строка логически правильная, если:
// 1) Открытые скобки должны быть закрыты скобками того же типа.
// 2) Открытые скобки должны быть закрыты в правильном порядке. Каждая закрывающая скобка имеет соответствующую
// открытую скобку того же типа.
// ()[] = true
// () = true
// {[()]} = true
// ()() = true
// )()( = false
    public static void main(String[] args) {
        Deque<Character> deque = new ArrayDeque<>(Arrays.asList('(', ')', '{', '}', '[', ']'));
        Deque<Character> deque2 = new ArrayDeque<>(Arrays.asList('(', '}', '{', '}', '[', ']'));
        System.out.println(validate(deque));
        System.out.println(validate(deque2));
    }

    public static boolean validate(Deque<Character> deque) {

        Deque<Character> d1 = new ArrayDeque<>();
        for (Character c : deque) {
            if (c == '(' || c == '{' || c == '[') {
                d1.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (d1.isEmpty()) {
                    return false;
                }
                char last = d1.pop();
                if ((c == ')' && last != '(') || (c == '}' && last != '{') || (c == ']' && last != '[')) {
                    return false;
                }
            }
        }
        return d1.isEmpty();
    }
}
