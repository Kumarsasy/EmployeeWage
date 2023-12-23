import java.util.Random;

public class EmployeeWage {

	public static void main(String[] args) {
		System.out.println("Employee Wage Problem");

		Random random = new Random();
		boolean isPresent = random.nextBoolean();
		if (isPresent) {
			System.out.println("Employee is Present");
		} else {
			System.out.println("Employee is Absent");
		}

		int WagePerHour = 20;
		int FullDayHour = 8;
        int PartTimeHour = 4;
		int DailyWage = WagePerHour*FullDayHour;
		System.out.println("Daily employee wage: " + DailyWage);
		
		int FullTimeDailyWage = WagePerHour*FullDayHour;
        System.out.println("Daily full time employee wage: " + FullTimeDailyWage);
        
        int PartTimeDailyWage = WagePerHour*PartTimeHour;
        System.out.println("Daily full time employee wage: " + PartTimeDailyWage);
	}
}
