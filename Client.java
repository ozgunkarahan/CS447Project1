package cs447New;
import java.util.*;
import java.io.*;
import java.net.*;
public class Client {
	String host_Name;
	String IP_ADRESS;
	int port;
	Socket socket1;
	BattleShip myBoard;
	BattleShip enemyBoard;
	DataInputStream input;
	DataOutputStream output;
	public Client(String adress, int port) {
		super();
		this.IP_ADRESS = adress;
		this.port = port ;
		myBoard = new BattleShip();
		enemyBoard = new BattleShip();
		myBoard.initializeShip();
		
		
		try {
			this.socket1 = new Socket(this.IP_ADRESS, this.port);
			Scanner scan1 =new Scanner(System.in);
			output = new DataOutputStream(this.socket1.getOutputStream());
			input = new DataInputStream(this.socket1.getInputStream());
			enemyBoard.setName(socket1.getInetAddress().getCanonicalHostName());
			//enemyBoard.NickName=input.readUTF();
			//utilityClass.print("Enter your Nickname");
			//myBoard.NickName = scan1.nextLine();
			//output.writeUTF(myBoard.NickName);
			
			utilityClass.print("Match between You "+ " and "+ host_Name+ "begins.");
		}catch (IOException e) {
			System.out.println(e);
		}
		
		try {
			while(myBoard.hitPoints>0 && enemyBoard.hitPoints>0) {
				System.out.println("ENTER YOUR MOVE");
				Scanner scan =new Scanner(System.in);
				
				String move=scan.nextLine();
				output.writeUTF(move);
				String HitOrMiss = input.readUTF();
				enemyBoard.updateHit(HitOrMiss, move);
				move = input.readUTF();
				HitOrMiss=myBoard.HitShip(move);
				output.writeUTF(HitOrMiss);
				myBoard.printArray();
				enemyBoard.printArray();
				
				
				
				
			}
			
			
			
			
			
		}
		catch(IOException e){
			e.printStackTrace();
			
		}
	}
}