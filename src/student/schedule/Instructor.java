//*****************************************************************************************************
//
//      File:            Instructor.java
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
//      1.  Driver.java  -  Contains the Main method
//      2.  CourseSection.java  -  Contains the Course Section Class
//
//*****************************************************************************************************

//package student.schedule;

public class Instructor 
{
    private static int counter = 0;
    private String name,
            phoneNumber,
            office;

    //*****************************************************************************************************
    
    public String getName()
    {
        return this.name;
    }

    //*****************************************************************************************************
    
    public String getPhoneNumber()
    {
        return this.phoneNumber;
    }

    //*****************************************************************************************************
    
    public String getOffice()
    {
        return this.office;
    }
    
    //*****************************************************************************************************
    
    public void setName(String name)
    {
        this.name = name;
    }
    
    //*****************************************************************************************************
    
    public void setPhoneNumber(String phoneNumber)
    {
        this.phoneNumber = phoneNumber;
    }
    
    //*****************************************************************************************************
    
    public void setOffice(String office)
    {
        this.office = office;
    }
    
    //*****************************************************************************************************
    
    public String toString()
    {
        String output = this.name + ", " + this.phoneNumber + ", " 
                + this.office;
        return output;
    }
    
    //*****************************************************************************************************
    
    Instructor(String name, String phoneNumber, String office)
    {
        this.name = name;
        this.phoneNumber = phoneNumber;
        this.office = office;
    }
    
    //*****************************************************************************************************
    
    Instructor()
    {
        name = " ";
        phoneNumber = " ";
        office = " ";
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