package assignment;

public class CityCode {

	public String getCityByCode(int code) {
		if (code == 1)
			return "DELHI";
		else if (code == 2)
			return "NOIDA";
		else if (code == 3)
			return "GURGAON";
		else if (code == 4)
			return "BANGALORE";
		else
			return "INVALIDCODE";
	}

	public static void main(String[] args) {
		CityCode cc = new CityCode();
		System.out.println(cc.getCityByCode(2));
		System.out.println(cc.getCityByCode(7));
	}

}
