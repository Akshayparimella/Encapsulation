public class Employee //class name
{
private int Empid; //data member variable initialization integer data type private access specifier
private String Empname; //data member variable initialization String data type private access specifier
private String Empdesignation;//data member variable initialization string data type private access specifier
private double salary;//data member variables  initialization double data type private access specifier
	public int getEmpid() //public access specifier get employee id() get method
	{
	return Empid;
}
public void setEmpid(int empid)//public access specifier get employee id() set method
{
	this.Empid = empid;
}
public String getEmpname() //public access specifier get employee name() get method
{
	return Empname;
}
public void setEmpname(String empname) //public access specifier get employee name() set method
{
	this.Empname = empname;
}
public String getEmpdesignation() //public access specifier get employee designation() get method
{
	return Empdesignation;
}
public void setEmpdesignation(String empdesignation) //public access specifier get employee designation() set method
{
	this.Empdesignation = empdesignation;
}
public double getSalary() //public access specifier get employee salary() get method
{
	return salary;
}
public void setSalary(double salary) //public access specifier get employee salary() set method
{
	this.salary = salary;
}//generate getter and setter methods

}



