package hust.soict.dsai.garbage;

import java.util.Random;

public class ConcatenationInLoops {

	public static void main(String[] args) {
		Random r = new Random(123);
		long start = System.currentTimeMillis(); // tinh thoi gian
		String s = "";
		
		//Xa Dung String bang toan tu +
		for (int i = 0; i< 65536;i++)
			s += r.nextInt(2);
		System.out.println(System.currentTimeMillis() - start);
		
		//Xay dung String bang Stringbuilder
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuilder sd = new StringBuilder();
		for(int i = 0; i< 65536; i++)
			sd.append(r.nextInt(2));
		s = sd.toString();
		System.out.println(System.currentTimeMillis() - start);
		
		//Xay dung String bang Stringbuffer
		r = new Random(123);
		start = System.currentTimeMillis();
		StringBuffer sf = new StringBuffer();
		for(int i = 0; i< 65536; i++)
			sf.append(r.nextInt(2));
		s = sf.toString();
		System.out.println(System.currentTimeMillis() - start);
		
		

	}

}
