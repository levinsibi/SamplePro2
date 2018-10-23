package Test;

public class CheckGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		GetterAndSetter ob=new GetterAndSetter();
		ob.setFname("Levin");
		ob.setLname("Sibi");
		ob.setAge(21);
		
		System.out.println(ob.getFname());
		System.out.println(ob.getLname());
		System.out.println(ob.getAge());
	}

}
