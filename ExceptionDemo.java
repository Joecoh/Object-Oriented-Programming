class MyException extends Exception {
    String str1;

    MyException(String str2) {
        str1 = str2;
    }

    @Override
    public String toString() {
        return "MyException Occurred: " + str1;
    }
}

class ExceptionDemo {
    public static void main(String args[]) {
        try {
            System.out.println("Starting of try block");
            
            throw new MyException("This is My Error Message");
        } catch (MyException exp) {
            System.out.println("Catch Block");
            System.out.println(exp);
        }
    }
}
