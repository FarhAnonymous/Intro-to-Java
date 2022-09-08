package Assignments;

import java.util.Scanner;

public class HalfDiamond {

	public static void main(String[] args) {
		Scanner s = new Scanner(System.in);
        int N = s.nextInt();
        if(N==0){
            System.out.println('*');
            System.out.println('*');


        }else{
        int i = 1;
        while(i<=N+1){
            int j = 1;
            System.out.print('*');
            while(j<i){
                System.out.print(j);
                j++;
            }
            int b = j-2;
            while(b>=1){
                System.out.print(b);
                b--;
            }
            if(b+1 ==1){
            System.out.print('*');}

            System.out.println();
            i++;

        }
        int y = N;
        while(y>=1){
            int j = 1;
            System.out.print('*');
            while(j<y){
                System.out.print(j);
                j++;
            }
            int z = j-2;
            while(z>=1){
                System.out.print(z);
                z--;
            }
            if(z+1==1){
            
            System.out.print('*');}
            System.out.println();
            y--;
        }
	}

	}
}
