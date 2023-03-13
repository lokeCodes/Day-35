// https://www.codechef.com/problems/SPEEDTEST
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
		    double dis1 = s.nextInt();
		    double time1 = s.nextInt();
		    double dis2 = s.nextInt();
		    double time2 = s.nextInt();
		    double speed1 = dis1/time1;
		    double speed2 = dis2/time2;
		    if(speed1==speed2){
		        System.out.println("Equal");
		    }else if(speed1>speed2){
		        System.out.println("Alice");
		    }else{
		        System.out.println("Bob");
		    }
		}
	}
}
