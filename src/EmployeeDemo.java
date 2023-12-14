
public class EmployeeDemo
{

	public static void main(String[] args)  
		{
		Employee e=new Employee();
		e.setEmpid(10);
		e.setEmpname("ram");
		e.setEmpdesignation("developer");
		e.setSalary(50000);
		System.out.println(e.getEmpid());
		System.out.println(e.getEmpname());
		System.out.println(e.getEmpdesignation());
		System.out.println(e.getSalary());
		System.out.println(e.getEmpid()+"\t"+e.getEmpname()+"\t"+e.getEmpdesignation()+"\t"+e.getSalary()+"\t");
		}
}
