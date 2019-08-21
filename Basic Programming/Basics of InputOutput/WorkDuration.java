/*
Rahul is a very busy persion he dont wan't to waste his time . He keeps account of duration of each and every work. Now he don't 
even get time to calculate duration of works, So your job is to count the durations for each work and give it to rahul.

Input:
First line will be given by N number of works
Next N line will be given SH,SM,EH and EM  each separated by space(SH=starting hr, SM=starting min, EH=ending hr, EM=ending min)

Output:
N lines with duration HH MM(hours and minutes separated by space)
SAMPLE INPUT: 				SAMPLE OUTPUT: 
2
1 44 2 14					0 30
2 42 8 23					5 41
*/

import java.io.BufferedReader;
import java.io.InputStreamReader;
class WorkDuration{
	public static void main(String args[]) throws Exception{
	BufferedReader br = new BufferedReader(new InputStreamReader(System.in));
  	int N = Integer.parseInt(br.readLine());
	String s[]=br.readLine().split(" ");
	int SH = Integer.parseInt(s[0]);
	int SM = Integer.parseInt(s[1]);
	int EH = Integer.parseInt(s[2]);
	int EM = Integer.parseInt(s[3]);
	int time = (EH*60+EM)-(SH*60+SM);
	int hour = time/60;
	int min = time%60;
	System.out.println(hour+" "+min);
	}
}				
