package check;
import constants.Constants;

public class Check {
	private static String firstName = "安達";
	private static String lastName = "聖七";
	
	public void printName(String firstName, String lastName){
		System.out.println("printlnメソッド→" + Check.firstName + Check.lastName);
	}

	public static void main(String[] args) {
		Check check = new Check();
		check.printName(Check.firstName, Check.lastName);
		
		Pet pet = new Pet(Constants.CHECK_CLASS_JAVA, Constants.CHECK_CLASS_HOGE);
		pet.introduce();
		
		RobotPet robotpet = new RobotPet(Constants.CHECK_CLASS_R2D2, Constants.CHECK_CLASS_LUKE);
		robotpet.introduce();
	}
}