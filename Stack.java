import java.io.*;
import java.util.*;

class Stack<T> {

    ArrayList<T> A;

    int top = -1;

    int size;

    Stack(int size) {
        this.size = size;
        this.A = new ArrayList<T>(size);
    }

    void push(T X) {
        if (top + 1 == size) {
            System.out.println("Stack Overflow");
        } else {
            top = top + 1;
            if (A.size() > top)
                A.set(top, X);
            else
                A.add(X);
        }
    }

    T top() {
        if (top == -1) {
            System.out.println("Stack Underflow");
            return null;
        } else
            return A.get(top);
    }

    void pop() {
        if (top == -1) {
            System.out.println("Stack Underflow");
        } else {
            top--;
        }
    }

    boolean empty() {
        return top == -1;
    }

    @Override
    public String toString() {
        StringBuilder ans = new StringBuilder();
        for (int i = 0; i <= top; i++) {
            ans.append(A.get(i)).append(" -> ");
        }
        return ans.toString();
    }
}

public class GFG {
    public static void main(String[] args) {
        Stack<Integer> s1 = new Stack<>(3);
        s1.push(10);
        s1.push(20);
        s1.push(30);

        System.out.println("s1 after pushing 10, 20, and 30:\n" + s1);

        s1.pop();
        System.out.println("s1 after pop:\n" + s1);

        Stack<String> s2 = new Stack<>(3);
        s2.push("hello");
        s2.push("world");
        s2.push("java");

        System.out.println("\ns2 after pushing 3 elements:\n" + s2);

        s2.push("GFG");
        System.out.println("s2 after pushing 4th element:\n" + s2);

        Stack<Float> s3 = new Stack<>(2);
        s3.push(100.0f);
        s3.push(200.0f);

        System.out.println("\ns3 after pushing 2 elements:\n" + s3);

        System.out.println("Top element of s3:\n" + s3.top());
    }
}
