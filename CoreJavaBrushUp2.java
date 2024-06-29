import java.util.ArrayList;

public class CoreJavaBrushUp2 {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		// ArrayList - vector in cpp
		// creates like a java class
		
		ArrayList<String> a = new ArrayList<String>();
		a.add("rahul");
		a.add("shetty");
		a.add("academy");
		a.add("selenium");
		
		System.out.println(a.get(3));
		
		for(int i=0; i<a.size(); i++) {
			System.out.println(a.get(i));
		}
		
		System.out.println("****************");
		
		for(String val : a) {
			System.out.println(val);
		}
		
		System.out.println("****************");
		
		System.out.println(a.contains("selenium"));
		
		

	}

}
