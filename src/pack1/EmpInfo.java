package pack1;

class EmpInfo1 {

	//default constructor

		int id;
		String name;

	void display() {
		System.out.println(id+" "+name);
		}
	}

	public class EmpInfo {

	public static void main(String[] args) {

		EmpInfo1 emp1=new EmpInfo1();
		EmpInfo1 emp2=new EmpInfo1();

		emp1.display();
		emp2.display();
		}
	}

	