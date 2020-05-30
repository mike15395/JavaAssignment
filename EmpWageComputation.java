class EmpWageCalc {

	public void wagecalculation(){

		int num_working_days=20, totalwage=0, total_emphrs=0, max_hours=100,
			total_working_days=0 , maxhrs_month=20;

		while (total_emphrs<max_hours && total_working_days < maxhrs_month)

	 {
			total_working_days++;
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
				total_emphrs +=emphrs;
				wage = wage_per_hour*emphrs;
				System.out.println("Employee wage="+wage);
				totalwage += wage;
		}
			System.out.println("Monthly wage is="+totalwage);

		}

}




class EmpWageComputation{
	public static void main(String[] args){

		System.out.println("Welcome to Employee Wage Computation Program");

		EmpWageCalc obj = new EmpWageCalc();
		obj.wagecalculation();

	}


}
