package oops.com;

interface Attendance {

    void markAttendance();
}

class Developer implements Attendance {

    @Override
    public void markAttendance() {
        System.out.println("Developer attendance marked.");
        System.out.println("Role: Developer");
    }
}

class Tester implements Attendance {

    @Override
    public void markAttendance() {
        System.out.println("Tester attendance marked.");
        System.out.println("Role: Tester");
    }
}

class Manager implements Attendance {

    @Override
    public void markAttendance() {
        System.out.println("Manager attendance marked.");
        System.out.println("Role: Manager");
    }
}

public class AttendanceDemo {

    public static void main(String[] args) {

        Attendance employee;

        employee = new Developer();
        employee.markAttendance();

        System.out.println();

        employee = new Tester();
        employee.markAttendance();

        System.out.println();

        employee = new Manager();
        employee.markAttendance();
    }
}