//GamblingGame.java / Quiz04 (p.190 - Bonus1) / 2017-05-30 KST
package quiz;

import java.util.Scanner;

class Player {
	private String name;
	public Player(String name) { this.name = name; }
	String getName() { return name; }
}
public class GamblingGame {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		Player [] p = new Player[2];
		for(int i=0; i<p.length; i++) {
			System.out.print("선수 이름 입력 >>");
			p[i] = new Player(scanner.next());
		}
		int n=0;
		while(true) {
			System.out.print(p[n].getName() + " <Enter 외 아무거나 치세요>");
			scanner.next();
			int [] val = new int [3];
			for(int i=0; i<val.length; i++) {
				val[i] = (int)(Math.random()*3);
				System.out.print(val[i] + "\t");
			}
			System.out.println();
			if(val[0] == val[1] && val[1] == val[2]) {
				System.out.println(p[n].getName() + "이 승리하였습니다.");
				break;
			}
			n++;
			n = n%2;
		}
		
		scanner.close();
	}
}