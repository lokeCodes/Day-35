// https://www.codechef.com/problems/CHEFPAGES
// Question Link^^^

import java.util.*;
import java.lang.*;
import java.io.*;

class Codechef
{
	public static void main (String[] args) throws java.lang.Exception
	{
		Scanner s = new Scanner(System.in);
		int p = s.nextInt();
		int c = s.nextInt();
		if(p==0){
		    System.out.println("https://www.codechef.com/practice");
		}else if(c==0){
		    System.out.println("https://www.codechef.com/contests");
		}else {
		    System.out.println("https://discuss.codechef.com");
		}
	}
}
