package emp;

public class EmployeeDetails {
	private int empId; 
	private String eName;
	private String empMailId;
	private float yearlySalary;
	
	public EmployeeDetails(int empId, String eName,  String empMailId,float yearlySalary) {
		super();
		this.empId = empId;
		this.eName = eName;
		this.empMailId = empMailId;
		this.yearlySalary = yearlySalary;
	}
	
	public int getEmpId() {
		return empId;
	}
	public void setEmpId(int empId) {
		this.empId = empId;
	}
	public String geteName() {
		return eName;
	}
	public void seteName(String eName) {
		this.eName = eName;
	}
	public String getEmpMailId() {
		return empMailId;
	}
	public void setEmpMailId(String empMailId) {
		this.empMailId = empMailId;
	}

	@Override
	public String toString() {
		return "Employee [empId=" + empId + ", eName=" + eName + ",  empMailId=" + empMailId
				+ ", yearlySalary=" + yearlySalary + "]";
	}
	
}
