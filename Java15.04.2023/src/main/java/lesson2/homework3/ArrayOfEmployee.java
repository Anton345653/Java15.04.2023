package lesson2.homework3;



public class ArrayOfEmployee {
    public static void main(String[] args) {
        Employee[] employees = new Employee[5];
        employees[0] = new Employee(
                "Ivanov Ivan",
                "Engineer",
                "ivivan@mailbox.com",
                89231231,
                30000,
                30
        );
        employees[1] = new Employee(
                "Petrov Petr",
                "Manager",
                "petrov@mailbox.com",
                892316485,
                50000,
                43
        );
        employees[2] = new Employee(
                "Pupkin Pupa",
                "Designer",
                "pupkin@mailbox.com",
                823382054,
                40000,
                25
        );
        employees[3] = new Employee(
                "Popova Natalia",
                "Auditor",
                "popova@mailbox.com",
                863055912,
                45000,
                53);
        employees[4] = new Employee(
                "Gromov Vladimir",
                "Head of department",
                "gromov@mailbox.com",
                890300303,
                100000,
                47);

        for (Employee e : employees) {
            if (e.age > 40) {
                e.information();
                System.out.println();
            }

        }
    }
}