import java.util.*;

class StackADT {
    int array[];
    int top, size, len;
    Scanner in = new Scanner(System.in);

    public StackADT(int n) {
        size = n;
        len = 0;
        array = new int[size];
        top = -1;
    }

    public boolean isEmpty() {
        return top == -1;
    }

    public boolean isFull() {
        return top == size - 1;
    }

    public int getSize() {
        return len;
    }

    public int peek() {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        return array[top];
    }

    public void push() {
        if (top + 1 >= size)
            throw new IndexOutOfBoundsException("Overflow Exception");
        if (top + 1 < size) {
            System.out.println("Enter integer element to push");
            array[++top] = in.nextInt();
        }
        len++;
    }

    public int pop() {
        if (isEmpty())
            throw new NoSuchElementException("Underflow Exception");
        len--;
        return array[top--];
    }

    public void display() {
        System.out.print("\nStack = ");
        if (len == 0) {
            System.out.print("Empty\n");
            return;
        }
        for (int i = top; i >= 0; i--)
            System.out.print(array[i] + " ");
        System.out.println();
    }
}

public class Imp_Stack{
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Stack Test\n");
        System.out.println("Enter Size of Integer Stack");
        int n = scan.nextInt();
        StackADT stk = new StackADT(n);
        char ch;
        do {
            System.out.println("\nStack Operations");
            System.out.println("1. push");
            System.out.println("2. pop");
            System.out.println("3. peek");
            System.out.println("4. check empty");
            System.out.println("5. check full");
            System.out.println("6. size");
            int choice = scan.nextInt();
            switch (choice) {
                case 1:
                    try {
                        stk.push();
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 2:
                    try {
                        System.out.println("Popped Element = " + stk.pop());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 3:
                    try {
                        System.out.println("Peek Element = " + stk.peek());
                    } catch (Exception e) {
                        System.out.println("Error: " + e.getMessage());
                    }
                    break;
                case 4:
                    System.out.println("Empty status = " + stk.isEmpty());
                    break;
                case 5:
                    System.out.println("Full status = " + stk.isFull());
                    break;
                case 6:
                    System.out.println("Size = " + stk.getSize());
                    break;
                default:
                    System.out.println("Wrong Entry\n");
                    break;
            }
            stk.display();
            System.out.println("\nDo you want to continue (Type y or n)\n");
            ch = scan.next().charAt(0);
        } while (ch == 'Y' || ch == 'y');
    }
}
