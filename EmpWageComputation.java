class EmpWageComputation{
	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation Program");
		int empcheck = (int)(Math.random()*10)%3;
		//System.out.println(empcheck);

		int wage_per_hour = 20 , wage=0 , emphrs=0;

		switch (empcheck)
		{
			case 1 :  // FullTime
				emphrs = 8;
				break;
			case 2 :  // PartTime
   			emphrs = 4;
				break;
			default :					// Absent
				emphrs = 0;

		}

			wage = wage_per_hour*emphrs;
			System.out.println("Employee wage="+wage);
	}


}
