class EmpWageComputation{
	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation Program");
		int empcheck = (int)(Math.random()*10)%3;
		//System.out.println(empcheck);

		int wage_per_hour = 20 , wage=0 , emphrs=0;

		if (empcheck == 1)  // FullTime
			emphrs = 8;
		else if (empcheck == 2)  // PartTime
   		emphrs = 4;
		else								// Absent
			emphrs = 0;

			wage = wage_per_hour*emphrs;
			System.out.println("Employee wage="+wage); 

	}


}
