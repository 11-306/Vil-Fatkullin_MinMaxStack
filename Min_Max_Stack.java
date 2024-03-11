import java.util.LinkedList;
import java.util.Deque;

public class Min_Max_Stack {
    private final Deque<Integer> data;
    private final Deque<Integer> max;
    private final Deque<Integer> min;

    Min_Max_Stack() {
        data = new LinkedList<>();
        max = new LinkedList<>();
        min = new LinkedList<>();

    }

    void push(int x) {
        data.push(x);
        if (min.isEmpty() || min.peek() > x) {
            min.push(x);
        }
        if (max.isEmpty() || max.peek() < x) {
            max.push(x);
        }
    }

    void pop() {
        if (!data.isEmpty()) {
            int temp = data.pop();
            if (temp == min.peek()) {
                min.pop();
            }
            if (temp == max.peek()) {
                max.pop();
            }
        } else {
            throw new IllegalArgumentException("Стек пустой!");
        }
    }

    int min() {
        return min.peek();
    }

    int max() {
        return max.peek();
    }
}


