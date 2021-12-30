package cs447New;
import java.io.*;
import java.util.*;


public class BattleShip {
	public char[][] charArray;
	public boolean isHit;
	public char printArray[];
	public String s;
	public String NickName;
	public int hitPoints;
	Scanner scan = new Scanner(System.in);
	int[] hitLocation = new int [2];
	String hitLoc;
	
	
	public BattleShip() {
		this.charArray = new char[10][10];
		this.printArray = new char[10];
		this.s="ABCDEFGHIJ";
		this.printArray = s.toCharArray();
		this.hitPoints = 14;
		
		
		for(int sira = 0; sira<10; sira++) {
			
			for (int sutun =0; sutun<10; sutun++) {
				this.charArray[sira][sutun] = '-';
			}
		}
		
		
	}
	
	public void printArray() {
		System.out.println(this.NickName+" 's Ship Placement");
		System.out.print(" ");
		for (int i =0;i<10;i++) {
			System.out.print(" "+this.printArray[i]);
		}
		System.out.println();
		for(int sira = 0; sira<10; sira++) {
			System.out.print(sira);

			for (int sutun =0; sutun<10; sutun++) {
				
				System.out.print(" "+this.charArray[sira][sutun]);
			}
			System.out.println();
		}
		
	}

	
	public void initializeC () {
		Random random = new Random();
		int randomC_SUTUN = random.nextInt(5);
		int randomC_SIRA = random.nextInt(5);
		boolean randomBool = random.nextBoolean();
		if(randomBool == true ) {
			charArray[randomC_SUTUN][randomC_SIRA] = 'C';
			charArray[randomC_SUTUN+1][randomC_SIRA] = 'C';
			charArray[randomC_SUTUN+2][randomC_SIRA] = 'C';
			charArray[randomC_SUTUN+3][randomC_SIRA] = 'C';
			charArray[randomC_SUTUN+4][randomC_SIRA] = 'C';
		}
		else {
			charArray[randomC_SUTUN][randomC_SIRA] = 'C';
			charArray[randomC_SUTUN][randomC_SIRA+1] = 'C';
			charArray[randomC_SUTUN][randomC_SIRA+2] = 'C';
			charArray[randomC_SUTUN][randomC_SIRA+3] = 'C';
			charArray[randomC_SUTUN][randomC_SIRA+4] = 'C';
		}
		
	}
	
	public void initializeB () {
		Random random =new Random();
		int randomB_SUTUN =random.nextInt(6);
		int randomB_SIRA =random.nextInt(6);
		boolean randomBool = random.nextBoolean();
		if(randomBool == true) {
			if(charArray[randomB_SUTUN][randomB_SIRA] == '-'&&charArray[randomB_SUTUN+1][randomB_SIRA] == '-'&&charArray[randomB_SUTUN+2][randomB_SIRA] == '-'
					&&charArray[randomB_SUTUN+3][randomB_SIRA] == '-') {
				charArray[randomB_SUTUN][randomB_SIRA] = 'B';
				charArray[randomB_SUTUN+1][randomB_SIRA] = 'B';
				charArray[randomB_SUTUN+2][randomB_SIRA] = 'B';
				charArray[randomB_SUTUN+3][randomB_SIRA] = 'B';
				
				
			}
			else {
				initializeB ();
			}
			
		}
		else {
			if(charArray[randomB_SUTUN][randomB_SIRA] == '-'&&charArray[randomB_SUTUN][randomB_SIRA+1] == '-'&&charArray[randomB_SUTUN][randomB_SIRA+2] == '-'
					&&charArray[randomB_SUTUN][randomB_SIRA+3] == '-') {
				charArray[randomB_SUTUN][randomB_SIRA] = 'B';
				charArray[randomB_SUTUN][randomB_SIRA+1] = 'B';
				charArray[randomB_SUTUN][randomB_SIRA+2] = 'B';
				charArray[randomB_SUTUN][randomB_SIRA+3] = 'B';
				
				
				
			}
			else {
				initializeB();
			}
		}
	}
	
	
	
	public void initializeS() {
		Random random =new Random();
		int randomB_SUTUN =random.nextInt(7);
		int randomB_SIRA =random.nextInt(7);
		boolean randomBool = random.nextBoolean();
		if(randomBool == true) {
			if(charArray[randomB_SUTUN][randomB_SIRA] == '-'&&charArray[randomB_SUTUN+1][randomB_SIRA] == '-'&&charArray[randomB_SUTUN+2][randomB_SIRA] == '-') {
				charArray[randomB_SUTUN][randomB_SIRA] = 'S';
				charArray[randomB_SUTUN+1][randomB_SIRA] = 'S';
				charArray[randomB_SUTUN+2][randomB_SIRA] = 'S';
				
				
			}
			else {
				initializeS ();
			}
			
		}
		else {
			if(charArray[randomB_SUTUN][randomB_SIRA] == '-'&&charArray[randomB_SUTUN][randomB_SIRA+1] == '-'&&charArray[randomB_SUTUN][randomB_SIRA+2] == '-') {
				charArray[randomB_SUTUN][randomB_SIRA] = 'S';
				charArray[randomB_SUTUN][randomB_SIRA+1] = 'S';
				charArray[randomB_SUTUN][randomB_SIRA+2] = 'S';
				
				
				
			}
			else {
				initializeS();
			}
		}
	}
	
	public void initializeD() {
		Random random =new Random();
		int randomB_SUTUN =random.nextInt(8);
		int randomB_SIRA =random.nextInt(8);
		boolean randomBool = random.nextBoolean();
		if(randomBool == true) {
			if(charArray[randomB_SUTUN][randomB_SIRA] == '-'&&charArray[randomB_SUTUN+1][randomB_SIRA] == '-') {
				charArray[randomB_SUTUN][randomB_SIRA] = 'D';
				charArray[randomB_SUTUN+1][randomB_SIRA] = 'D';
				
				
			}
			else {
				initializeD ();
			}
			
		}
		else {
			if(charArray[randomB_SUTUN][randomB_SIRA] == '-'&&charArray[randomB_SUTUN][randomB_SIRA+1] == '-') {
				charArray[randomB_SUTUN][randomB_SIRA] = 'D';
				charArray[randomB_SUTUN][randomB_SIRA+1] = 'D';
			}
			else {
				initializeD();
			}
		}
	}
	public void initializeShip() {
		initializeC();
		initializeB();
		initializeS();
		initializeD();
	}
	String HitShip(String s) {
		String hitOrMiss;
		
		hitLocation=utilityClass.coordinateConverter(s);
		int y = hitLocation[0];
		int x =hitLocation[1];
		
		if(charArray[x][y] == '-' ||charArray[x][y] =='M'||charArray[x][y] =='H' ) {
			charArray[x][y] = 'M';
			hitOrMiss = "Miss";
			
			
		}
		else if(charArray[x][y] =='H') {
			charArray[x][y]= 'H';
			hitOrMiss ="Miss";
		}
		else{
			charArray[x][y]= 'H';
			hitOrMiss ="Hit";
			this.hitPoints--;
			
		}
		return hitOrMiss;	
		
	}
	void updateHit(String hitMiss,String coords){
		if(hitMiss.equals("Miss")) {
			int[] x = new int[2];
			x = utilityClass.coordinateConverter(coords);
			charArray[x[1]][x[0]] = 'M';
			
			
		}
		else {
			int[] x = new int[2];
			x = utilityClass.coordinateConverter(coords);
			charArray[x[1]][x[0]] = 'H';
			
		}
		
	}
	
	public void setName(String s) {
		this.NickName=s;
	}
	
}