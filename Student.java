class Student
{
private int IDnumber;
private int hours;
private int points;
private static int lastStudentID;
 
public void setIDnumber()
{
lastStudentID += 1;
IDnumber = lastStudentID;
}
 
public int getIDnumber()
{
return IDnumber;
}
 
public void setHours(int number)
{
hours = number;
}
 
public int getHours()
{
return hours;
}
 
public void setPoints(int number)
{
points = number;
}
 
public int getPoints()
{
return points;
}
 
 
public void showIDnumber()
{
System.out.println("ID Number: " + IDnumber);
}
 
public void showHours()
{
System.out.println("Credit Hours: " + hours);
}
 
public void showPoints()
{
System.out.println("Points Earned: " + points);
}
 
public double getGradePoint()
{
return (double) (points / hours);
}
 
}