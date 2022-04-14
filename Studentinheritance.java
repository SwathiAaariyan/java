interface Java {
  int sem1=40;
  int sem2=75;
  public void myReport1(); 
}

interface Operatingsystems {
  int sem1=60;
  int sem2=100;
  public void myReport2(); 
}

class  Report implements Java,Operatingsystems {
  public void marklist1() {
    System.out.println("Java                 //interface1");
    System.out.println("\tSemester 1: " + sem1);
    System.out.println("\tSemester 2: " + sem2);
  }
  public void marklist2() {
   System.out.println("Java                 //interface2");
    System.out.println("\tSemester 1: " + sem1);
    System.out.println("\tSemester 2: " + sem2);
  }
}

class Teacher extends Report{
  public void display(){
    System.out.println("Total                     //inheritance");
System.out.println("\tTotal 1 Semester = " + (sem1+sem2));
    System.out.println("\tTotal 2 Semester = " + (sem1+sem2));
  }
}

class Studentinheritance {
  public static void main(String[] args) {
    Report vac = new Report();
    vac.myReport1();
    vac.myReport2();
    Teacher tot = new Teacher();
    tot.display();
}
}