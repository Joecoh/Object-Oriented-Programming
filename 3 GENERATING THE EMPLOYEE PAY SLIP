import java.util.Scanner;

class Employee {
    String name;
    int id;
    String address;
    String mail;
    String mobile;
    float da, hra, pf, scf, gross, net;
    float b;

    void getdata() {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter name:");
        name = sc.next();
        System.out.println("Enter ID:");
        id = sc.nextInt();
        System.out.println("Enter address:");
        address = sc.next();
        System.out.println("Enter mail:");
        mail = sc.next();
        System.out.println("Enter mobile:");
        mobile = sc.next();
    }

    void calc(float basic) {
        b = basic;
        da = basic * 97 / 100;
        hra = basic * 10 / 100;
        pf = basic * 12 / 100;
        scf = basic * 0.1f / 100;
        gross = basic + da + hra + pf + scf;
        net = gross - pf;
    }

    void display() {
        System.out.println("**** Employee Details ****");
        System.out.println("Employee Name: " + name);
        System.out.println("Employee ID: " + id);
        System.out.println("Employee Address: " + address);
        System.out.println("Employee Mobile Number: " + mobile);
        System.out.println("Employee Mail ID: " + mail);
        System.out.println("Basic Pay: " + b);
        System.out.println("DA: " + da);
        System.out.println("HRA: " + hra);
        System.out.println("PF: " + pf);
        System.out.println("Staff Club Fund: " + scf);
        System.out.println("Gross Salary: " + gross);
        System.out.println("Net Salary: " + net);
    }
}

class Programmer extends Employee {
    float bp;

    Programmer() {
        bp = 2500;
    }
}

class Ap extends Employee {
    float bp;

    Ap() {
        bp = 5000;
    }
}

class Asso extends Employee {
    float bp;

    Asso() {
        bp = 7500;
    }
}

class Prof extends Employee {
    float bp;

    Prof() {
        bp = 10000;
    }
}

public class Emp {
    public static void main(String args[]) {
        Scanner sc = new Scanner(System.in);
        System.out.println("1. PROGRAMMER\n2. ASSISTANT PROFESSOR\n3. ASSOCIATE PROFESSOR\n4. PROFESSOR");
        System.out.println("Enter your choice:");
        int choice = sc.nextInt();

        switch (choice) {
            case 1:
                System.out.println("Enter the Programmer details:");
                Programmer ob1 = new Programmer();
                ob1.getdata();
                ob1.calc(ob1.bp);
                ob1.display();
                break;

            case 2:
                System.out.println("Enter the Assistant Professor details:");
                Ap ob2 = new Ap();
                ob2.getdata();
                ob2.calc(ob2.bp);
                ob2.display();
                break;

            case 3:
                System.out.println("Enter the Associate Professor details:");
                Asso ob3 = new Asso();
                ob3.getdata();
                ob3.calc(ob3.bp);
                ob3.display();
                break;

            case 4:
                System.out.println("Enter the Professor details:");
                Prof ob4 = new Prof();
                ob4.getdata();
                ob4.calc(ob4.bp);
                ob4.display();
                break;

            default:
                System.out.println("Invalid choice. Please enter a number between 1 and 4.");
                break;
        }
    }
}
