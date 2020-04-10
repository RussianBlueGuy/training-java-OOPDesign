package lesson7;

public class SchoolStaff {
	
	private void makeAnnoucements() {
		System.out.println("made announcements...");
	}
	
	private void takeAttendance() {
		System.out.println("took attendance...");
	}
	
	private void collectPaperwork() {
		System.out.println("collected paperwork...");
	}
	
	private void conductHallwayDuties() {
		System.out.println("conducted hallway duties...");
	}
	
	public void performOtherResponsibilities() {
		makeAnnoucements();
		takeAttendance();
		collectPaperwork();
		conductHallwayDuties();
	}

}
