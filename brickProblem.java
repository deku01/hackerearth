/*Patlu and Motu works in a building construction, they have to put some number of bricks N from one place to another, and started doing their work. 
They decided , they end up with a fun challenge who will put the last brick.
They to follow a simple rule, In the i'th round, Patlu puts i bricks whereas Motu puts ix2 bricks.
There are only N bricks, you need to help find the challenge result to find who put the last brick.
Explanation
Sample Explanation:

13 bricks are there :

Patlu Motu

1 2

2 4

3 1 ( Only 1 remains)

Hence, Motu puts the last one.
*/


import java.util.*;
class brickProblem{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);
		int N = sc.nextInt();
		int patluBricks=0;
        int motuBricks=0;
        for(int i=1;i<=N;i++){
            if(motuBricks<N){
                patluBricks = i + motuBricks; 
            }
            else{
                System.out.println("Motu");
                break;
            }
            if(patluBricks<N){
                motuBricks = (i*2) + patluBricks;
            }
            else{
                System.out.println("Patlu");
                break;
            }
		}
	}
}
				
				
