public class Main {
    public static void main(String[] args) {
        Min_Max_Stack stack = new Min_Max_Stack();
        stack.push(13);
        stack.push(35);
        stack.pop();
        stack.push(57);

        System.out.println("Максимальное число: " + stack.max());
        System.out.println("Минимальное число: " + stack.min());

        stack.push(90);
        stack.pop();
        stack.push(20);
        stack.push(2);
        stack.pop();
        stack.push(10);

        System.out.println("Максимальное число: " + stack.max());
        System.out.println("Минимальное число: " + stack.min());
    }
}
