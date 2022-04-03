package classNobject;

public class Phone {

	String name;
	String tel;


	public boolean search(String searchName) {

		if (name.equals(searchName))
			return true;
		else
			return false;
	}

}
