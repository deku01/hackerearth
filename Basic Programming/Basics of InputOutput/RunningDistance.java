/*
On a distant planet far away from Earth lives a boy named Aman.He loves to run everyday.But his running distance is directly affected 
by how much horlicks his mother mixed in his milk today.If his mother has mixed x grams of horlicks,then Aman will be capable of 
running 100*x meters at most on that day.
Aman's instructor, Mr.Sharma ,is a very strict yet very caring.Everyday he asks Aman to run around a circle of radius r once.
If Aman is able to complete the circle,he would get a toffee.

Note:Take value of pie=22/7.
CONSTRAINTS:
1<=d<105
1<=r<106
1<=x<=104

INPUT:
First line contains d,no. of days Aman goes to his instructor.Next d lines each contain r,radius of circle and x,amount of horlicks.

OUTPUT:
Print total number of toffees Aman would finally have at the end of d days.

SAMPLE INPUT                SAMPLE OUTPUT 
3                           3
3 2
5 2
1 2
*/

import java.util.*;
class RunningDistance{
    public static void main(String args[] ) throws Exception {
        Scanner s = new Scanner(System.in);
        int d = s.nextInt();
        int toffee = 0;
        double r,x,circumference,capacity;
        for(int i=1;i<=d;i++){
            r = s.nextInt();
            x = s.nextInt();
            circumference = 2*22*r/7;
            capacity = 100*x;
            if(capacity>=circumference){
                toffee++;
            }
        }
        System.out.println(toffee);
    }
}
