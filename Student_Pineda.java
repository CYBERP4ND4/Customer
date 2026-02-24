public class Student_Pineda {
    private int studentNum;
    private String name;
    private String course;
    private int units;
    private double miscellaneous = 11879.60;
    private double tuitionRate;

    public void setStudentNum(int a)
    {
        studentNum = a;
    }
    public int getStudentNum()
    {
        return studentNum;
    }
    public void setName(String a)
    {
        name = a;
    }
    public String getName()
    {
        return name;
    }
    public void setCourse(String a)
    {
        course = a;
    }
    public String getCourse()
    {
        return course;
    }
    public void setUnits(int a)
    {
        units = a;
    }
    public int getUnits()
    {
        return units;
    }
    public double getMiscellaneous()
    {
        return miscellaneous;
    }
    
        
    double tuitionRate()
    {
        if (course.equals("CS")){
            course = "Computer Science";
            tuitionRate = 1400;
        } if (course.equals("EMC")){
            course = "Entertainment and Multimedia Computing";
            tuitionRate = 2000;
        } if (course.equals("NETAD")){
            course = "IT Network Administration";
            tuitionRate = 1600;
        } if (course.equals("WEBDEV")){
            course = "IT Web development";
            tuitionRate = 1500;
        }
        return tuitionRate;  
    }

    double compute()
    {
        double total = (tuitionRate() * units) + miscellaneous;
        return total;    
    }

    void display()
    {
        System.out.println("Student Number: " + studentNum);
        System.out.println("Name: " + name);
        System.out.println("Course: " + course);
        System.out.printf("Rate Per Unit: %.2f", tuitionRate());
        System.out.printf("\nTotal Tuition Fee with Miscellaneous: PHP %.2f", compute());

    }
}
