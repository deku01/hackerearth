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
				