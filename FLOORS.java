// https://www.codechef.com/problems/FLOORS
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
            int res1 = ((x-1)/10)+1;
            int res2 = ((y-1)/10)+1;
            int res = Math.abs(res1-res2);
            System.out.println(res);
		}
	}
}
