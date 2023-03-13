// https://www.codechef.com/problems/CRICUP
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int t = s.nextInt();
		while(t-- > 0){
		    int x = s.nextInt();
		    int y = s.nextInt();
		    int d = s.nextInt();
		    int skill = Math.abs(x-y);
		    String res = skill<=d ? "Yes" : "No";
		    System.out.println(res);
		}
	}
}