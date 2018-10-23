package Test;

public class CheckGetterSetter {

	public static void main(String[] args) {
		// TODO Auto-generated method stub

		
		System.out.println("Sample getter and setter");
		
		GetterAndSetter ob=new GetterAndSetter();
		
		
		ob.setFname("Levin");
		ob.setLname("Sibi");
		ob.setAge(21);
		System.out.println(ob.getFname());
		System.out.println(ob.getLname());
		System.out.println(ob.getAge());
		System.out.println("Finished");
	}

}
