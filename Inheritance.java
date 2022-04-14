interface FirstCounter {
  int dose11=40;
  int dose21=75;
  public void myReport1(); 
}

interface SecondCounter {
  int dose12=60;
  int dose22=100;
  public void myReport2(); 
}

class Report implements FirstCounter, SecondCounter {
  public void myReport1() {
    System.out.println("Counter 1                 //interface1");
    System.out.println("\tDose 1: " + dose11);
    System.out.println("\tDose 2: " + dose21);
  }
  public void myReport2() {
    System.out.println("Counter 2                 //interface2");
    System.out.println("\tDose 1: " + dose12);
    System.out.println("\tDose 2: " + dose22);
  }
}

class TotalVac extends Report{
  public void display(){
    System.out.println("Total                     //inheritance");
System.out.println("\tTotal 1st dose = " + (sem1));
    System.out.println("\tTotal 2nd dose = " + (dose21+dose22));
  }
}

class Inheritance {
  public static void main(String[] args) {
    Report vac = new Report();
    vac.myReport1();
    vac.myReport2();
    TotalVac tot = new TotalVac();
    tot.display();
}
}