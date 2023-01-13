//*****************************************************************************************************
//
//      File:            CourseSection.java
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
//      2.  Driver.java  -  Contains the Main Method
//
//*****************************************************************************************************

//package student.schedule;

public class CourseSection 
{
    private String courseName;
    private int sectionNumber;
    private static int sectionCount = 0;
    private Instructor inst = new Instructor();
    
    //*****************************************************************************************************
    
    public String getCourseName()
    {
        return this.courseName;
    }
    
    //*****************************************************************************************************
    
    public Instructor getInstructor()
    {
        return inst;
    }
    
    //*****************************************************************************************************
    
    public int getSectionNumber()
    {
        return sectionNumber;
    }
    
    //*****************************************************************************************************
    
    public static int getSectionCount()
    {
        return sectionCount;
    }
    
    //*****************************************************************************************************
    
    public void setCourseName(String courseName)
    {
        this.courseName = courseName;
    }
    
    //*****************************************************************************************************
    
    public void setInstructor(Instructor inst)
    {
        this.inst = inst;
    }
    
    //*****************************************************************************************************
    
    public void setSectionNumber(int sectionNumber)
    {
        this.sectionNumber = sectionNumber;
    }
    
    //*****************************************************************************************************
    
    public void incrementCourseNumber()
    {
        sectionCount++;
    }
    
    //*****************************************************************************************************
    
    CourseSection(String courseName, Instructor inst)
    {
        this.courseName = courseName;
        this.inst = inst;
    }
    
    //*****************************************************************************************************
    
    CourseSection()
    {
        courseName = " ";
        inst = new Instructor();
    }
    
    //*****************************************************************************************************
    
    @Override
    public String toString()
    {
        String output = courseName + ", section " + sectionNumber + 
                ", Instructor: " + inst.toString();
        return output;
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