package StringProgram;
    import java.util.Scanner;
class Percentage
{
 float calculate(int totMarks)
 {
   return (float)totMarks/6;
 }
}
class StudentResult
{
 String generate(float per)
 {
  if(per>=70 && per<70)
  {
   return "Distiction";
  }
  else if (per>=60 && per<70)
  {
   return "FirstClass";
  }
  else if (per>=50 && per<60)
  { 
    return "Second Class";
  }
  else if (per>=35 && per<50)
  {
   return "Third Class";
  }
  else 
  {
   return "bhag madarchod";
  }
 }
}
class CheckBranch
{
 boolean k=false;
 boolean verify(String br)
 {
   switch(br)
   {
     case "CIVIL":k=true;
     break;
     case "EEE":k=true;
     break;
     case "MECH":k=true;
     break;
     case "ECE":k=true;
     break;
     case "CSE":k=true;
     break;
   }
    return k;
 }
}
class DemoMethods6
{
  public static void main(String args[])
  {
    Scanner s = new Scanner(System.in);
    System.out.println("Enter Name");
    String stuName = s.nextLine();
    System.out.println("Enter the StuBranch(CIVIL/EEE/CSE/MECH/ECE/)");
    String stuBranch = s.nextLine();
    CheckBranch cb = new CheckBranch();
    boolean k = cb.verify(stuBranch);
    if(k)
    {
      System.out.println("Enter Roll Number");
      String rollNo = s.nextLine();
      System.out.println("****Enter 6 Sub Marks****");
      int i=1,totM=0;
      while(i<=6)
      { 
        System.out.println("Enter the marks of Sub"+i);
        int sub = s.nextInt();
        if(sub<0 || sub >100)
        {
           System.out.println("Bhak re lode...");
           continue;

        }
        totM = totM+sub;
        i++;
      }
   
     System.out.println("StuName:"+stuName);
     System.out.println("StuBranch:"+stuBranch);
     System.out.println("StuRollNo:"+rollNo);
     System.out.println("TotMarks:"+totM);
     Percentage pr = new Percentage();
     float per = pr.calculate(totM);
     System.out.println("Percentage:"+per);
     StudentResult sr = new StudentResult();
     String res = sr.generate(per);
     System.out.println("Result:"+res);
    }
   else
  {
   System.out.println("Bhosdike sahi  branch daal ...");
  }
 }
}

