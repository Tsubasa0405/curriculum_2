package check;

public class Check {

	public static void main(String[] args) {

		String firstName = "吉沼";
		String lastName = "翼";

		System.out.println("printNameメソッド→" + printName(firstName, lastName));

		Pet pet = new Pet("java吉", "hoge");
		pet.introduce();


		RobotPet RobotPet = new RobotPet("R2D2", "ルーク");
		RobotPet.introduce();

	}

	private static String printName(String firstName, String lastName) {
		return (firstName + lastName);
	}


}
