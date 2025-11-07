package Stack;

public class StaticStack {

    protected char[] arr;
    private final int size;
    private int top;

    public StaticStack(int size) {
        this.size = size;
        top = -1;
        arr = new char[size];
    }

    public void push(char c) {
        if (top == arr.length - 1) {
            System.out.println("Dizi dolu. Eleman eklenemez!");
        } else {
            for (top = -1; top < size; top++) {
                arr[++top] = c;
            }
        }
    }

    public char pop() {
        if (top == -1) {
            System.out.println("Dizi boş!");
            return ' ';
        } else {
            return arr[--top];
        }
    }

    public char peek() {
        top = -1;
        if (top == -1) {
            System.out.println("Stack boş!");
            return ' ';
        } else {
            return arr[top];
        }

    }
}
