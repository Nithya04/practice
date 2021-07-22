import java.util.ArrayList;

import org.testng.annotations.Test;

public class JavaConcept {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		ArrayList<String> a=new ArrayList<String>();
		a.add("abgh");
		a.add("nav");
		a.add("aoklj");
		a.add("mkjk");
		 int count=0;
		 for(int i=0;i<a.size();i++) {
			 String actual=a.get(i);
			 if(actual.startsWith("a")) {
				 count++;
			 }
		 }
		 System.out.println(count);
		
	}
	
	@Test
	public void usingStreams() {
		ArrayList<String> a=new ArrayList<String>();
		a.add("abgh");
		a.add("nav");
		a.add("aoklj");
		a.add("mkjk");
		Long l=a.stream().filter(s->s.startsWith("a")).count();
		System.out.println(l);
		
	}

}
