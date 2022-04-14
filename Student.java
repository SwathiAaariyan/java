import java.lang.*;
import java.util.Scanner;
class Students{
    int rollnum;
    String name;
    String dept;
   public Students(int rollnum, String name, String dept){
       this.rollnum=rollnum;
       this.name=name;
       this.dept=dept;
   }
   
    public void printValues() {
        System.out.println("Name: "+name+"\nRollno: "+rollnum+"\nDepartment Name: "+dept);;
    }
    public static void main(String args[]){
        Students st=new Students();
        Marks m=new Marks();
        String s1;
        Scanner input=new Scanner(System.in);
        System.out.println("Enter Rollno: ");
        int rollnum=input.nextInt();
        System.out.println("Enter Name: ");
        String name=input.next();
        System.out.println("Enter Department Name: ");
        String dept=input.next();
        st.printValues();
        m.getValues();
        m.totalValue();
        m.averageValue();
        m.gradeValue();
        s1=m.gradeValue();
    }
}
class Marks{
    int a1,a2,a3;
    int tot;
    int avg;
    Scanner input=new Scanner(System.in);
    public void getValues(){
        System.out.println("Enter I Mark: ");
        int a1=input.nextInt();
        System.out.println("Enter II Mark: ");
        int a2=input.nextInt();
        System.out.println("Enter III Mark: ");
        int a3=input.nextInt();
    }
    public int totalValue(int a1,int a2,int a3){
        if(a1<40 || a2<40 || a3<40)
            tot=0;
        else
            tot=a1+a2+a3;
        return tot;
    }//totalValue() end
    public int averageValue(int tot){
        if(tot>1)
            avg=tot/3;
        return (int) avg;
    }
    public <avg> void gradeValue(int avg){
        if(avg>50)
            System.out.println("A++");
        else if(avg<50)
            System.out.println("B++");
    }
    public String gradeValue(int avg){
        String s1="Arrear Occured";
        if(avg==0)
            return s1;
    }
}