package loopstudy;

public class Switchloop {

	public static void main(String[] args) {
    //create-->hyundai company suv
	//verna--->hyundai company car
	//fortuner-->toyoto company suv
	//safari-->tata company suv
	//innova--toyoto company suv
	//swift-->maruti suzuki company car
		String car="fortuner";
		switch (car) {
		case "create":
			System.out.println("hyundai company suv");
			break;
		case "verna":
			System.out.println("hyundai company car");
			break;
		case "fortuner":
				System.out.println("toyoto company suv");
				break;
		case "safari":
				System.out.println("tata company suv");
				break;
		case "innova":
			System.out.println("toyoto company suv");
			break;
		case "swift":
			System.out.println("maruti suzuki company car");
			break;
		
		default:
			System.out.println("enter valid car name");
			break;
		}
	}

}
