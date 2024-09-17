import AdapterObjects.*;

import java.util.Scanner;

public class Main {
    public static void main(String[] args){
     Scanner scan = new Scanner(System.in);

        AttendanceSystem attendanceSystem = new AttendanceSystem();
        AttendanceSystemAdapter attendance = new AttendanceSystemAdapter(attendanceSystem);

        GradingSystem gradingSystem = new GradingSystem();
        GradingSystemAdapter grades = new GradingSystemAdapter(gradingSystem);

        LibrarySystem librarySystem = new LibrarySystem();
        LibrarySystemAdapter library = new LibrarySystemAdapter(librarySystem);
        Boolean stop = false;

        while(!stop){
            System.out.println("1.Attendance");
            System.out.println("2.Grades");
            System.out.println("3.Library");
            System.out.println("4.Exit");
            System.out.println("Select an option: ");
            int option = scan.nextInt();

            switch (option){
                case 1:
                    attendance.integrateSystem();
                    break;
                case 2:
                     grades.integrateSystem();
                     break;
                case 3:
                     library.integrateSystem();
                     break;
                case 4: stop = true;
                    break;
            }
        }

    }

}
