package infot;

public class Emp_data {
	
	private int id;
	private String name;
	private int age;
	private String job_roll;
	private String Dept;
	private double salary;
	public int getId() {
		return id;
	}
	public void setId(int id) {
		this.id = id;
	}
	public String getName() {
		return name;
	}
	public void setName(String name) {
		this.name = name;
	}
	public int getAge() {
		return age;
	}
	public void setAge(int age) {
		this.age = age;
	}
	public String getJob_roll() {
		return job_roll;
	}
	public void setJob_roll(String job_roll) {
		this.job_roll = job_roll;
	}
	public String getDept() {
		return Dept;
	}
	public void setDept(String dept) {
		Dept = dept;
	}
	public double getSalary() {
		return salary;
	}
	public void setSalary(double salary) {
		this.salary = salary;
	}
	@Override
	public String toString() {
		return "Emp_data [id=" + id + ", name=" + name + ", age=" + age + ", job_roll=" + job_roll + ", Dept=" + Dept
				+ ", salary=" + salary + "]";
	}
	public Emp_data(int id, String name, int age, String job_roll, String dept, double salary) {
		super();
		this.id = id;
		this.name = name;
		this.age = age;
		this.job_roll = job_roll;
		Dept = dept;
		this.salary = salary;
	}
	
	

}
