class EmpWageComputation{
	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation Program");
		int empcheck = (int)(Math.random()*10)%2;

		int wage_per_hour = 20 , wage=0 , emphrs=0;

		if (empcheck == 1)
			emphrs = 8;
		else
   		emphrs = 0;

			wage = wage_per_hour*emphrs;
			System.out.println("Employee wage="+wage);

	}


}
