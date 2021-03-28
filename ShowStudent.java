class ShowStudent
{
public static void main (String args[])
{
Student student1 = new Student();
 
student1.setHours(Integer.parseInt(args[0]));
student1.setIDnumber();
student1.setPoints(Integer.parseInt(args[1]));
student1.showIDnumber();
student1.showPoints();
student1.showHours();
System.out.println("The grade point average is " 
+ student1.getGradePoint());
System.out.println(" ");
 
Student student2 = new Student();
student2.setHours(Integer.parseInt(args[2]));
student2.setIDnumber();
student2.setPoints(Integer.parseInt(args[3]));
student2.showIDnumber();
student2.showPoints();
student2.showHours();
System.out.println("The grade point average is " 
+ student2.getGradePoint());
System.out.println(" ");
 
Student student3 = new Student();
student3.setHours(Integer.parseInt(args[4]));
student3.setIDnumber();
student3.setPoints(Integer.parseInt(args[5]));
student3.showIDnumber();
student3.showPoints();
student3.showHours();
System.out.println("The grade point average is " 
+ student3.getGradePoint());
System.out.println(" ");
}
}