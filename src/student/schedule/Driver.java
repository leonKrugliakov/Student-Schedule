//*****************************************************************************************************
//
//      File:            Driver.java
//
//      Student:         Leon Krugliakov
//
//      Assignment:      Assignment #3
//
//      Course Name:     Java I
//
//      Course Number:   COSC 2050 - 01
//
//      Due:             February 12, 2020
//
//
//      This program takes in user input and organizes it into
//      a list to output to the user. It also counts how many classes
//      the user signed up for. It also validates the user's input
//      each time.
//
//      Other files required:
//      1.  Instructor.java  -  Contains the Instructor Class
//      2.  CourseSection.java  -  Contains the Course Section Class
//
//*****************************************************************************************************

//package student.schedule;

import java.util.InputMismatchException;
import java.util.Scanner;

public class Driver 
{
    public static void main(String[] args) 
    {
        String studentName,
                studentID,
                courseName,
                instructorName,
                instructorPhone,
                instructorOffice,
                anotherClass,
                result = "";
        int sectionNumber;
        boolean addAnother = true;
        Scanner sc = new Scanner(System.in);
        Instructor inst = new Instructor();
        CourseSection course = new CourseSection();
        
        System.out.println("Enter student name: \n");
        studentName = sc.nextLine();
        System.out.println("Enter student ID: \n");
        studentID = sc.nextLine();
        
        while(addAnother)
        {
            courseName = getRequiredString(sc, "Enter Course Name: \n");
            sectionNumber = getIntWithinRange(sc, "Section Number: \n", 0, 20);
            sc.nextLine();
            instructorName = getRequiredString(sc, "Enter Instructor's Name:\n");
            instructorPhone = getRequiredString(sc, "Phone number: \n");
            instructorOffice = getRequiredString(sc, "Office location: \n");
            anotherClass = getChoiceString(sc, "Another class?", "y", "n");
            
            
            
            inst.setName(instructorName);
            inst.setOffice(instructorOffice);
            inst.setPhoneNumber(instructorOffice);
            course.setCourseName(courseName);
            course.setInstructor(inst);
            course.setSectionNumber(sectionNumber);
            course.incrementCourseNumber();
            
            if(anotherClass.equalsIgnoreCase("n"))
            {
                addAnother = false;
            }
            
            result = result + course.toString() + "\n";
        }
        
        System.out.println("Class list for " + studentName + ", " + studentID);
        System.out.println(result);
        System.out.println("\n\n-----\n" + course.getSectionCount() 
                + " classes");
    }
    
    //*****************************************************************************************************
    
    public static int getInt(Scanner sc, String prompt)
    {
        boolean valid = false;
        int input = 0;
        
        while(!valid)
        {
            
            try
            {
                System.out.print(prompt);
                input = sc.nextInt();
                valid = true;
            }
            catch(InputMismatchException e)
            {
                System.out.println("The input you have eneterd is invalid, "
                        + "it must be an integer. Try again!");
                sc.nextLine();
                continue;
            }
            
        }
        
        return input;
    }
    
    //*****************************************************************************************************
    
    public static int getIntWithinRange(Scanner sc, 
            String prompt, int min, int max)
    {
        boolean valid = false;
        int input = 0;
        
        while(!valid)
        {
            
            input = getInt(sc, prompt);
            
            if(input <= min)
            {
                System.out.println("The input you have entered cannot be "
                        + "lower than " + min + ", please try again!");
            }
            else if(input >= max)
            {
                System.out.println("The input you have entered cannot be "
                        + "higher than " + max + ", please try again!");
            }
            else
            {
                valid = true;
            }
            
        }
        
        return input;
    }

    //*****************************************************************************************************
    
    public static String getRequiredString(Scanner sc, String prompt)
    {
        String input = "";
        boolean valid = true;
        
        while(valid){
            
            System.out.print(prompt);
            input = sc.nextLine();
            
            if(input.isEmpty())
            {
                System.out.println("Please enter an input, this line can't "
                        + "be left blank!");
                valid = true;
                sc.nextLine();
            }
            else if(!input.isEmpty())
            {
                valid = false;
            }
            
        }
        
        return input;
        
    }

    //*****************************************************************************************************
    
    public static String getChoiceString(Scanner sc, 
            String prompt, String s1, String s2)
    {
        String input = "";
        boolean valid = false;
        
        while(!valid)
        {
            input = getRequiredString(sc, prompt);
            if(input.equalsIgnoreCase(s1))
            {
                valid = true;
            }
            else if(input.equalsIgnoreCase(s2))
            {
                valid = true;
            }
            else
            {
                System.out.println("The input you have entered is invalid. "
                        + "Please enter 'y' or 'n' as your answer!");
                valid = false;
            }
        }
        
        return input;
    }
}

/*
Enter student name: 

Leon
Enter student ID: 

111111
Enter Course Name: 
Java 1
Section Number: 
01
Enter Instructor's Name:
Professor Doe
Phone number: 
314-000-0000
Office location: 
EAB 432
Another class?y
Enter Course Name: 
World History
Section Number: 
02
Enter Instructor's Name:
Professor Binns
Phone number: 
314-111-1111
Office location: 
5th floor
Another class?y
Enter Course Name: 
Defense against the dark arts
Section Number: 
01
Enter Instructor's Name:
Remus Lupin
Phone number: 
314-999-9999
Office location: 
North Tower
Another class?n
Class list for Leon, 111111
Java 1, section 1, Instructor: Professor Doe, EAB 432, EAB 432
World History, section 2, Instructor: Professor Binns, 5th floor, 5th floor
Defense against the dark arts, section 1, Instructor: Remus Lupin, North Tower, North Tower
*/