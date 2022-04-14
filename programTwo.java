import java.io.*;
import java.util.*;
interface simple
     {
      void display();
      }

class newUser implements simple
        {
 void login()
           {
  System.out.println("**Enter your name:");
  Scanner sc = new Scanner(System.in);
  String name= sc.nextLine();
  System.out.println("\n**Enter your Password:");
  String password= sc.nextLine();
  display();
            }
 public void display()
             {
   System.out.println("\nYour account has been signedup <successfully!>\nRedirecting You to the homePage...");
              }
        }
 

class existingUser extends newUser implements simple
          {
   void login()
             {
 String details[]={"suresh,3000","sandhanam,1244"};
  System.out.println("\n*** ---- Welcome to the user login module ---- *** \n\n\tEnter your username and password to continue \n\n\t | User Name:");
Scanner sc = new Scanner(System.in);
String user=sc.nextLine();
//System.out.println(user);
System.out.println("\n\n\t| Password:");
String password=sc.nextLine();
//System.out.println(password);
for(int i=0;i<details.length;i++)
     {
  String[] temp=details[i].split(",");
   if(temp[i].equals(user) && temp[i+1].equals(password))
             {
                  userdisplay();
                  break;
             }
         else
                   {
                   System.out.println("\n\tInvalid user id or password !\t..\nEnter YES to create new account or NO to quit : ");
                   String c= sc.nextLine();
                   if(c.equalsIgnoreCase("yes"))
                     {
                   System.out.println("** Create an account **");
                   super.login();
                   break;
                     }
                    else
                      {
                    System.out.println(" Thank You !... ");
                        }
                   }
    }
             }
             public void userdisplay()
             
             {
                 System.out.println("\n\n*** ---- Welcome to Tce.net ----***");
                 System.out.println("\n\nDear user Sorry for the inconvenience The server is under construction \n\nPlease try again later...");
             }
                
            }
 
       

public class programTwo
             {
    public static void main(String args[])
                 {
             existingUser eu = new existingUser();
             eu.login();
             
                    }
               }