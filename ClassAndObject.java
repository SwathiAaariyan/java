import java.io.*; 
import java.util.*; 
class Student //display() setName() setAge() setMarks()-overloaded calculateTotal() 
{ 
    String name; 
    int age,m1,m2,m3,flag; 
    int[] marks; 
    static Scanner sc = new Scanner(System.in); 
    Student() 
    { 
        name = "unknown"; 
        age = 23; 
        m1=m2=m3=0; 
        flag = 0; 
        marks = new int[5]; 
    } 
    Student(String name,int age) 
    { 
        this.name = name; 
        this.age = age; 
        m1=m2=m3=0; 
        flag = 0; 
        marks = new int[5]; 
    } 
    public void display() 
    { 
        System.out.println('\n' +"Name: "+ name + '\n' + "Age: " + age + '\n' + "Total: " +  calculateTotal()+'\n'); 
    } 
    public void setName() 
    { 
        System.out.println("Enter the name: "); 
    name = sc.next(); 
    } 
    public void setAge() 
    { 
        System.out.println("Enter the age: "); 
        age = sc.nextInt(); 
    }
    public void setMarks(int a,int b,int c) 
    { 
        flag = 1; 
        m1 = a; 
        m2 = b; 
        m3 = c; 
    } 
    public void setMarks(int arr[]) 
    { 
        int i=0; 
        flag = 2; 
        for(int a: arr) 
        { 
        marks[i]=a; 
        i++; 
        } 
    } 
    public int calculateTotal() 
    { 
        int total=0; 
        if(flag==1) 
        { 
        total = m1 + m2 + m3; 
        } 
        else 
        { 
        for(int a:marks) 
        total += a; 
        } 
        return total; 
    } 
} 
public class ClassAndObject { 
    public static void main(String[] args) {
        System.out.println("\n-- CLASSES AND OBJECTS --\n"); 
        Student h = new Student(); 
        h.setName(); 
        h.setAge(); 
        h.setMarks(88,86,87); 
        h.display(); 
        Student g = new Student("devan",22); 
        g.setMarks(new int[]{50,50,50,50,50}); 
        g.display(); 
    } 
}