package _00_Text_Funkifier;

import java.util.ArrayList;
import java.util.Random;

public class JumbledString extends SpecialString
{
	static Random randy = new Random();
	public JumbledString(String s) {
		super(s);
	}
	
	@Override
	public String funkifyText(String s) {
		System.out.println(s);
		int length = s.length();
		
		String rs = "";
		ArrayList<Integer> placed = new ArrayList<Integer>();
		
		for(int i = 0;i<length;i++) {
			System.out.println(length);
			int random = randy.nextInt(length);
			System.out.println(random);
			if(!placed.contains(random)) {
			rs += s.charAt(random);
			placed.add(random);
			}else {
				i--;
			}
		}
		
		
		return rs;
	}

}
