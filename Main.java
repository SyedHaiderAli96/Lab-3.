package javaapplication1;

import java.util.Date;
import java.util.List;
import java.util.ArrayList;
import java.util.Scanner;

public class Main {
    private static final int TOTAL_MARKS = 100;
    private static final double GPA_SCALE = 4.0;

    public static void main(String[] args) {
        // Run student grades calculation
        calculateStudentGrades();

        // Run rectangle test
        testRectangle();

        // You can add the ticket booking functionality here
    }

    private static void calculateStudentGrades() {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Enter student name: ");
        String studentName = scanner.nextLine();
        System.out.print("Enter obtained marks: ");
        int obtainedMarks = scanner.nextInt();
        
        double percentage = (double) obtainedMarks / TOTAL_MARKS * 100;
        String grade = calculateGrade(percentage);
        double gpa = calculateGPA(percentage);
        
        printMarkSheet(studentName, obtainedMarks, percentage, grade, gpa);
    }

    private static String calculateGrade(double percentage) {
        if (percentage >= 90) return "A";
        else if (percentage >= 80) return "B";
        else if (percentage >= 70) return "C";
        else if (percentage >= 60) return "D";
        else return "F";
    }

    private static double calculateGPA(double percentage) {
        return (percentage / 100) * GPA_SCALE;
    }

    private static void printMarkSheet(String studentName, int obtainedMarks, double percentage, String grade, double gpa) {
        System.out.println("\n--------- Mark Sheet ---------");
        System.out.println("Student Name: " + studentName);
        System.out.printf("Obtained Marks: %d\n", obtainedMarks);
        System.out.printf("Percentage: %.2f%%\n", percentage);
        System.out.println("Grade: " + grade);
        System.out.printf("GPA: %.2f\n", gpa);
        System.out.println("------------------------------");
    }

    private static void testRectangle() {
        Scanner scanner = new Scanner(System.in);
        Rectangle rectangle = new Rectangle();

        System.out.printf("Default Length: %.2f\n", rectangle.getLength());
        System.out.printf("Default Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Default Area: %.2f\n", rectangle.area());
        System.out.printf("Default Perimeter: %.2f\n", rectangle.perimeter());

        System.out.print("Enter new length: ");
        double length = scanner.nextDouble();
        rectangle.setLength(length);
        
        System.out.print("Enter new width: ");
        double width = scanner.nextDouble();
        rectangle.setWidth(width);

        System.out.printf("Updated Length: %.2f\n", rectangle.getLength());
        System.out.printf("Updated Width: %.2f\n", rectangle.getWidth());
        System.out.printf("Updated Area: %.2f\n", rectangle.area());
        System.out.printf("Updated Perimeter: %.2f\n", rectangle.perimeter());
    }

    // Rectangle class
    static class Rectangle {
        private double length;
        private double width;

        public Rectangle() {
            this.length = 1.0;
            this.width = 1.0;
        }

        public double getLength() {
            return length;
        }

        public void setLength(double length) {
            if (length > 0.0 && length < 20.0) {
                this.length = length;
            } else {
                System.out.println("Length must be greater than 0.0 and less than 20.0.");
            }
        }

        public double getWidth() {
            return width;
        }

        public void setWidth(double width) {
            if (width > 0.0 && width < 20.0) {
                this.width = width;
            } else {
                System.out.println("Width must be greater than 0.0 and less than 20.0.");
            }
        }

        public double area() {
            return length * width;
        }

        public double perimeter() {
            return 2 * (length + width);
        }
    }

    // Ticket booking classes
    interface CommonFunctions {
        void searchTicket();
        void bookTicket();
        void cancelTicket();
        void makePayment();
        void fillDetails();
    }

    static class Customer {
        private String customerId;
        private String name;
        private String address;
        private int phoneNo;
        private int age;
        private List<Ticket> tickets;

        public Customer(String customerId, String name, String address, int phoneNo, int age) {
            this.customerId = customerId;
            this.name = name;
            this.address = address;
            this.phoneNo = phoneNo;
            this.age = age;
            this.tickets = new ArrayList<>();
        }

        // Add methods for adding and modifying details
    }

    static class Agent implements CommonFunctions {
        private int id;
        private String name;

        public Agent(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public void searchTicket() {}
        @Override
        public void bookTicket() {}
        @Override
        public void cancelTicket() {}
        @Override
        public void makePayment() {}
        @Override
        public void fillDetails() {}
    }

    static class Ticket {
        private String source;
        private String destination;
        private Date dateOfJourney;
        private String time;
        private String busNo;
        private String seatNo;

        public Ticket(String source, String destination, Date dateOfJourney, String time, String busNo, String seatNo) {
            this.source = source;
            this.destination = destination;
            this.dateOfJourney = dateOfJourney;
            this.time = time;
            this.busNo = busNo;
            this.seatNo = seatNo;
        }
    }

    static class BookingCounter {
        private List<Ticket> bookedTickets;

        public BookingCounter() {
            this.bookedTickets = new ArrayList<>();
        }

        public List<Ticket> getBookedTickets() {
            return bookedTickets;
        }

        public void setBookedTickets(List<Ticket> bookedTickets) {
            this.bookedTickets = bookedTickets;
        }
    }

    static class Refund {
        private float amount;
        private String customerId;

        public Refund(float amount, String customerId) {
            this.amount = amount;
            this.customerId = customerId;
        }

        public void refundAmount() {
            // Implement refund logic
        }
    }
}

