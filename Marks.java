package Project2;
//We have to calculate the average of marks obtained in three subjects by student A and by student B
//  Create class 'Marks' with an abstract method 'getPercentage' that will be returning the average percentage of marks.
//Provide implementation of abstract method in classes 'A' and 'B'.
//The constructor of student A takes the marks in three subjects as its parameters
//and the marks in four subjects as its parameters for student B. Test your code


abstract public class Marks {
    double subject1grade;
    double subject2grade;
    double subject3grade;
    double subject4grade;
    void getPercentage (){
        System.out.println((subject1grade+subject2grade+subject3grade)/3);
    }
}
class A extends Marks {
    public static void main(String[] args) {
        A a=new A(95,91,96);
        a.getPercentage();
    }

    A (double subject1grade, double subject2grade, double subject3grade) {
        this.subject1grade=subject1grade;
        this.subject2grade=subject2grade;
        this.subject3grade=subject3grade;

    }
}
class B extends Marks {
    public static void main(String[] args) {
        B b = new B(88, 99, 70, 97);
        b.getPercentage();
    }

    B(double subject1grade, double subject2grade, double subject3grade, double subject4grade) {
        this.subject1grade=subject1grade;
        this.subject2grade=subject2grade;
        this.subject3grade=subject3grade;
        this.subject4grade=subject4grade;
    }

    void getPercentage() {
        System.out.println((subject1grade + subject2grade + subject3grade+subject4grade) / 4);
    }
}