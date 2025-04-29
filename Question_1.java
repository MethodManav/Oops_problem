// You are tasked with designing a class Student that stores and displays information about students.

// The class must have the following :

// Attributes :
// name (string) : Stores the name of the student.
// rollNumber (int) : Stores the roll number of the student

// Methods :
// setDetails (String name, int rollNumber) : This method initializes the attributes name and rollNumber with the values provided by the user.
// displayDetails() : This method prints the details of the student in following format (The output consist of two separate lines) :

class Student{
    String name;
    int rollNumber;

    void setDetails(String name,int rollNumber){
        this.name=name;
        this.rollNumber=rollNumber;
    }
    void displayDetails(){
        System.out.println("Name : "+this.name);
        System.out.println("Roll Number : "+this.rollNumber);
    }
}